
<template xmlns:v-bind="http://www.w3.org/1999/xhtml" xmlns:v-on="http://www.w3.org/1999/xhtml">
    <div class="wrapper">
        <headerContainer reservation="current" gtagSend="reservation"></headerContainer>
        <div class="container reservationPage">

            <template v-if="disablePublicTourPopup == true && selectAvailType == 'BeerWalk'">
                <div class="layerPopupWrap">
                    <div class="layerPopupBackground"></div>
                    <div class="layerPopupScroll">
                        <div class="layerPopup">
                            <span class="closeButton"v-on:click="onClosePopup($event)"><img class="clip" v-bind:src="config.urlCdn + '/images/reservation/img_button_close.png'" alt=''/></span>
                            <div class="layerPopupHighlight">NEW 양조장 프로그램</div>
                            <div class="agreeBox dailyNoShowing">
                                <label class="checkboxAgree"><input type="checkbox"> <span></span>하루 동안 다시 열람하지 않습니다.</label>
                            </div>
                            <div class="title">비어 사이언스 클래스 EVENT</div>
                            <div class="subTitle"><strong>새로운 양조장 프로그램</strong>도 체험하고 <strong>특별한 선물</strong>도 받아가세요</div>
                            <div class="centerBox">
                                <img class="popupContentImage" v-bind:src="config.urlCdn + '/images/reservation/popup/public/img_reservation_publicTour_popup_01.jpg'"/>
                            </div>
                            <table class="tourTable type2">
                                <colgroup>
                                    <col width="30%">
                                    <col width="*">
                                </colgroup>
                                <tbody>
                                <tr>
                                    <th>기간</th>
                                    <td>~2월 23일(일) 까지</td>
                                </tr>
                                <tr>
                                    <th>대상</th>
                                    <td>‘Beer & Activity’ 비어 사이언스 클래스 신청자</td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="buttonBox">
                                <a href="/reservation?reserveType=activity" class="reservationButton">신청하기</a>
                            </div>
                            <div class="hiddenContentBox">
                                <div class="subTitle textAlignLeft"><strong>비어 사이언스 클래스란?</strong></div>
                                <div class="desc textAlignLeft colorBlack">맥주의 맛에 대한 투어 핵심과 비교 체험을 한번에 할 수 있는 속성 과정</div>
                                <div class="centerBox">
                                    <img class="popupContentImage" v-bind:src="config.urlCdn + '/images/reservation/popup/public/img_reservation_publicTour_popup_02.jpg'"/>
                                </div>
                                <div class="desc textAlignLeft colorBlack mt10">
                                    병과 캔의 맥주 맛은 다르다! Yes? No?<br/>
                                    맥주를 종이컵에 마시면 맛이 없다! Yes? No?<br/>
                                    맥주에 대한 모든 궁금증을 풀어보는 시간! 맥주가 만들어지는 원리부터 마시는 방법까지!<br/>
                                    <br/>
                                    <strong>맥주 박사가 가르쳐주는 쉽고 재미있는 이야기를 통해, 신기한 맥주 여행을 떠나보세요.</strong>
                                </div>
                            </div>
                            <div class="buttonBox">
                                <span class="morePopupContentButton"v-on:click="onMorePopupContent($event)">더보기</span>
                            </div>
                        </div>
                    </div>
                </div>
            </template>

            <template v-if="selectAvailType == 'BeerWalk' && step == 'stepAvail' && activePublicTourAgreementChild == true">
                <div class="layerPopupWrap">
                    <div class="layerPopupBackground"></div>
                    <div class="layerPopupScroll">
                        <div class="layerPopup agreementAttention">
                            <div class="title agreement ico">
                                <img v-bind:src="config.urlCdn + '/images/reservation_step_attention.png'">
                            </div>
                            <div class="title agreement main cyan">꼭 확인해주세요!</div>
                            <div class="title agreement sub">양조장 투어 : 미취학 아동(1-7세) 참여 불가</div>
                            <br/>
                            <div class="desc agreement fontSize16 colorBlack mt10">
                                투어를 이용하시는 많은 고객분들의 원활한 이용을 위해<br>
                                7세 이하의 유아 및 아동은 양조장 투어 참여가<br>
                                불가능함을 알려드립니다. 예약 시 참고 부탁드립니다.
                            </div>
                            <br/>
                            <div class="desc agreement fontSize16 colorBlack mt10">
                                ※ 공지 미확인을 이유로, 현장 방문 시 아이 동반 입장 요구 및 환불은 불가능합니다.<br/>
                                ※ 보호자 필수 동반 하에 펍은 자유롭게 입장 가능합니다.
                            </div>
                            <div class="buttonBox">
                                <a href="" class="reservationButton agreement" v-on:click="agreementPublicTourAgreementChild($event)">확인했습니다.</a>
                            </div>
                        </div>
                    </div>
                </div>
            </template>


            <div class="selectClassType">
                <template v-if="selectAvailType != 'OnedayClass'">
                    <h1 class="reservationTitle">제주맥주 양조장</h1>
                    <p class="reservationDesc">한국 첫 글로벌 크래프트 맥주 양조장에서 즐기는 체험형 맥주투어</p>
                    <div class="availTypeTab">
                        <ul class="availTypeUl">
                            <li class="availTypeLi" v-bind:class="{active : (selectClassType == 'publicTour')}">
                                <a href="/reservation?reserveType=public"><span>양조장 투어</span></a>
                            </li>
                            <li class="availTypeLi" v-bind:class="{active : (selectClassType == 'beerActivity')}">
                                <a href="/reservation?reserveType=activity"><span>체험 프로그램</span></a>
                            </li>
                        </ul>
                    </div>
                </template>
                <div class="availTypeBox">
                    <template v-if="selectClassType != 'specialTour' && selectClassType != 'spaceRental'">


<!--                        <div class="bannerBox">-->
<!--                            <a class="bannerButton" href="https://www.instagram.com/baroe_official/" target="_blank">-->
<!--                                <img v-bind:src="config.urlCdn + '/images/reservation/banner/img_banner_20201006.png'">-->
<!--                            </a>-->
<!--                        </div>-->


                        <template v-if="selectAvailType == ''">
                            <p class="reservationDesc">
                                양조장에서 맥주와 함께 즐기는 액티비티! 제주에서 잊지 못할 추억을 만들어보세요!
                            </p>
                            <p class="reservationDesc">
                                <span><strong class="colorRed">양조장 방문객들의 안전한 투어 및 체험을 위해</strong></span><br/>
                                <span><strong class="colorRed">마스크 미착용 시 입장을 제한할 수 있습니다.</strong></span><br/>
                                <span><strong class="colorRed">(투어 시 필수 착용, 미착용하여 입장 제한 시 환불 불가)</strong></span>
                            </p>
<!--                            <table class="beerActivityTable">-->
<!--                                <colgroup>-->
<!--                                    <col width="45%">-->
<!--                                    <col width="*">-->
<!--                                </colgroup>-->
<!--                                <tbody>-->
<!--                                <tr>-->
<!--                                    <th>-->
<!--                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_beerActivity_05.jpg'">-->
<!--                                    </th>-->
<!--                                    <td>-->
<!--                                        <h1 class="beerActivityTitle">업 사이클링 캔들 만들기 클래스 – Candle Making Class</h1>-->
<!--                                        <p class="reservationDesc">-->
<!--                                            제주의 향을 담은 에센셜 오일을 직접 조향해<br/>-->
<!--                                            소이왁스 캔들을 직접 만들어보는 시간입니다.<br/>-->
<!--                                            <sub>* 눈으로 보기 힘든 작은 흠집을 가진 전용잔 B품을 활용해 만듭니다.</sub>-->
<!--                                        </p>-->
<!--                                        <p class="reservationDesc">-->
<!--                                            가격 : 1인 당 {{availCategoryPriceInfo.CandleMakingClass}}원 (200ml 캔들 재료비, 시음 포함)<br/>-->
<!--                                            소요시간 : 30분-->
<!--                                        </p>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onSelectAvailType('CandleMakingClass')">예약</button>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onGotoReservationSearch">예약 확인</button>-->
<!--                                    </td>-->
<!--                                </tr>-->
<!--                                </tbody>-->
<!--                            </table>-->
                            <table class="beerActivityTable">
                                <colgroup>
                                    <col width="45%">
                                    <col width="*">
                                </colgroup>
                                <tbody>
                                <tr>
                                    <th>
                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_beerActivity_03_3.jpg'">
                                    </th>
                                    <td>
                                        <h1 class="beerActivityTitle">스트링 아트 - Let’s Get Crafty!</h1>
                                        <p class="reservationDesc">
                                            눈으로 마시는 맥주가 있다?<br/>
                                            감각적인 인테리어 소품을 내 손으로 직접 만들어보며<br/>
                                            몰입해보는 힐링타임.<br/>
                                            낮에는 내 방의 포인트가 되는 입체 그림 액자로<br/>
                                            밤에는 실사이로 새어나오는 은은하게 조명으로 사용하세요.
                                        </p>
                                        <p class="reservationDesc">
                                            가격 : {{availCategoryPriceInfo.StringArt}}원 (재료비 포함)<br/>
                                            소요시간 : 30분
                                        </p>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onSelectAvailType('StringArt')">예약</button>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onGotoReservationSearch">예약 확인</button>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <table class="beerActivityTable">
                                <colgroup>
                                    <col width="45%">
                                    <col width="*">
                                </colgroup>
                                <tbody>
                                <tr>
                                    <th>
                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_beerActivity_01_2.jpg'">
                                    </th>
                                    <td>
                                        <h1 class="beerActivityTitle">나만의 맥주잔 만들기 - Make it Yours!</h1>
                                        <p class="reservationDesc">
                                            세상에 단 하나밖에 없는 나만의 맥주잔을 직접 만들어보는 시간입니다.<br/>
                                            소중한 친구, 연인, 가족에게 이름이 새겨진 특별한 맥주잔을 선물해보세요.
                                        </p>
                                        <p class="reservationDesc">
                                            가격  : {{availCategoryPriceInfo.CreateBeerGlass}}원 (제주맥주 전용잔 1개 포함)<br/>
                                            소요시간 : 30분
                                        </p>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onSelectAvailType('CreateBeerGlass')">예약</button>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onGotoReservationSearch">예약 확인</button>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
<!--                            <table class="beerActivityTable">-->
<!--                                <colgroup>-->
<!--                                    <col width="45%">-->
<!--                                    <col width="*">-->
<!--                                </colgroup>-->
<!--                                <tbody>-->
<!--                                <tr>-->
<!--                                    <th>-->
<!--                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_beerActivity_02_2.jpg'">-->
<!--                                    </th>-->
<!--                                    <td>-->
<!--                                        <h1 class="beerActivityTitle">글래스 테이스팅 클래스 - A Guide to Beer Glasses!</h1>-->
<!--                                        <p class="reservationDesc">-->
<!--                                            잔은 맥주의 맛과 향을 좌우하는 매우 중요한 요소입니다.<br/>-->
<!--                                            비어 도슨트의 안내에 따라 다양한 형태의 잔에 맥주를 마셔보면서<br/>-->
<!--                                            차이를 느껴보고, 맥주 테이스팅 노트를 적어보는 시간을 가져봅니다.<br/>-->
<!--                                            <br/>-->
<!--                                            Tip. 양조장투어와 함께 들으시면 더 알찬 클래스를 즐기실 수 있습니다.-->
<!--                                        </p>-->
<!--                                        <p class="reservationDesc">-->
<!--                                            가격  : {{availCategoryPriceInfo.GlassTasting}}원 (4,400원 상당의 맥주 테이스팅 노트 증정)<br/>-->
<!--                                            소요시간 : 40분 내외<br/>-->
<!--                                            <br/>-->
<!--                                            ※ 미성년자는 신청이 불가능합니다.-->
<!--                                        </p>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onSelectAvailType('GlassTasting')">예약</button>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onGotoReservationSearch">예약 확인</button>-->
<!--                                    </td>-->
<!--                                </tr>-->
<!--                                </tbody>-->
<!--                            </table>-->
<!--                            <table class="beerActivityTable">-->
<!--                                <colgroup>-->
<!--                                    <col width="45%">-->
<!--                                    <col width="*">-->
<!--                                </colgroup>-->
<!--                                <tbody>-->
<!--                                <tr>-->
<!--                                    <th>-->
<!--                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_beerActivity_04.jpg'">-->
<!--                                    </th>-->
<!--                                    <td>-->
<!--                                        <h1 class="beerActivityTitle">비어 사이언스 클래스 - A Science Story In Beer!</h1>-->
<!--                                        <p class="reservationDesc">-->
<!--                                            <br/>-->
<!--                                            병과 캔의 맥주 맛은 다르다? Yes or No<br/>-->
<!--                                            맥주를 종이컵에 마시면 맛이 없다? Yes or No<br/>-->
<!--                                            <br/>-->
<!--                                            맥주에 대한 모든 궁금증을 풀어보는 시간!<br/>-->
<!--                                            맥주가 만들어지는 원리부터 마시는 방법까지,<br/>-->
<!--                                            맥주 박사가 가르쳐주는 쉽고 재미있는 이야기와 함께 신기한 맥주 여행을 떠나보세요.<br/>-->
<!--                                            <br/>-->
<!--                                            ※ 본 프로그램은 맛에 특화된 투어의 핵심 과정과<br/>-->
<!--                                            비어글래스 테이스팅 클래스를 한번에 체험해 볼 수 있는 속성 과정입니다.<br/>-->
<!--                                            <br/>-->
<!--                                            &lt;!&ndash;가격 : {{availCategoryPriceInfo.BeerScience}}원<br/>&ndash;&gt;-->
<!--                                            &lt;!&ndash;소요시간 : 60분<br/>&ndash;&gt;-->
<!--                                            &lt;!&ndash;운영 : 목, 금, 토, 일 오후 1시&ndash;&gt;-->
<!--                                            운영 : 목, 금, 토, 일 오후 5시 30분<br/>-->
<!--                                            <strong class="colorRed">* 국내 최대 여가 액티비티 플랫폼 '프립' 패키지 상품 오픈.</strong>-->
<!--                                        </p>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onSelectAvailType('BeerScience')">예약</button>-->
<!--                                        <button class="btnSelectBeerActivityAvail typeFloatLeft" v-on:click="onGotoReservationSearch">예약 확인</button>-->
<!--                                        <div style="display: inline-block; width: 100%;">-->
<!--                                            <a href="https://www.frip.co.kr/products/131321" target="_blank" class="btnSelectBeerActivityAvail typeFloatLeft">프립 예약하기</a>-->
<!--                                        </div>-->
<!--                                    </td>-->
<!--                                </tr>-->
<!--                                </tbody>-->
<!--                            </table>-->
                        </template>
                        <template v-if="selectAvailType != ''">
                            <div class="reservationWrap">
                                <div class="stepAuth" v-if="step == 'stepAuth'">
                                    <div class="reservationHeader">
                                        <template v-if="selectAvailType == 'BeerWalk'">
<!--                                            <h2>양조장 투어 <b>예약하기</b></h2>-->
<!--                                            <p class="desc">-->
<!--                                                맥주는 어떻게 만들어 질까요?<br/>-->
<!--                                                라거와 에일의 차이는 뭘까요?<br/>-->
<!--                                                <br/>-->
<!--                                                제주맥주 도슨트들과 함께 제주맥주가 어떻게 만들어 지는지 살펴보면서<br/>-->
<!--                                                '맥주를 알아가는 재미'에 푹 빠져보세요.<br/>-->
<!--                                                <br/>-->
<!--                                                제주의 깨끗한 바다를 바라보며 올레길을 경험하듯이,<br>-->
<!--                                                양조장에선 맥주가 완성되는 과정까지도 즐거운 여정이 될 것입니다.<br/>-->
<!--                                                <br/>-->
<!--                                                가격 : 22,000원 <span class="colorRed">(미취학 아동 참여 불가)</span><br/>-->
<!--                                                소요시간 : 35~40분 내외<br/>-->
<!--                                            </p>-->
<!--                                            <p class="placeData">-->
<!--                                                <span><strong class="colorRed">양조장 방문객들의 안전한 투어 및 체험을 위해</strong></span><br/>-->
<!--                                                <span><strong class="colorRed">마스크 미착용 시 입장을 제한할 수 있습니다.</strong></span><br/>-->
<!--                                                <span><strong class="colorRed">(투어 시 필수 착용, 미착용하여 입장 제한 시 환불 불가)</strong></span>-->
<!--                                            </p>-->
<!--                                            <p class="placeData">-->
<!--                                                <span>양조장 투어는 사전예약제로 운영됩니다.</span><br/>-->
<!--                                                <span>당일예약, 전화예약 불가능합니다.</span><br/>-->
<!--                                                <span>투어 (목-일) 13:00-18:00</span><br/>-->
<!--                                                <br/>-->
<!--&lt;!&ndash;                                                <span>※ 매시 30분 출발 투어 예약은 <a href="https://booking.naver.com/booking/12/bizes/157108?area=plt" target="_blank"><strong>네이버 예약</strong></a>에서 가능</span><br><br/>&ndash;&gt;-->
<!--                                                <span>주소 : 제주시 한림읍 금능농공길 62-11</span>-->
<!--                                                <a href="http://naver.me/GN4yaBD0" target="_blank" class="buttonMap">지도보기</a><br/>-->
<!--                                                <span>문의: 카카오톡 플러스친구 @제주맥주 주식회사</span>-->
<!--                                            </p>-->

                                            <h2>양조장 투어 <b>예약하기</b></h2>
                                            <p class="desc type2">
                                                정원: 10명, 한 그룹 7인 이상 예약 및 입장 불가<br/>
                                                소요시간: 40분 내외<br/>
                                                <strong class="colorCyan">
                                                    가격: {{availCategoryPriceInfo.BeerWalk}}원 (1인)<br/>
                                                    제주맥주 4종 샘플러 (250ML*4) or<br/>
                                                    조릿대차와 굿즈 세트 中 택1 증정
                                                </strong>
                                            </p>
                                            <p class="placeData">
                                                <span>
                                                    * 미취학 아동 참여 불가<br/>
                                                    * 양조장 방문객들의 안전한 투어 및 체험을 위해 마스크 미착용 시 입장을 제한할 수 있습니다.<br/>
                                                    (투어 시 필수 착용, 미착용하여 입장 제한 시 환불 불가
                                                </span>
                                            </p>
                                            <p class="placeData">
                                                <span>양조장 투어는 사전예약제로 운영됩니다.</span><br/>
                                                <span>당일예약, 전화예약 불가능합니다.</span>
                                            </p>
                                        </template>










                                        <template v-if="selectAvailType == 'OnedayClass'">
                                            <div class="stepOnedayClass">
                                                <div class="htmlHeader" v-html="currentVacant.htmlHeader"></div>
                                            </div>
                                            <p class="placeData">
                                                <span><strong class="colorRed">양조장 방문객들의 안전한 투어 및 체험을 위해</strong></span><br/>
                                                <span><strong class="colorRed">마스크 미착용 시 입장을 제한할 수 있습니다.</strong></span><br/>
                                                <span><strong class="colorRed">(투어 시 필수 착용, 미착용하여 입장 제한 시 환불 불가)</strong></span>
                                            </p>
                                            <p class="placeData">
                                                <span>양조장 투어는 사전예약제로 운영됩니다.</span><br/>
                                                <span>당일예약, 전화예약 불가능합니다.</span><br/>
                                                <span>투어 (목-일) 13:00-18:00</span><br/>
                                                <br/>
                                                <!--                                                <span>※ 매시 30분 출발 투어 예약은 <a href="https://booking.naver.com/booking/12/bizes/157108?area=plt" target="_blank"><strong>네이버 예약</strong></a>에서 가능</span><br><br/>-->
                                                <span>주소 : 제주시 한림읍 금능농공길 62-11</span>
                                                <a href="http://naver.me/GN4yaBD0" target="_blank" class="buttonMap">지도보기</a><br/>
                                                <span>문의: 카카오톡 플러스친구 @제주맥주 주식회사</span>
                                            </p>
                                        </template>
                                        <template v-if="selectAvailType == 'OnedayClass'">
                                            <div class="htmlAttention bgGray" v-if="selectAvailType == 'OnedayClass'" v-html="currentVacant.htmlAttention"></div>
                                        </template>











                                        <template v-if="selectAvailType != 'OnedayClass'">
                                            <div class="htmlAttention bgGray">
                                                <attention20200807 v-if="selectAvailType == 'BeerWalk'"/>
                                                <attentionBeerActivity v-if="selectAvailType == 'CreateBeerGlass'
                                                    || selectAvailType == 'GlassTasting'
                                                    || selectAvailType == 'StringArt'
                                                    || selectAvailType == 'BeerScience'
                                                    || selectAvailType == 'CandleMakingClass'
                                                "/>
                                            </div>
                                        </template>

                                        <template v-if="selectAvailType == 'BeerWalk' || selectAvailType == 'OnedayClass'">
                                            <div class="htmlAttention mt25">
                                                <div class="agreeBox">
                                                    <label class="checkboxAgree"><input type="checkbox" v-model="formReserve.agreementNoticePublicTour">
                                                        <span></span>양조장 투어 유의사항을 확인하였습니다.</label>
                                                </div>
                                            </div>
                                        </template>
                                    </div>
                                    <div class="reservationContent">
                                        <template v-if="selectAvailType == 'BeerWalk'">
                                            <button class="buttonCyanBg small" @click="onGotoAvail">예약</button>
                                            <button class="buttonCyanBg small" @click="onGotoReservationSearch">예약 확인</button>
                                        </template>
                                        <!--<template v-if="selectAvailType == 'CreateBeerGlass'">-->
                                            <!--<button class="buttonCyanBg" @click="onGotoAvail">Beer & Activity 예약</button>-->
                                            <!--<button class="buttonCyanBg" @click="onGotoReservationSearch">Beer & Activity 예약 확인</button>-->
                                        <!--</template>-->
                                        <!--<template v-if="selectAvailType == 'GlassTasting'">-->
                                            <!--<button class="buttonCyanBg" @click="onGotoAvail">Glass Tasting 예약</button>-->
                                            <!--<button class="buttonCyanBg" @click="onGotoReservationSearch">Glass Tasting 예약 확인</button>-->
                                        <!--</template>-->
                                        <!--<template v-if="selectAvailType == 'StringArt'">-->
                                            <!--<button class="buttonCyanBg" @click="onGotoAvail">String Art 예약</button>-->
                                            <!--<button class="buttonCyanBg" @click="onGotoReservationSearch">String Art 예약 확인</button>-->
                                        <!--</template>-->
                                        <template v-if="selectAvailType == 'OnedayClass'">
                                            <button class="buttonCyanBg" @click="onGotoReservationOnedayClass">원데이 클래스 예약</button>
                                            <button class="buttonCyanBg" @click="onGotoReservationSearch">원데이 클래스 예약 확인</button>
                                        </template>
                                    </div>
                                </div>
                                <div class="stepAvail" v-if="step == 'stepAvail'">
                                    <div class="reservationHeader">
                                        <h2>
                                            <span class="blueSquareNumber">01</span>
                                            <template v-if="selectAvailType == 'BeerWalk'">양조장 투어 </template>
                                            <template v-if="selectAvailType == 'CreateBeerGlass'">나만의 맥주잔 만들기 </template>
                                            <template v-if="selectAvailType == 'GlassTasting'">글래스 테이스팅 클래스 </template>
                                            <template v-if="selectAvailType == 'StringArt'">스트링아트로 맥주소품 만들기 </template>
                                            <template v-if="selectAvailType == 'BeerScience'">비어 사이언스 클래스 </template>
                                            <template v-if="selectAvailType == 'CandleMakingClass'">업사이클링 캔들만들기 클래스 </template>
                                            방문일 선택하기
                                        </h2>
                                        <p class="desc">
                                            <template v-if="selectAvailType == 'BeerWalk'">양조장 투어는 </template>
                                            <template v-if="selectAvailType == 'CreateBeerGlass'">나만의 맥주잔 만들기는 </template>
                                            <template v-if="selectAvailType == 'GlassTasting'">글래스 테이스팅 클래스는 </template>
                                            <template v-if="selectAvailType == 'StringArt'">스트링아트로 맥주소품 만들기는 </template>
                                            <template v-if="selectAvailType == 'BeerScience'">비어 사이언스 클래스는 </template>
                                            <template v-if="selectAvailType == 'BeerScience'">업사이클링 캔들만들기 클래스는 </template>
                                            사전예약제로 운영됩니다.<br/>원하는 방문일과 시간을 선택해주세요.</p>
                                    </div>
                                    <div class="reservationContent">
                                        <table class="tableAvailChoice">
                                            <thead>
                                            <tr>
                                                <th>일자 선택</th>
                                                <th>시간 선택</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td class="colDate">
                                                    <datePicker format="yyyy-MM-dd" name="reservationDate" language="ko" inline="true" :disabled="reserveDate.disabled" :highlighted="reserveDate.highlighted" v-model="reserveDate.date" v-on:changedMonth="changedMonth" v-on:selected="dateSelected"></datePicker>
                                                    <br/>
                                                    <ul class="refundRule">
                                                        <li><b>코로나로 인한 사회적 거리두기 단계 격상으로 임시휴무 중입니다.<br/>휴업기간 중 예약과 방문 모두 불가능합니다.</b></li>
                                                        <li><b>당일 예약 불가</b></li>
                                                        <li>
                                                            <b>이용일 기준 1~3일내</b><br/> 환불 : 50% 수수료 발생 / 날짜 변경 : 가능</li>
                                                        <li>
                                                            <div>
                                                                <b>당일</b><br/>취소/환불/날짜 변경 : 모두 불가
                                                            </div>
                                                            <template v-if="selectAvailType == 'BeerWalk'">
                                                                <div>
                                                                    회차 당 정원 15명<br/>
                                                                    투어 정원 조정 불가<br/>
                                                                    (예: 1명 예약 가능 시, 전화 문의 통해 2명 예약 불가능)
                                                                </div>
                                                            </template>
                                                        </li>
                                                    </ul>

                                                </td>
                                                <td class="colTime">
                                                    <div v-if="reserveDate.date == ''">날짜를 선택해주세요.</div>
                                                    <table class="tableAvailListTime" v-if="reserveDate.date != ''">
                                                        <colgroup>
                                                            <col style="width:auto">
                                                            <col style="width:auto">
                                                            <col style="width:auto">
                                                        </colgroup>
                                                        <tbody>
                                                        <tr v-for="time in currentVacant.listTime" v-bind:key="time.availTime">
                                                            <th class="visitTime">{{time.availTime.substr(0, 5)}}</th>
                                                            <td>{{time.capacity - time.reserved}}명 예약 가능</td>
                                                            <td>
                                                                <button type="button" class="btnChoice" :disabled="Number(time.capacity) <= Number(time.reserved)" v-on:click="_ => onSelectTime(time)">선택</button>
                                                            </td>
                                                        </tr>
                                                        </tbody>
                                                    </table>
                                                </td>
                                            </tr>
                                            </tbody>

                                        </table>
                                    </div>
                                </div>
                                <div class="stepReservation" v-if="step == 'stepReservation'">
                                    <div class="reservationHeader">
                                        <h2>
                                            <span class="blueSquareNumber">02</span>신청자 정보입력하기</h2>
                                        <p class="desc">{{currentVacant.title}} 예약에 필요한 정보를 입력해주세요.<br/>기입하신 이메일로 신청완료 메일이 발송됩니다</p>
                                    </div>
                                    <div class="reservationContent">
                                        <div class="agreeBox">
                                            <privacyPolicy/>
                                            <label class="checkboxAgree"><input type="checkbox" v-model="formReserve.agreement">
                                                <span></span>개인정보 수집 및 사용에 동의합니다.</label>
                                        </div>

                                        <table class="tableReservationForm">
                                            <colgroup>
                                                <col style="width:78px">
                                                <col style="width:auto">
                                            </colgroup>
                                            <tr>
                                                <th>신청자명</th>
                                                <td><input name="name" type="text" v-model="formReserve.name" maxlength="50">
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>이메일주소</th>
                                                <td>
                                                    <input type="email" name="email" v-model="formReserve.email" maxlength="100" placeholder="예시. jejubeer@jejubeer.co.kr">
                                                    <p>입력하신 이메일과 비밀번호는<br/>신청정보 수정/취소 시 ID와 비밀번호로 사용</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>비밀번호</th>
                                                <td><input type="password" v-model="formReserve.authcode1" maxlength="15" placeholder="4자리 이상">
                                                    <input type="password" v-model="formReserve.authcode2" maxlength="15" placeholder="비밀번호 확인">
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>연락처</th>
                                                <td>
                                                    <input type="tel" name="telephone" v-model="formReserve.telephone" v-on:blur="onBlurTelephone('normal')" maxlength="15" placeholder="전화번호">
                                                    <p><b>입력하신 연락처가 정확한지 다시 한번 확인해주세요.<br/>연락이 안될 시 예약이 취소 될 수 있습니다.</b></p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>방문인원</th>
                                                <td>
                                                    <template v-if="selectAvailType == 'GlassTasting'">
                                                        <input type="text" v-model="formReserve.number1" class="w49">
                                                        <p>미성년자 신청 불가</p>
                                                    </template>
                                                    <template v-else>
                                                        <input type="text" v-model="formReserve.number1" class="w49" placeholder="8세 이상 방문 인원">
                                                        <p>19세미만 방문자는 보호자가 필수 동반해야 합니다.</p>
                                                    </template>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>방문일시</th>
                                                <td>
                                                    <span class="visitDate">{{formReserve.reserveTimeDisplay}}</span>
                                                    <button type="button" class="buttonChangeReserveTime" v-on:click="onChangeReserveTime"  v-if="availSeq == ''">변경</button>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>요청사항</th>
                                                <td>
                                                    <textarea cols="50" rows="5" title="요청사항을 입력해주세요." v-model="formReserve.comment"></textarea>
                                                    <template v-if="selectAvailType == 'BeerWalk'">
                                                        <p>미취학 아동 투어 참여 불가</p>
                                                    </template>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>결제수단</th>
                                                <td>
                                                    <label><input type="radio" name="paymentType" v-model="formReserve.paymentType" value="CARD">신용카드</label>
                                                    <label><input type="radio" name="paymentType" v-model="formReserve.paymentType" value="DIRECT_BANK">실시간계좌이체</label>
                                                    <p><b>현대카드는 사용하실 수 없습니다.<br>다른 카드사나 계좌이체를 이용해주세요.</b></p>
                                                    <!--
                                                        <?php if (ENVIRONMENT == 'testing' || ENVIRONMENT == 'development') { ?>
                                                        <?php } ?>
                                                        <label><input type="radio" name="paymentType" value="V_BANK">가상계좌</label>
                                                            <label><input type="radio" name="paymentType" value="E_WALLET">전자지갑</label>
                                                            -->
                                                </td>
                                            </tr>
                                            <template v-if="showCouponField">
                                                <tr>
                                                    <th>쿠폰</th>
                                                    <td>
                                                        <input type="text" name="couponCode" v-model="formReserve.couponCode" v-on:keypress="onChangeCouponCode">
                                                        <button type="button" class="buttonCheckCouponCode" v-on:click="onCheckCouponCode">쿠폰 확인</button><br/>
                                                        <p>쿠폰이 있을 경우 쿠폰에 표시된 코드를 입력해 주세요.</p>
                                                        <template v-if="formReserve.couponCheckYN === 'Y'">
                                                            <p>입력하신 쿠폰은 {{couponDiscountRate}}% 할인 쿠폰 입니다.</p>
                                                        </template>
                                                    </td>
                                                </tr>
                                            </template>
                                            <tr>
                                                <th>환불규정</th>
                                                <td>
                                                    <ul class="refundRule">
                                                        <li>
                                                            <b>이용일 기준 1~3일내</b><br/> 환불 : 50% 수수료 발생 / 날짜 변경 : 가능</li>
                                                        <li>
                                                            <div>
                                                                <b>당일</b><br/>취소/환불/날짜 변경 : 모두 불가
                                                            </div>
                                                            <template v-if="selectAvailType == 'BeerWalk'">
                                                                <div>
                                                                    회차 당 정원 15명<br/>
                                                                    투어 정원 조정 불가<br/>
                                                                    (예: 1명 예약 가능 시, 전화 문의 통해 2명 예약 불가능)
                                                                </div>
                                                            </template>
                                                        </li>
                                                    </ul>
                                                    <label><input type="radio" name="refundRuleAgreement" v-model="formReserve.refundRuleAgreement" value="AGREE">동의</label>
                                                    <label><input type="radio" name="refundRuleAgreement" v-model="formReserve.refundRuleAgreement" value="NOT_AGREE">동의하지 않음</label>
                                                </td>
                                            </tr>
                                        </table>
                                        <div class="btnArea">
                                            <button type="button" class="jbButtonWhite">취소</button>
                                            <button type="button" class="jbButtonCyan" v-on:click="formReserveSubmit">예약신청</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <form id="inicisStdWebPay" name="formInipay" method="POST">
                                <input type="hidden" name="version" value="" />
                                <input type="hidden" name="mid" value="" />
                                <input type="hidden" name="goodname" value="" />
                                <input type="hidden" name="oid" value="" />
                                <input type="hidden" name="price" value="" />
                                <input type="hidden" name="currency" value="" />
                                <input type="hidden" name="buyername" value="" />
                                <input type="hidden" name="buyertel" value="" />
                                <input type="hidden" name="buyeremail" value="" />
                                <input type="hidden" name="timestamp" value="" />
                                <input type="hidden" name="signature" value="" />
                                <input type="hidden" name="returnUrl" value="" />
                                <input type="hidden" name="mKey" value="" />
                                <input type="hidden" name="gopaymethod" value="" />
                                <input type="hidden" name="offerPeriod" value="" />
                                <input type="hidden" name="acceptmethod" value="" />
                                <input type="hidden" name="languageView" value="" />
                                <input type="hidden" name="charset" value="" />
                                <input type="hidden" name="payViewType" value="" />
                                <input type="hidden" name="closeUrl" value="" />
                                <input type="hidden" name="popupUrl" value="" />
                                <input type="hidden" name="nointerest" value="" />
                                <input type="hidden" name="quotabase" value="" />
                                <input type="hidden" name="vbankRegNo" value="" />
                                <input type="hidden" name="merchantData" value="" />
                            </form>
                            <form action="/reserve/couponAuthResponse" name="formCouponReserve" method="GET">
                                <input type="hidden" name="orderId" value="">
                            </form>
                        </template>
                    </template>
                    <template v-if="selectClassType == 'specialTour'">
                        <div v-if="selectAvailType == ''">
                            <table class="beerActivityTable">
                                <colgroup>
                                    <col width="45%">
                                    <col width="*">
                                </colgroup>
                                <tbody>
                                <tr>
                                    <th>
                                        <img v-bind:src="config.urlCdn + '/images/reservation/img_specialTour_01.jpg'">
                                    </th>
                                    <td>
                                        <h1 class="beerActivityTitle">단체 문의</h1>
                                        <p class="reservationDesc">
                                            <strong class="colorGreen">따로, 또 특별하게 양조장을 여행하다!</strong><br/>
                                            <br/>
                                            제주맥주 양조장은 여행사, 기관, 기업, 학교 등 다양한 단체를 위한<br/>맞춤 투어 프로그램을 진행하고 있습니다.<br/>
                                            <br/>
                                            맞춤형 단체 투어에서부터, 다양한 액티비티 프로그램까지!<br/>단체를 위한 특별한 프로그램을 제주맥주 양조장에서 만나보세요.
                                        </p>
                                        <p class="reservationDesc">
                                            문의 : jejumkt@jejubeer.co.kr<br/>
                                            전화 : 064-798-9872
                                        </p>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft typeSmall" v-on:click="onSelectAvailType('SpecialTour')">문의하기</button>
                                        <a v-bind:href="config.urlCdn + '/pdf/reservation/jejubeer_group_tour_20200803.pdf'" target="_blank" class="btnSelectBeerActivityAvail typeFloatLeft typeDownload">단체 투어 소개서</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="reservationWrap" v-if="selectAvailType != ''">
                            <div class="stepReservation" v-if="step == 'stepReservation'">
                                <div class="reservationHeader">
                                    <h2>신청자 정보입력하기</h2>
                                    <p class="desc">단체 상담에 필요한 정보를 입력해주세요.<br/>기입하신 연락처로 담당자가 연락드립니다.</p>
                                </div>
                                <div class="reservationContent">
                                    <div class="agreeBox">
                                        <privacyPolicySpecial/>
                                        <label class="checkboxAgree"><input type="checkbox" v-model="formReserveSpecial.agreement">
                                            <span></span>개인정보 수집 및 사용에 동의합니다.</label>
                                    </div>
                                    <table class="tableReservationForm">
                                        <colgroup>
                                            <col style="width:78px">
                                            <col style="width:auto">
                                        </colgroup>
                                        <tr>
                                            <th>단체명</th>
                                            <td><input name="teamName" type="text" v-model="formReserveSpecial.teamName" maxlength="50"></td>
                                        </tr>
                                        <tr>
                                            <th>프로그램</th>
                                            <td>
                                                <label><input type="radio" name="groupTourProgram" v-model="formReserveSpecial.groupTourProgram" value="publicTour">양조장 투어</label>
                                                <label><input type="radio" name="groupTourProgram" v-model="formReserveSpecial.groupTourProgram" value="specialTour">스페셜 투어</label>
                                                <label><input type="radio" name="groupTourProgram" v-model="formReserveSpecial.groupTourProgram" value="ect">그 외</label>
                                                <a v-bind:href="config.urlCdn + '/pdf/reservation/jejubeer_group_tour_20191118.pdf'" target="_blank" class="btnSelectBeerActivityAvail typeFloatLeft typeDownload">단체 투어 소개서</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>방문날짜</th>
                                            <td>
                                                <datePicker name="visitDate" language="ko" format="yyyy-MM-dd" :disabled="{ to: new Date() }" v-model="formReserveSpecial.visitDate"></datePicker>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>투어시간</th>
                                            <td>
                                                <!--<select class="nativeSelectBox" name="time" id="" v-model="formReserveSpecial.time">-->
                                                    <!--<option value="" selected>시간을 선택해 주세요.</option>-->
                                                    <!--<option value="09">09</option>-->
                                                    <!--<option value="10">10</option>-->
                                                    <!--<option value="11">11</option>-->
                                                    <!--<option value="12">12</option>-->
                                                    <!--<option value="13">13</option>-->
                                                    <!--<option value="14">14</option>-->
                                                    <!--<option value="15">15</option>-->
                                                    <!--<option value="16">16</option>-->
                                                    <!--<option value="17">17</option>-->
                                                    <!--<option value="18">18</option>-->
                                                    <!--<option value="19">19</option>-->
                                                <!--</select> 시-->
                                                <span class="selectTime" v-on:click="onShowGroupTourTime">{{formReserveSpecial.time}}</span>
                                                <div class="selectTimeWrap">
                                                    <div class="selectTimeBox">
                                                        <ul class="selectTimeUl">
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="10:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">10:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="10:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">10:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="11:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">11:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="11:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">11:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="12:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">12:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="12:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">12:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="13:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">13:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="13:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">13:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="14:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">14:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="14:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">14:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="15:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">15:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="15:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">15:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="16:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">16:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="16:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">16:30</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="17:00" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">17:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="17:30" v-on:click="onSelectGroupTourTime('specialTour', $event)" v-model="formReserveSpecial.time">17:30</label></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>방문인원</th>
                                            <td>
                                                <input type="text" name="visitorCount" v-model="formReserveSpecial.visitorCount" class="w49" placeholder="8세 이상 방문 인원"> 명
                                                <p>19세미만 방문자는 보호자가 필수 동반해야 합니다.</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>신청자명</th>
                                            <td><input name="name" type="text" v-model="formReserveSpecial.name" maxlength="50">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>이메일주소</th>
                                            <td>
                                                <input type="email" name="email" v-model="formReserveSpecial.email" maxlength="100" placeholder="예시. jejubeer@jejubeer.co.kr">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>연락처</th>
                                            <td>
                                                <input type="tel" name="telephone" v-model="formReserveSpecial.telephone" v-on:blur="onBlurTelephone('special')" maxlength="15" placeholder="전화번호">
                                                <p><b>입력하신 연락처가 정확한지 다시 한번 확인해주세요.</b></p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>요청사항</th>
                                            <td>
                                                <textarea cols="50" rows="5" title="요청사항을 입력해주세요." v-model="formReserveSpecial.comment"></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">
                                                <p>※ 작성하신 내용은 확정이 아니며, 담당자가 확인 후 직접 연락드릴 예정입니다.</p>
                                            </td>
                                        </tr>
                                    </table>
                                    <div class="btnArea">
                                        <button type="button" class="jbButtonWhite">취소</button>
                                        <button type="button" class="jbButtonCyan" v-on:click="formReserveSpecialSubmit">문의하기</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </template>
                    <template v-if="selectClassType == 'spaceRental'">
                        <div v-if="selectAvailType == ''">
                            <table class="beerActivityTable">
                                <colgroup>
                                    <col width="45%">
                                    <col width="*">
                                </colgroup>
                                <tbody>
                                <tr>
                                    <th>
                                        <!--<img v-bind:src="config.urlCdn + '/images/reservation/img_spaceRental_01.jpg'">-->

                                        <div class="tourInfo0">
                                            <div class="w50 tourSliderWrapper f-right">
                                                <ul class="clipSlide tourSlider">
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental01.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental02.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental03.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental04.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental05.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental06.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental07.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental08.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental09.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental10.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental11.jpg'" alt='2F Tour'/></li>
                                                    <li class="clipWrap"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/full/img_spaceRental12.jpg'" alt='2F Tour'/></li>
                                                </ul>
                                                <div class='sliderController'>
                                                    <div class='tourSlideButton tourSliderPrev'></div>
                                                    <div class='tourSlideButton tourSliderNext'></div>
                                                </div>
                                            </div>
                                            <div class="w50 tourSliderWrapper f-right mt10">
                                                <ul class="clipSlide tourSliderThumb">
                                                    <li class="clipWrap" data-slideIndex="0"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental01.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="1"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental02.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="2"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental03.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="3"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental04.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="4"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental05.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="5"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental06.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="6"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental07.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="7"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental08.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="8"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental09.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="9"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental10.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="10"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental11.jpg'"/></li>
                                                    <li class="clipWrap" data-slideIndex="11"><img v-bind:src="config.urlCdn + '/images/reservation/spaceRental/thumb/img_spaceRental12.jpg'"/></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </th>
                                    <td>
                                        <h1 class="beerActivityTitle">양조장 대관 문의</h1>
                                        <p class="reservationDesc">
                                            <strong class="colorGreen">양조장을 렌탈하다!</strong><br/>
                                            <br/>
                                            워크샵, 연말 파티, 신년회, 소공연, 팬미팅, 단체모임 등 스페셜하고<br/>
                                            프라이빗 한 장소가 필요할 때, 제주맥주 양조장을 렌탈해보세요!<br/>
                                            <br/>
                                            게스트를 위한 신선한 제주맥주와 핵인싸 포토 공간 등<br/>
                                            제주맥주 양조장에서만 느낄 수 있는 특별한 경험과 공간을 제공합니다.
                                        </p>
                                        <p class="reservationDesc">
                                            문의 : jejumkt@jejubeer.co.kr<br/>
                                            전화 : 064-798-9872
                                        </p>
                                        <button class="btnSelectBeerActivityAvail typeFloatLeft typeSmall" v-on:click="onSelectAvailType('SpaceRental')">문의하기</button>
                                        <a v-bind:href="config.urlCdn + '/pdf/reservation/jejubeer_space_rental_20200507.pdf'" target="_blank" class="btnSelectBeerActivityAvail typeFloatLeft typeDownload">대관 소개서</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="reservationWrap" v-if="selectAvailType != ''">
                            <div class="stepReservation" v-if="step == 'stepReservation'">
                                <div class="reservationHeader">
                                    <h2>신청자 정보입력하기</h2>
                                    <p class="desc">제주맥주 양조장 대관 상담에 필요한 정보를 입력해주세요.<br/>기입하신 연락처로 담당자가 연락드립니다.</p>
                                </div>
                                <div class="reservationContent">
                                    <div class="agreeBox">
                                        <privacyPolicySpecial/>
                                        <label class="checkboxAgree"><input type="checkbox" v-model="formReserveSpaceRental.agreement">
                                            <span></span>개인정보 수집 및 사용에 동의합니다.</label>
                                    </div>
                                    <table class="tableReservationForm">
                                        <colgroup>
                                            <col style="width:78px">
                                            <col style="width:auto">
                                        </colgroup>
                                        <tr>
                                            <th>단체명</th>
                                            <td><input name="teamName" type="text" v-model="formReserveSpaceRental.teamName" maxlength="50"></td>
                                        </tr>
                                        <tr>
                                            <th>대관날짜</th>
                                            <td>
                                                <datePicker name="visitDate" language="ko" format="yyyy-MM-dd" :disabled="{ to: new Date() }" v-model="formReserveSpaceRental.visitDate"></datePicker>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>대관시간</th>
                                            <td>
                                                <span class="selectTime" v-on:click="onShowGroupTourTime">
                                                    <div v-if="formReserveSpaceRental.reserveStartTime != '' && formReserveSpaceRental.reserveHour != ''">
                                                        {{formReserveSpaceRental.reserveStartTime}}:00 부터 {{formReserveSpaceRental.reserveHour}}시간
                                                    </div>
                                                </span>
                                                <div class="selectTimeWrap">
                                                    <div class="selectTimeBox">
                                                        <p>시작 시간 선택</p>
                                                        <ul class="selectTimeUl">
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="10" v-on:click="onSelectGroupTourTime('spaceRental', $event)">10:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="11" v-on:click="onSelectGroupTourTime('spaceRental', $event)">11:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="12" v-on:click="onSelectGroupTourTime('spaceRental', $event)">12:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="13" v-on:click="onSelectGroupTourTime('spaceRental', $event)">13:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="14" v-on:click="onSelectGroupTourTime('spaceRental', $event)">14:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="15" v-on:click="onSelectGroupTourTime('spaceRental', $event)">15:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="16" v-on:click="onSelectGroupTourTime('spaceRental', $event)">16:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="17" v-on:click="onSelectGroupTourTime('spaceRental', $event)">17:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="18" v-on:click="onSelectGroupTourTime('spaceRental', $event)">18:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="19" v-on:click="onSelectGroupTourTime('spaceRental', $event)">19:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="20" v-on:click="onSelectGroupTourTime('spaceRental', $event)">20:00</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="time" value="21" v-on:click="onSelectGroupTourTime('spaceRental', $event)">21:00</label></li>
                                                        </ul>
                                                        <hr>
                                                        <p>총 대관 시간 선택</p>
                                                        <ul class="selectTimeUl selectSpaceRentalUl">
                                                            <li class="selectTimeLi"><label><input type="radio" name="hour" value="1" v-on:click="onHideGroupTourTime">1시간</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="hour" value="2" v-on:click="onHideGroupTourTime">2시간</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="hour" value="3" v-on:click="onHideGroupTourTime">3시간</label></li>
                                                            <li class="selectTimeLi"><label><input type="radio" name="hour" value="4" v-on:click="onHideGroupTourTime">4시간</label></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>예약인원</th>
                                            <td>
                                                <input type="text" name="visitorCount" v-model="formReserveSpaceRental.visitorCount" class="w49" placeholder="8세 이상 방문 인원"> 명
                                                <p>19세미만 방문자는 보호자가 필수 동반해야 합니다.</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>신청자명</th>
                                            <td><input name="name" type="text" v-model="formReserveSpaceRental.name" maxlength="50">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>이메일주소</th>
                                            <td>
                                                <input type="email" name="email" v-model="formReserveSpaceRental.email" maxlength="100" placeholder="예시. jejubeer@jejubeer.co.kr">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>연락처</th>
                                            <td>
                                                <input type="tel" name="telephone" v-model="formReserveSpaceRental.telephone" v-on:blur="onBlurTelephone('special')" maxlength="15" placeholder="전화번호">
                                                <p><b>입력하신 연락처가 정확한지 다시 한번 확인해주세요.</b></p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>요청사항</th>
                                            <td>
                                                <textarea cols="50" rows="5" title="요청사항을 입력해주세요." v-model="formReserveSpaceRental.comment"></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">
                                                <p>※ 작성하신 내용은 확정이 아니며, 담당자가 확인 후 직접 연락드릴 예정입니다.</p>
                                            </td>
                                        </tr>
                                    </table>
                                    <div class="btnArea">
                                        <button type="button" class="jbButtonWhite">취소</button>
                                        <button type="button" class="jbButtonCyan" v-on:click="formReserveSpaceRentalSubmit">문의하기</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </template>
                </div>
            </div>
        </div>
        <footerContainer></footerContainer>
    </div>
</template>

<style type="text/less" lang="less">
@import (less) "../vue-common/jb-pc.less";

.reservationPage {
    .jbReservation;

    text-align: center;
    font-size: 14px;

    .bannerBox {
        padding-bottom: 50px;
        .bannerButton {
            width: 500px;
            display: inline-block;
            vertical-align: top;
            img {
                width: 100%;
                vertical-align: top;
            }
        }
    }

    .reservationWrap {
        .jbReservationWrap;
        .reservationHeader {
            padding: 64px 0 10px 0;
            .buttonCyanBg {
                margin: 18px auto 0;
                width: 220px;
            }
            h2 {
                &.descTitle {
                    margin-top: 15px;
                 }
            }
            .colorRed {
                color: #ff0000;
            }
        }
        .reservationContent {
            .buttonCyanBg {
                margin: 0;
                width: 220px;
                &.small {
                    width: 180px;
                }
            }
        }
    }

    .htmlAttention {
        padding: 0 90px;
        text-align: left;
        margin-top: 50px;
        font-size: 12px;
        .agreeBox {
            padding-bottom: 0;
            margin-bottom: 0;
            border-bottom: 0;
        }
        &.bgGray {
            background-color: #f0f0f0;
            padding-top: 20px;
            padding-bottom: 20px;
        }
        &.mt25 {
            margin-top: 25px;
        }
    }

    .stepAvail {
        .tableAvailChoice {
            margin: 0 auto;
        }
        .colDate {
            font-size: 16px;
            vertical-align: top;
        }
        .tableAvailListTime {
            th,
            td {
                padding: 10px 0;
            }
            th {
                width: 65px;
            }
        }
    }

    .stepReservation {
        .agreeBox {
            .privacyPolicy {
                height: 160px;
            }
        }

        .tableReservationForm {
            .jbForm;

            .refundRule {
                li {
                    margin-bottom: 10px;
                }
            }
        }
    }

    .reservationWrap {
        .reservationHeader {
            .desc {
                strong {
                    &.colorCyan {
                        color: #3bc1cd;
                        font-weight: bold;
                    }
                }
                &.type2 {
                    font-weight: bold;
                    font-size: 17px;
                }
            }
            .placeData {
                sub {
                    vertical-align: bottom;
                }
                strong {
                    &.colorRed {
                        color: #ff0000;
                        font-weight: bold;
                    }
                }
            }
        }
    }

    .selectClassType {
        padding-bottom: 100px;
        .reservationTitle {
            font-size: 35px;
            margin-top: 70px;
        }
        .reservationDesc {
            font-size: 15px;
            margin-top: 35px;
            strong {
                &.colorRed {
                    color: #ff0000;
                }
                &.colorGreen {
                    color: #3bc1cd;
                    font-size: 17px;
                }
            }
            &.width80 {
                width: 80%;
                margin: 0 auto;
                border-top: 1px solid #e6e6e6;
                border-bottom: 1px solid #e6e6e6;
                padding: 40px 0;
                margin-top: 40px;
            }
        }
        .availTypeTab {
            border-bottom: 1px solid #e6e6e6;
            text-align: center;
            margin-top: 50px;
            .availTypeUl {
                display: inline-block;
                vertical-align: top;
                .availTypeLi {
                    font-size: 20px;
                    float: left;
                    min-width: 270px;
                    /*cursor: pointer;*/
                    margin-right: 30px;
                    box-sizing: border-box;
                    a {
                        color: #000000;
                    }
                    span {
                        padding:23px 0;
                        display: block;
                    }
                    &.active {
                        font-weight: 700;
                        span {
                            border-bottom: 1px solid #000000;
                        }
                    }
                    &:last-child {
                        margin-right: 0;
                    }
                }
            }
        }
        .availTypeBox {
            padding-top: 50px;
            .btnSelectBeerActivityAvail {
                font-weight: 700;
                font-size: 15px;
                padding: 10px 0;
                width: 150px;
                display: block;
                color: #ffffff;
                background-color: #3bc1cd;
                border: 2px solid #3bc1cd;
                box-sizing: border-box;
                text-align: center;
                margin-top: 20px;
                cursor: pointer;
                line-height: 19px;
                &.typeFloatLeft {
                    float: left;
                    margin-right: 30px;
                }
                &.typeSmall {
                    width: 100px;
                }
                &.typeBig {
                    width: 220px;
                }
                &.typeDownload {
                    background-color: #ffffff;
                    border: 2px solid #3bc1cd;
                    color: #3bc1cd;
                    background-image: url('https://dsfyc8ahox9m2.cloudfront.net/static/images/reservation/img_button_download.jpg');
                    background-repeat: no-repeat;
                    background-size: 42px;
                    background-position: right center;
                    padding-right: 62px;
                    padding-left: 20px;
                    width: auto;
                    text-align: left;
                }
            }
            .beerActivityTable {
                width: 80%;
                display: inline-block;
                margin-top: 50px;
                th {
                    img {
                        width: 100%;
                    }
                    .tourSliderWrapper {
                        &.mt10 {
                            margin-top: 10px;
                        }
                    }
                }
                td {
                    text-align: left;
                    padding-left: 40px;
                    vertical-align: middle;
                    .beerActivityTitle {
                        font-size: 20px;
                    }
                }
            }
            .reservationWrap {
                .stepReservation {
                    .reservationContent {
                        .tableReservationForm {
                            div.selectTimeWrap {
                                position: relative;
                            }
                            .nativeSelectBox, .selectTime {
                                border:1px solid #e9e9e9;
                                z-index: inherit;
                                display: inline-block;
                                border-radius: 0;
                                background: #fff;
                                box-sizing: border-box;
                                vertical-align: top;
                                font-size: 12px;
                                line-height: 28px;
                                height: 28px;
                                padding: 0 10px;
                                color: #000;
                                width: 170px;
                                cursor: pointer;
                            }
                            .selectTimeBox {
                                width: 300px;
                                position: absolute;
                                top: 0;
                                left: 0;
                                background-color: #ffffff;
                                padding: 10px;
                                border: 1px solid #ccc;
                                display: none;
                                .selectTimeUl {
                                    width: 100%;
                                    display: inline-block;
                                    vertical-align: top;
                                    .selectTimeLi {
                                        width: 25%;
                                        float: left;
                                        text-align: center;
                                        font-weight: bold;
                                        label {
                                            cursor: pointer;
                                            position: relative;
                                            box-sizing: border-box;
                                            border: 1px solid transparent;
                                            min-width: inherit;
                                            width: 100%;
                                            input[type=radio] {
                                                position: absolute;
                                                left: 0;
                                                top: 0;
                                                opacity: 0;
                                            }
                                        }
                                        &.disable {
                                            pointer-events: none;
                                            font-weight: normal;
                                        }
                                        &:hover {
                                            label {
                                                color: #3bc1cd;
                                                border: 1px solid #3bc1cd;
                                            }
                                        }
                                        &.active {
                                            pointer-events: none;
                                            label {
                                                color: #ffffff;
                                                border: 1px solid #3bc1cd;
                                                background-color: #3bc1cd;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
</style>

<script>
var Vue = require("vue");
var VueScrollTo = require("vue-scrollto");
Vue.use(VueScrollTo);

Vue.component("datePicker", require("vuejs-datepicker"));
Vue.component("headerContainer", require("./component/headerContainer.vue"));
Vue.component("footerContainer", require("./component/footerContainer.vue"));
Vue.component("privacyPolicy", require("../vue-common/privacyPolicy.vue"));
Vue.component("privacyPolicySpecial", require("../vue-common/privacyPolicySpecial.vue"));
Vue.component("attention", require("../vue-common/attention.vue"));
Vue.component("attention20200807", require("../vue-common/attention_20200807.vue"));
Vue.component("attentionBeerActivity", require("../vue-common/attentionBeerActivity.vue"));

var pageData = {
    availSeq: "",
    selectClassType: "publicTour",
    selectAvailType: "BeerWalk",
    step: "stepAuth",
    calendar: { dateMonth: moment(moment().format("YYYY-MM"), "YYYY-MM") },
    reserveDate: {
        date: "",
        disabled: {
            customPredictor: function(date) {
                var checkDate = moment(date);
                return (
                    null ==
                    pageData.listVacant.find(function(vacant) {
                        return (
                            checkDate.format("YYYYMMDD") ==
                            vacant.date.format("YYYYMMDD")
                        );
                    })
                );
            }
        },
        highlighted: {
            customPredictor: function(date) {
                var checkDate = moment(date);
                return (
                    null !=
                    pageData.listVacant.find(function(vacant) {
                        return (
                            checkDate.format("YYYYMMDD") ==
                            vacant.date.format("YYYYMMDD")
                        );
                    })
                );
            }
        }
    },
    listVacant: [],
    currentVacant: { title:'제주맥주 양조장 투어', listTime: [] },
    formReserve: {
        name: "",
        email: "",
        telephone: "",
        number1: "",
        number: "0",
        comment: "",
        emailDomainPreset: "",
        reserveType: "",
        paymentType: "CARD",
        channel:"PC",
        couponCode: "",
        couponCheckYN: "N",
        teamName: ""
    },
    formReserveSpecial: {
        teamName: "",
        groupTourProgram: "",
        visitDate: "",
        convertVisitDate: "",
        time: "",
        visitorCount: "",
        name: "",
        email: "",
        telephone: "",
        comment: ""
    },
    formReserveSpaceRental: {
        teamName: "",
        visitDate: "",
        convertVisitDate: "",
        reserveStartTime: "",
        reserveHour: "",
        visitorCount: "",
        name: "",
        email: "",
        telephone: "",
        comment: ""
    },
    showCouponField: true,
    couponDiscountRate: 0,
    disablePublicTourPopup: false,
    activePublicTourAgreementChild: false,
    availCategoryPriceInfo: {}
};

var computedData = {};

module.exports = {
    name: "reservation",
    data: function() {
        return pageData;
    },
    computed: function() {
        return computedData;
    },
    mounted: function() {
        moment.locale("ko");
        pageData.availSeq = Vue.jbQueryParam("seq");

        Vue.postJSON(
            "/api/selectAvailCategoryInfo",
            {},
            function(data, status, xhr) {
                if(data) {
                    pageData.availCategoryPriceInfo = data.reduce((map, obj) => {
                        map[obj.availType] = obj.price.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
                        return map;
                    }, {});
                }
            }
        )

        if (pageData.availSeq) {
            if(pageData.availSeq == 4005) {
                alert("2월 원데이 클래스는 3월로 연기되어 현재 신청하실 수 없으며 변경 일자가 확정되는대로 정상 신청하실 수 있습니다.");
                location.href="/";
                return;
            }
            Vue.postJSON(
                "/api/getAvail",
                { availSeq: pageData.availSeq },
                function(data, status, xhr) {
                    if (data.message == "availNotFound") {
                        alert("예약정보를 찾을 수 없습니다.");
                        location.href="/";
                        return;
                    }
                    if(data.message == "full") {
                        alert("클래스 신청이 마감되었습니다.");
                        location.href = "/";
                        return;
                    }

                    pageData.currentVacant = data;

                    var availDate = moment(data.availDate, "YYYY-MM-DD");

                    pageData.formReserve.date = availDate.format("YYYY-MM-DD");
                    pageData.formReserve.time = data.availTime;

                    pageData.formReserve.reserveTimeDisplay =
                        availDate.format("YYYY년 M월 D일") +
                        "/" +
                        data.availTime.substr(0, 5);
                    pageData.selectClassType = "oneday";
                    pageData.selectAvailType = "OnedayClass";
                    pageData.step = "stepAuth";
                    pageData.showCouponField = false;
                }
            );
        }

        let disablePublicTourPopup = Cookies.get("disablePublicTourPopup");
        if(disablePublicTourPopup) {
            pageData.disablePublicTourPopup = disablePublicTourPopup;
        }

        var reserveType = Vue.jbQueryParam("reserveType");
        if(pageData.availSeq === "" && reserveType !== "") {
            // if(reserveType === "public") {
            //     $($('.availTypeLi')[0]).click();
            // } else if(reserveType === "activity") {
            //     $($('.availTypeLi')[1]).click();
            // } else if(reserveType === "group") {
            //     $($('.availTypeLi')[2]).click();
            // }

            if(reserveType === "public") {
                pageData.selectClassType = "publicTour";
                pageData.selectAvailType = "BeerWalk";
                pageData.step = "stepAuth";
            } else if(reserveType === "activity") {
                pageData.selectClassType = "beerActivity";
                pageData.selectAvailType = "";
                pageData.step = "stepAuth";
            } else if(reserveType === "group") {
                pageData.selectClassType = "specialTour";
                pageData.selectAvailType = "";
                pageData.step = "";
            } else if(reserveType === "spaceRental") {
                pageData.selectClassType = "spaceRental";
                pageData.selectAvailType = "";
                pageData.step = "";
            }
            pageData.formReserve.couponCheckYN = "N";
            pageData.formReserve.couponCode = "";
        }

        window.onpopstate = function(event) {
            if(pageData.selectClassType === "publicTour") {
                if(pageData.step === "stepAuth") {
                    history.back();
                } else if(pageData.step === "stepAvail") {
                    pageData.step = "stepAuth";
                } else if(pageData.step === "stepReservation") {
                    pageData.step = "stepAvail";
                    getReservationTimetable(pageData.calendar.dateMonth);
                }
            } else if(pageData.selectClassType === "beerActivity") {
                if(pageData.step === "") {
                    history.back();
                } else if(pageData.step === "stepAuth") {
                    history.back();
                } else if(pageData.step === "stepAvail") {
                    pageData.selectAvailType = "";
                    pageData.step = "stepAuth";
                } else if(pageData.step === "stepReservation") {
                    pageData.step = "stepAvail";
                    getReservationTimetable(pageData.calendar.dateMonth);
                }
            } else if(pageData.selectClassType === "specialTour") {
                if(pageData.step === "") {
                    history.back();
                } else if(pageData.step === "stepAuth") {
                    pageData.selectAvailType = "";
                    pageData.step = "";
                } else if(pageData.step === "stepAvail") {
                    pageData.step = "";
                } else if(pageData.step === "stepReservation") {
                    pageData.selectAvailType = "";
                    pageData.step = "";
                }
            } else if(pageData.selectClassType === "spaceRental") {
                if(pageData.step === "") {
                    history.back();
                } else if(pageData.step === "stepAuth") {
                    pageData.selectAvailType = "";
                    pageData.step = "";
                } else if(pageData.step === "stepAvail") {
                    pageData.step = "";
                } else if(pageData.step === "stepReservation") {
                    pageData.selectAvailType = "";
                    pageData.step = "";
                }
            }
            history.pushState("", "", location.href);
        }

        let realSlider;
        let realThumbSlider;
        if(pageData.selectClassType === "spaceRental") {
            $('.tourInfo0 .tourSlider').imagesLoaded(function () {
                realSlider = $('.tourInfo0 .tourSlider').bxSlider({
                    // pagerCustom: '.bx-pager',
                    prevSelector: '.tourInfo0 .tourSliderPrev',
                    prevText: "<img src='https://dsfyc8ahox9m2.cloudfront.net/static/images/imageSliderPrev.gif' alt='prev' />",
                    nextSelector: '.tourInfo0 .tourSliderNext',
                    nextText: "<img src='https://dsfyc8ahox9m2.cloudfront.net/static/images/imageSliderNext.gif' alt='next' />",
                    auto: false,
                    speed: 700,
                    pause: 6000,
                    loop: false,
                    onSlideBefore: function ($slideElement, oldIndex, newIndex) {
                        $('.tourInfo0 .tourSlideButton').css('pointer-events', 'none');
                        changeRealThumb(realThumbSlider,newIndex);
                    },
                    onSlideAfter: function () {
                        $('.tourInfo0 .tourSlideButton').css('pointer-events', 'auto');
                    }
                });
            });

            $('.tourInfo0 .tourSliderThumb').imagesLoaded(function () {
                realThumbSlider = $('.tourInfo0 .tourSliderThumb').bxSlider({
                    slideWidth: 1000,
                    minSlides: 4,
                    maxSlides: 4,
                    slideMargin: 10,
                    moveSlides: 4,
                    nextText: "",
                    prevText: "",
                    pager: false,
                    loop: false,
                    onSlideBefore: function ($slideElement, oldIndex, newIndex) {
                        $('.tourInfo0 .tourSlideButton').css('pointer-events', 'none');
                    },
                    onSlideAfter: function () {
                        $('.tourInfo0 .tourSlideButton').css('pointer-events', 'auto');
                    }
                });
                realSlider.goToSlide(1);
                realSlider.goToSlide(0);
            });
            $('.tourInfo0 .tourSliderThumb, .tourInfo0 .tourSlider').imagesLoaded(function () {
                linkRealSliders(realSlider,realThumbSlider);
            });
        }
    },
    methods: {
        onClosePopup: function(e) {
            e.preventDefault();
            let $self = $(e.target);
            let $closest = $self.closest(".layerPopup");
            let $agreeBox = $closest.find(".agreeBox");
            if($agreeBox) {
                let $checkbox = $agreeBox.find("input[type=checkbox]");
                if($checkbox.is(":checked")) {
                    Cookies.set("disablePublicTourPopup", false, {expires: 1});
                }
            }

            $('.layerPopupWrap').hide();
        },
        onMorePopupContent: function(e) {
            e.preventDefault();
            let $self = $(e.target);
            let $closest = $self.closest(".layerPopup");
            $closest.find(".hiddenContentBox").show();
        },
        agreementPublicTourAgreementChild: function(e) {
            e.preventDefault();
            pageData.step = "stepReservation";
        },
        onGotoReservationSearch: function() {
            location.href = "/reservationModify";
        },
        onGotoAvail: function() {
            if(pageData.selectAvailType === "BeerWalk") {
                if(!pageData.formReserve.agreementNoticePublicTour) {
                    alert("양조장 투어 유의사항을 확인해 주세요.");
                    return;
                }
            }
            pageData.step = "stepAvail";
            this.$scrollTo(".container");
            history.pushState("", "", location.href);
            getReservationTimetable(pageData.calendar.dateMonth);
        },
        onGotoReservationOnedayClass: function() {
            if(!pageData.formReserve.agreementNoticePublicTour) {
                alert("양조장 투어 유의사항을 확인해 주세요.");
                return;
            }
            pageData.step = "stepReservation";
        },
        changedMonth: function(date) {
            pageData.currentVacant = {};
            getReservationTimetable(moment(date));
        },
        dateSelected: function(date) {
            var checkDate = moment(date);
            var vacantFound = pageData.listVacant.find(function(vacant) {
                return (
                    checkDate.format("YYYYMMDD") ==
                    vacant.date.format("YYYYMMDD")
                );
            });

            if (vacantFound == null) {
                return;
            }
            pageData.currentVacant = vacantFound;
        },
        onSelectTime: function(avail) {
            var checkDate = moment(pageData.reserveDate.date);
            var vacantFound = pageData.listVacant.find(function(vacant) {
                return (
                    checkDate.format("YYYYMMDD") ==
                    vacant.date.format("YYYYMMDD")
                );
            });

            var timeFound = vacantFound.listTime.find(function(timeInList) {
                return avail.availTime == timeInList.availTime;
            });

            // if (timeFound.availTime == "19:00:00")
            //     alert(
            //         "19시 예약 고객님의 경우, 20시 PUB 마감으로 투어 이후에는 PUB 이용에 제한이 있을 수 있으니 가급적 투어 전에 PUB 이용을 권장 드립니다."
            //     );

            if (timeFound.remain == 0) {
                alert("선택하신 날짜와 시간의 예약은 마감되었습니다.");
                return;
            }
            history.pushState("", "", location.href);

            pageData.formReserve.date = vacantFound.date.format("YYYY-MM-DD");
            pageData.formReserve.time = avail.availTime;
            pageData.formReserve.reserveTimeDisplay =
                vacantFound.date.format("YYYY년 M월 D일") +
                "/" +
                avail.availTime.substr(0, 5);

            if(pageData.selectAvailType === "BeerWalk") {
                pageData.activePublicTourAgreementChild = true;
            } else {
                pageData.step = "stepReservation";
            }
        },
        onChangeReserveTime: function() {
            pageData.step = "stepAvail";
            getReservationTimetable(pageData.calendar.dateMonth);
        },
        onBlurTelephone: function(type) {
            var formReserve = pageData.formReserve;
            if(type == "special") {
                formReserve = pageData.formReserveSpecial;
            } else if(type === "spaceRental") {
                formReserve = pageData.formReserveSpaceRental;
            }
            var tel = formReserve.telephone.replace(/\D/g, "");
            if (tel.length < 9) return;

            var telPart = /^(02|\d{3})(\d{3,4})(\d{4})$/.exec(tel);
            if (telPart && telPart.length == 4) {
                formReserve.telephone =
                    telPart[1] + "-" + telPart[2] + "-" + telPart[3];
            }
        },
        formReserveSubmit: function() {
            var formReserve = pageData.formReserve;

            if (!formReserve.agreement) {
                alert("개인정보 수집 및 이용에 동의해 주세요.");
                return;
            }
            formReserve.agreement = "Y";

            var validationFlag = true;

            for (const propName of [
                "name",
                "email",
                "authcode1",
                "authcode2",
                "telephone",
                "number1",
                "date",
                "time"
            ]) {
                const value = formReserve[propName];
                switch (propName) {
                    case "comment":
                        // DOES NOTHING
                        break;
                    default:
                        if ($.trim(value) == "") validationFlag = false;
                        break;
                }
                formReserve[propName] = $.trim(formReserve[propName]);
            }

            if (validationFlag == false) {
                alert("모든 항목을 입력해 주세요.");
                return;
            }

            if (!confirm("예약을 진행하시겠습니까?")) return;

            formReserve.reserveType = pageData.selectAvailType;

            formReserve.number1 = Number(formReserve.number1);
            formReserve.number2 = Number(formReserve.number2);

            if (!/^[a-zA-Z0-9]{4,}$/.test(formReserve.authcode1)) {
                alert(
                    "비밀번호는 숫자와 영문자 조합으로 4자리 이상 사용해야 합니다."
                );
                return;
            }
            if (formReserve.authcode1 != formReserve.authcode2) {
                alert("비밀번호가 일치하지 않습니다.");
                return;
            }
            if (
                !/[0-9a-zA-Z][._0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\.[_0-9a-zA-Z-]+){1,2}$/.test(
                    formReserve.email
                )
            ) {
                alert("이메일주소를 올바르게 입력해 주세요.");
                return;
            }
            if (!/^\d{2,3}-\d{3,4}-\d{4}$/.test(formReserve.telephone)) {
                alert("전화번호를 올바르게 입력해 주세요.");
                return;
            }
            if (!/^(|[1-9]\d*)$/.test(formReserve.number1)) {
                alert("방문인원을 올바르게 입력해 주세요.");
                return;
            }
            if(formReserve.couponCode != "" && formReserve.couponCheckYN == "N") {
                alert("쿠폰 코드를 확인해 주세요.");
                return;
            }
            if (formReserve.refundRuleAgreement != "AGREE") {
                alert("환불규정에 동의하셔야 예약이 가능합니다.");
                return;
            }

            JbLib.postJSON(
                "/api/reserve/",
                { data: JSON.stringify(pageData.formReserve) },
                function(response) {
                    if ("full" == response.message) {
                        alert(
                            "선택하신 날짜와 시간의 방문가능인원을 초과하였습니다."
                        );
                        return;
                    }
                    if ("availNotFound" == response.message) {
                        alert(
                            "예약정보를 찾을 수 없습니다."
                        );
                        return;
                    }
                    if("fail" == response.result) {
                        alert(response.message);
                        return;
                    }

                    if(0 < response.reservePrice) {
                        var $formInipay = $("form[name=formInipay]");
                        var authRequest = response.authRequest;
                        $("[name=version]", $formInipay).val(authRequest.version);
                        $("[name=mid]", $formInipay).val(authRequest.mid);
                        $("[name=goodname]", $formInipay).val(authRequest.goodname);
                        $("[name=oid]", $formInipay).val(authRequest.oid);
                        $("[name=price]", $formInipay).val(authRequest.price);
                        $("[name=currency]", $formInipay).val(authRequest.currency);
                        $("[name=buyername]", $formInipay).val(
                            authRequest.buyername
                        );
                        $("[name=buyertel]", $formInipay).val(authRequest.buyertel);
                        $("[name=buyeremail]", $formInipay).val(
                            authRequest.buyeremail
                        );
                        $("[name=timestamp]", $formInipay).val(
                            authRequest.timestamp
                        );
                        $("[name=signature]", $formInipay).val(
                            authRequest.signature
                        );
                        $("[name=returnUrl]", $formInipay).val(
                            authRequest.returnUrl
                        );
                        $("[name=mKey]", $formInipay).val(authRequest.mKey);
                        $("[name=gopaymethod]", $formInipay).val(
                            authRequest.gopaymethod
                        );
                        $("[name=offerPeriod]", $formInipay).val(
                            authRequest.offerPeriod
                        );
                        $("[name=acceptmethod]", $formInipay).val(
                            authRequest.acceptmethod
                        );
                        $("[name=languageView]", $formInipay).val(
                            authRequest.languageView
                        );
                        $("[name=charset]", $formInipay).val(authRequest.charset);
                        $("[name=payViewType]", $formInipay).val(
                            authRequest.payViewType
                        );
                        $("[name=closeUrl]", $formInipay).val(authRequest.closeUrl);
                        $("[name=popupUrl]", $formInipay).val(authRequest.popupUrl);
                        $("[name=nointerest]", $formInipay).val(
                            authRequest.nointerest
                        );
                        $("[name=quotabase]", $formInipay).val(
                            authRequest.quotabase
                        );
                        $("[name=vbankRegNo]", $formInipay).val(
                            authRequest.vbankRegNo
                        );
                        $("[name=merchantData]", $formInipay).val(
                            authRequest.merchantData
                        );

                        INIStdPay.pay("inicisStdWebPay");
                    } else {
                        var $formCouponReserve = $("form[name=formCouponReserve]");
                        $("[name=orderId]", $formCouponReserve).val(response.orderId);
                        $formCouponReserve.submit();
                    }
                }
            );
        },
        onCheckCouponCode: function() {
            $.ajax({
                url: '/api/checkCoupon/',
                method: 'POST',
                dataType: "json",
                data: {
                    couponCode: pageData.formReserve.couponCode,
                    reserveType: pageData.selectAvailType
                },
                success: function (response) {
                    if(response.result == "fail") {
                        alert(response.message);
                        pageData.formReserve.couponCheckYN = "N";
                        pageData.formReserve.couponCode = "";
                        return;
                    }
                    alert("사용 가능한 쿠폰입니다.\n입력하신 쿠폰은 " + response.discountRate + "% 할인 쿠폰입니다.");
                    pageData.formReserve.couponCheckYN = "Y";
                    pageData.couponDiscountRate = response.discountRate;
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    alert(errorThrown);
                }
            });
        },
        onChangeCouponCode: function() {
            pageData.formReserve.couponCheckYN = "N";
        },
        onClickClass: function(classType) {
            pageData.selectClassType = classType;
            pageData.formReserve.couponCheckYN = "N";
            pageData.formReserve.couponCode = "";
            if(classType === "publicTour") {
                pageData.selectAvailType = "BeerWalk";
                pageData.step = "stepAuth";
            } else if(classType === "beerActivity") {
                pageData.selectAvailType = "";
                pageData.step = "stepAuth";
            } else if(classType === "specialTour") {
                pageData.selectAvailType = "";
                pageData.step = "";
            } else if(classType === "spaceRental") {
                pageData.selectAvailType = "";
                pageData.step = "";
            }
        },
        onSelectAvailType: function(selectAvailType) {
            pageData.selectAvailType = selectAvailType;
            if(selectAvailType === "SpecialTour") {
                pageData.step = "stepReservation";
            } else if(selectAvailType === "SpaceRental") {
                pageData.step = "stepReservation";
            } else {
                pageData.step = "stepAvail";
                this.$scrollTo(".container");
                getReservationTimetable(pageData.calendar.dateMonth);
            }
            history.pushState("", "", location.href);
        },
        formReserveSpecialSubmit: function() {
            var formReserveSpecial = pageData.formReserveSpecial;

            if(!formReserveSpecial.agreement) {
                alert("개인정보 수집 및 이용에 동의해 주세요.");
                return;
            }
            formReserveSpecial.agreement = "Y";

            var validationFlag = true;
            for (const propName of [
                "teamName",
                "visitDate",
                "time",
                "visitorCount",
                "name",
                "telephone"
            ]) {
                const value = formReserveSpecial[propName];
                switch (propName) {
                    case "comment":
                        // DOES NOTHING
                        break;
                    default:
                        if ($.trim(value) == "") {
                            validationFlag = false;
                        }
                        break;
                }
                formReserveSpecial[propName] = $.trim(formReserveSpecial[propName]);
            }

            if (validationFlag == false) {
                alert("모든 항목을 입력해 주세요.");
                return;
            }

            if (!confirm("예약을 진행하시겠습니까?")) return;

            if (
                !/[0-9a-zA-Z][._0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\.[_0-9a-zA-Z-]+){1,2}$/.test(
                    formReserveSpecial.email
                )
            ) {
                alert("이메일주소를 올바르게 입력해 주세요.");
                return;
            }

            if (!/^\d{2,3}-\d{3,4}-\d{4}$/.test(formReserveSpecial.telephone)) {
                alert("전화번호를 올바르게 입력해 주세요.");
                return;
            }

            if (!/^\d{1,}$/.test(formReserveSpecial.visitorCount)) {
                alert("방문인원을 올바르게 입력해 주세요.");
                return;
            }

            pageData.formReserveSpecial.convertVisitDate = moment(pageData.formReserveSpecial.visitDate).format("YYYY-MM-DD");

            JbLib.postJSON(
                "/api/reserveSpecial/",
                { data: JSON.stringify(pageData.formReserveSpecial) },
                function(response) {
                    if(response.mailResult) {
                        alert("스페셜 투어 문의가 완료되었습니다.");
                        location.reload();
                        return;
                    }
                    alert("에러가 발생하였습니다.\r\n지속적으로 에러가 발생할 경우 관리자에게 문의해 주세요.");
                }
            );
        },
        formReserveSpaceRentalSubmit: function() {
            var formReserveSpaceRental = pageData.formReserveSpaceRental;

            if(!formReserveSpaceRental.agreement) {
                alert("개인정보 수집 및 이용에 동의해 주세요.");
                return;
            }
            formReserveSpaceRental.agreement = "Y";

            var validationFlag = true;
            for (const propName of [
                "teamName",
                "visitDate",
                "reserveStartTime",
                "reserveHour",
                "visitorCount",
                "name",
                "telephone"
            ]) {
                const value = formReserveSpaceRental[propName];
                switch (propName) {
                    case "comment":
                        // DOES NOTHING
                        break;
                    default:
                        if ($.trim(value) == "") {
                            validationFlag = false;
                        }
                        break;
                }
                formReserveSpaceRental[propName] = $.trim(formReserveSpaceRental[propName]);
            }

            if (validationFlag == false) {
                alert("모든 항목을 입력해 주세요.");
                return;
            }

            if (!confirm("예약을 진행하시겠습니까?")) return;

            if (
                !/[0-9a-zA-Z][._0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\.[_0-9a-zA-Z-]+){1,2}$/.test(
                    formReserveSpaceRental.email
                )
            ) {
                alert("이메일주소를 올바르게 입력해 주세요.");
                return;
            }

            if (!/^\d{2,3}-\d{3,4}-\d{4}$/.test(formReserveSpaceRental.telephone)) {
                alert("전화번호를 올바르게 입력해 주세요.");
                return;
            }

            if (!/^\d{1,}$/.test(formReserveSpaceRental.visitorCount)) {
                alert("방문인원을 올바르게 입력해 주세요.");
                return;
            }

            pageData.formReserveSpaceRental.convertVisitDate = moment(pageData.formReserveSpaceRental.visitDate).format("YYYY-MM-DD");

            JbLib.postJSON(
                "/api/reserveSpaceRental/",
                { data: JSON.stringify(pageData.formReserveSpaceRental) },
                function(response) {
                    if(response.mailResult) {
                        alert("장소대관 문의가 완료되었습니다.");
                        location.reload();
                        return;
                    }
                    alert("에러가 발생하였습니다.\r\n지속적으로 에러가 발생할 경우 관리자에게 문의해 주세요.");
                }
            );
        },
        onShowGroupTourTime: function() {
            pageData.formReserveSpecial.time = "";
            pageData.formReserveSpaceRental.time = "";
            pageData.formReserveSpaceRental.reserveStartTime = "";
            pageData.formReserveSpaceRental.reserveHour = "";

            $(".selectTimeLi").removeClass("disable").removeClass("active");
            $('.selectSpaceRentalUl').find(".selectTimeLi").addClass("disable");

            $('.selectTimeBox').show();
        },
        onSelectGroupTourTime: function(tourType, e) {
            if(tourType === "specialTour") {
                $('.selectTimeBox').hide();
            } else if(tourType === "spaceRental") {
                let $self = $(e.target);
                let time = $self.val();

                $self.closest(".selectTimeUl").find(".selectTimeLi").removeClass("active");
                $self.closest(".selectTimeLi").addClass("active");
                pageData.formReserveSpaceRental.reserveStartTime = time;

                let $selectSpaceRentalUl = $('.selectSpaceRentalUl');
                $selectSpaceRentalUl.find(".selectTimeLi").removeClass("disable");
                if(time === "20") {
                    $selectSpaceRentalUl.find(".selectTimeLi").last().addClass("disable");
                } else if(time === "21") {
                    $selectSpaceRentalUl.find(".selectTimeLi:nth-child(2)").nextAll().addClass("disable");
                }
            }
        },
        onHideGroupTourTime: function(e) {
            if(pageData.formReserveSpaceRental.reserveStartTime === "") {
                alert("방문 시간을 선택해 주세요.");
                return false;
            }
            let $self = $(e.target);
            let hour = $self.val();
            pageData.formReserveSpaceRental.reserveHour = hour;
            $self.closest(".selectTimeUl").find(".selectTimeLi").removeClass("active");
            $self.closest(".selectTimeLi").addClass("active");

            $('.selectTimeBox').hide();
        }
    }
};

function getReservationTimetable(momentToLoad) {
    var momentMinMonth = moment(moment().format("YYYY-MM"), "YYYY-MM");
    var momentMaxMonth = moment(moment().format("YYYY-MM"), "YYYY-MM").add(
        2,
        "months"
    );
    if (
        !momentMinMonth.isSameOrBefore(momentToLoad) ||
        !momentToLoad.isSameOrBefore(momentMaxMonth)
    ) {
        pageData.calendar.dateMonth = moment(moment().format("YYYY-MM"), "YYYY-MM");
        return;
    }

    pageData.calendar.dateMonth = momentToLoad;

    JbLib.getJSON(
        "/api/getAvailMonth/" +
            pageData.selectAvailType +
            "/" +
            momentToLoad.year() +
            "/" +
            (momentToLoad.month() + 1),
        {},
        function(response) {
            if (response.length == 0) {

                pageData.listVacant = [];
                pageData.currentVacant = { title:'제주맥주 양조장 투어', listTime: [] };
//                pageData.reserveDate.date = "";

                getReservationTimetable(
                    pageData.calendar.dateMonth.add(1, "months")
                );
            } else {
                var listVacant = [];
                $.each(response, function(key, listTime) {
                    listVacant.push({
                        date: moment(key, "YYYY-MM-DD"),
                        dateYYYYMMDD: moment(key, "YYYY-MM-DD").format(
                            "YYYYMMDD"
                        ),
                        monthDay: key.substr(5).replace("-", "."),
                        weekday: moment(key, "YYYY-MM-DD").format("dddd"),
                        listTime: listTime
                    });
                });

                pageData.listVacant = listVacant;
                pageData.currentVacant = listVacant[0];
                pageData.reserveDate.date = pageData.currentVacant.date.toDate();
            }
        }
    );
}
function linkRealSliders(bigS,thumbS){
    $(".tourSliderThumb").on("click","li",function(event){
        event.preventDefault();
        var newIndex=$(this).attr("data-slideIndex");
        bigS.goToSlide(newIndex);
    });
}
function changeRealThumb(slider,newIndex){
    var $thumbS=$(".tourSliderThumb");
    $thumbS.find('.active').removeClass("active");
    $thumbS.find('li[data-slideIndex="'+newIndex+'"]').addClass("active");

    if(slider.getSlideCount() - newIndex > 8) {
        slider.goToSlide(0);
    } else if(slider.getSlideCount() - newIndex > 4) {
        slider.goToSlide(1);
    } else if(slider.getSlideCount() - newIndex > 0) {
        slider.goToSlide(2);
    } else {
        slider.goToSlide(3);
    }

}
</script>


// WEBPACK FOOTER //
// reservation.vue?3db280da