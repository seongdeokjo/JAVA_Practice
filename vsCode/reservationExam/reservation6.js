module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "wrapper"
    }, [_c('headerContainerRenew', {
      attrs: {
        "reservationRenew": "active",
        "gtagSend": "reservation"
      }
    }), _vm._v(" "), _c('div', {
      staticClass: "container reservationRenewPage reserveRenewFormPage"
    }, [_c('div', {
      staticClass: "keyVisualBox"
    }, [(_vm.avail.availType === 'BeerWalk' || _vm.avail.availType === 'FreeTourEvent') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/beerwalk/img_keyvisual.jpg',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'StringArt') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/stringart/img_keyvisual.jpg',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'CreateBeerGlass') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/createbeerglass/img_keyvisual.jpg',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'CandleMakingClass') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/candlemakingclass/img_keyvisual.png',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'GlassTasting') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/glasstasting/img_keyvisual.png',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'PairingTable') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/pairingtable/img_keyvisual.png',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), (_vm.avail.availType === 'BeerTasting') ? [_c('img', {
      staticClass: "imgKeyVisual",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/beertasting/img_keyvisual.png',
        "alt": "key visual"
      }
    })] : _vm._e(), _vm._v(" "), _c('div', {
      staticClass: "keyTable"
    }, [_c('div', {
      staticClass: "keyTd"
    }, [_c('h1', {
      staticClass: "keyVisualTitle"
    }, [_vm._v(_vm._s(_vm.reserveTypeParseKorean(_vm.avail.availType)))])])])], 2), _vm._v(" "), _vm._m(0), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignCenter mt100"
    }, [_c('form', {
      attrs: {
        "name": "formReserve",
        "method": "post",
        "action": "/api/reserve"
      }
    }, [_c('ul', {
      staticClass: "columnUl reserve typeTable textAlignLeft mAuto"
    }, [_c('li', {
      staticClass: "columnLi"
    }, [_c('div', {
      staticClass: "verticalAlignMiddle"
    }, [_c('dl', {
      staticClass: "reserveDl"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("프로그램 명")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.reserveTypeParseKorean(_vm.avail.availType)))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("예약일")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.selectDisplayAvailDateTime))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("인원")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.formReserve.number1) + "명")])]), _vm._v(" "), _c('div', {
      staticClass: "pageLine mt60"
    }), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl full mt60"
    }, [_vm._m(1), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.name),
        expression: "formReserve.name"
      }],
      staticClass: "jejuInputBox full gray",
      attrs: {
        "type": "text",
        "name": "name"
      },
      domProps: {
        "value": (_vm.formReserve.name)
      },
      on: {
        "input": function($event) {
          if ($event.target.composing) { return; }
          _vm.$set(_vm.formReserve, "name", $event.target.value)
        }
      }
    })])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl full mt55"
    }, [_vm._m(2), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('dl', {
      staticClass: "columnDl noPadding"
    }, [_c('dt', {
      staticClass: "columnDt"
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.telephone),
        expression: "formReserve.telephone"
      }],
      staticClass: "jejuInputBox full gray",
      attrs: {
        "type": "tel",
        "name": "phone"
      },
      domProps: {
        "value": (_vm.formReserve.telephone)
      },
      on: {
        "blur": function($event) {
          return _vm.onBlurTelephone(_vm.formReserve)
        },
        "keyup": _vm.onChangeTelephone,
        "input": function($event) {
          if ($event.target.composing) { return; }
          _vm.$set(_vm.formReserve, "telephone", $event.target.value)
        }
      }
    })]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full textLarge",
      class: {
        'disabled': _vm.step !== 'stepAuth'
      },
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onRequestAuthNo($event)
        }
      }
    }, [_vm._v("인증번호 발송")])])])])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl full mt55"
    }, [_vm._m(3), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('dl', {
      staticClass: "columnDl noPadding mt10"
    }, [_c('dt', {
      staticClass: "columnDt"
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formAuth.authNo),
        expression: "formAuth.authNo"
      }],
      staticClass: "jejuInputBox full gray",
      attrs: {
        "type": "number",
        "name": "certCode"
      },
      domProps: {
        "value": (_vm.formAuth.authNo)
      },
      on: {
        "input": function($event) {
          if ($event.target.composing) { return; }
          _vm.$set(_vm.formAuth, "authNo", $event.target.value)
        }
      }
    })]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full textLarge",
      class: {
        'disabled': _vm.step !== 'stepReqAuthNo'
      },
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onCheckAuthNo($event)
        }
      }
    }, [(_vm.step !== 'stepAuthComplete') ? [_c('span', [_vm._v("확인")])] : _vm._e(), _vm._v(" "), (_vm.step === 'stepAuthComplete') ? [_c('span', [_vm._v("인증 성공")])] : _vm._e()], 2)])])])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl full mt55"
    }, [_vm._m(4), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.email),
        expression: "formReserve.email"
      }],
      staticClass: "jejuInputBox full gray",
      attrs: {
        "type": "text",
        "name": "email"
      },
      domProps: {
        "value": (_vm.formReserve.email)
      },
      on: {
        "input": function($event) {
          if ($event.target.composing) { return; }
          _vm.$set(_vm.formReserve, "email", $event.target.value)
        }
      }
    })])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl full mt55"
    }, [_vm._m(5), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('dl', {
      staticClass: "columnDl noPadding"
    }, [_c('dt', {
      staticClass: "columnDt"
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.couponCode),
        expression: "formReserve.couponCode"
      }],
      staticClass: "jejuInputBox full gray",
      attrs: {
        "type": "text",
        "name": "coupon"
      },
      domProps: {
        "value": (_vm.formReserve.couponCode)
      },
      on: {
        "keypress": _vm.onChangeCouponCode,
        "input": function($event) {
          if ($event.target.composing) { return; }
          _vm.$set(_vm.formReserve, "couponCode", $event.target.value)
        }
      }
    })]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full textLarge",
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onCheckCouponCode($event)
        }
      }
    }, [_vm._v("쿠폰 추가")])])])])])])]), _vm._v(" "), _c('li', {
      staticClass: "columnLi"
    }, [_c('div', {
      staticClass: "verticalAlignMiddle"
    }, [_c('ul', {
      staticClass: "agreementUl"
    }, [_c('li', {
      staticClass: "agreementLi question toggleHeader"
    }, [_c('dl', {
      staticClass: "columnDl fontSize20"
    }, [_c('dt', {
      staticClass: "columnDt textAlignLeft"
    }, [_c('div', {
      staticClass: "agreementToggle",
      on: {
        "click": function($event) {
          return _vm.onToggleAgreement($event)
        }
      }
    }, [_vm._v("\n                                                    개인정보 수집 동의 (보기)\n                                                    "), _c('img', {
      staticClass: "imgAgreementArrowDown",
      attrs: {
        "src": _vm.config.urlCdn + '/images/reservationRenew/img_icon_arrowDown.png',
        "alt": "key visual"
      }
    })])]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd textAlignRight"
    }, [_c('label', {
      staticClass: "jejuRadioButton",
      attrs: {
        "for": "agreementPrivacy"
      }
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.agreementPrivacy),
        expression: "formReserve.agreementPrivacy"
      }],
      attrs: {
        "type": "radio",
        "name": "agreementPrivacy",
        "id": "agreementPrivacy",
        "value": "Y"
      },
      domProps: {
        "checked": _vm._q(_vm.formReserve.agreementPrivacy, "Y")
      },
      on: {
        "change": function($event) {
          return _vm.$set(_vm.formReserve, "agreementPrivacy", "Y")
        }
      }
    }), _vm._v(" "), _c('span', {
      staticClass: "radio"
    }), _vm._v(" "), _c('span', [_vm._v("동의")])])])])]), _vm._v(" "), _c('li', {
      staticClass: "agreementLi answer toggleContent"
    }, [_c('div', {
      staticClass: "pt20 pb20"
    }, [(_vm.avail.availType === 'BeerWalk' || _vm.avail.availType === 'FreeTourEvent') ? [_c('agreementPrivacyBeerWalk20210730')] : (_vm.avail.availType === 'StringArt') ? [_c('agreementPrivacyStringArt20210730')] : (_vm.avail.availType === 'CreateBeerGlass') ? [_c('agreementPrivacyCreateBeerGlass20210730')] : (_vm.avail.availType === 'CandleMakingClass') ? [_c('agreementPrivacyCandleMakingClass20210730')] : (_vm.avail.availType === 'GlassTasting') ? [_c('agreementPrivacyGlassTasting20210730')] : (_vm.avail.availType === 'PairingTable') ? [_c('agreementPrivacyPairingTable20210730')] : (_vm.avail.availType === 'BeerTasting') ? [_c('agreementPrivacyBeerTasting20210730')] : _vm._e()], 2)])]), _vm._v(" "), _c('ul', {
      staticClass: "agreementUl mt25"
    }, [_c('li', {
      staticClass: "agreementLi question"
    }, [_c('dl', {
      staticClass: "columnDl fontSize20"
    }, [_c('dt', {
      staticClass: "columnDt textAlignLeft"
    }, [_vm._v("취소, 환불 규정에 대한 동의")]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd textAlignRight"
    }, [_c('label', {
      staticClass: "jejuRadioButton",
      attrs: {
        "for": "agreementRefund"
      }
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.agreementRefund),
        expression: "formReserve.agreementRefund"
      }],
      attrs: {
        "type": "radio",
        "name": "agreementRefund",
        "id": "agreementRefund",
        "value": "Y"
      },
      domProps: {
        "checked": _vm._q(_vm.formReserve.agreementRefund, "Y")
      },
      on: {
        "change": function($event) {
          return _vm.$set(_vm.formReserve, "agreementRefund", "Y")
        }
      }
    }), _vm._v(" "), _c('span', {
      staticClass: "radio"
    }), _vm._v(" "), _c('span', [_vm._v("동의")])])])])]), _vm._v(" "), _c('li', {
      staticClass: "agreementLi answer"
    }, [_c('ul', {
      staticClass: "termsUl"
    }, [_c('li', {
      staticClass: "termsLi"
    }, [_c('div', {
      staticClass: "mt10"
    }, [(_vm.avail.availType === 'BeerWalk' || _vm.avail.availType === 'FreeTourEvent') ? [_c('agreementRefundBeerWalk20210730')] : (_vm.avail.availType === 'StringArt') ? [_c('agreementRefundStringArt20210730')] : (_vm.avail.availType === 'CreateBeerGlass') ? [_c('agreementRefundCreateBeerGlass20210730')] : (_vm.avail.availType === 'CandleMakingClass') ? [_c('agreementRefundCandleMakingClass20210730')] : (_vm.avail.availType === 'GlassTasting') ? [_c('agreementRefundGlassTasting20210730')] : (_vm.avail.availType === 'PairingTable') ? [_c('agreementRefundPairingTable20210730')] : (_vm.avail.availType === 'BeerTasting') ? [_c('agreementRefundBeerTasting20210730')] : _vm._e()], 2)])])])]), _vm._v(" "), _c('ul', {
      staticClass: "agreementUl mt40"
    }, [_c('li', {
      staticClass: "agreementLi question noBorder"
    }, [_c('dl', {
      staticClass: "columnDl fontSize20"
    }, [_c('dt', {
      staticClass: "columnDt textAlignLeft"
    }, [_vm._v("이용 규정에 대한 동의")]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd textAlignRight"
    }, [_c('label', {
      staticClass: "jejuRadioButton",
      attrs: {
        "for": "agreementTermsOfUse"
      },
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onShowAgreementLayerPopup($event)
        }
      }
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.agreementTermsOfUse),
        expression: "formReserve.agreementTermsOfUse"
      }],
      attrs: {
        "type": "radio",
        "name": "agreementTermsOfUse",
        "id": "agreementTermsOfUse",
        "value": "Y"
      },
      domProps: {
        "checked": _vm._q(_vm.formReserve.agreementTermsOfUse, "Y")
      },
      on: {
        "change": function($event) {
          return _vm.$set(_vm.formReserve, "agreementTermsOfUse", "Y")
        }
      }
    }), _vm._v(" "), _c('span', {
      staticClass: "radio"
    }), _vm._v(" "), _c('span', [_vm._v("확인 후 동의")])])])])])]), _vm._v(" "), _c('div', {
      staticClass: "pageLine mt10 mb70"
    }), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignLeft"
    }, [_c('div', {
      staticClass: "innerBox alignCenter"
    }, [_c('dl', {
      staticClass: "receiptDl"
    }, [_vm._m(6), _vm._v(" "), _c('dd', {
      staticClass: "receiptDd"
    }, [_c('h2', {
      staticClass: "pageSubTitle textAlignRight colorBlack"
    }, [_vm._v(_vm._s(_vm.finalPrice) + "원")])])]), _vm._v(" "), _c('dl', {
      staticClass: "receiptDl mt70"
    }, [_c('dt', {
      staticClass: "receiptDt"
    }, [_c('div', {}, [_vm._v("정상가 "), _c('sub', [_vm._v("(" + _vm._s(_vm.availPrice) + "원 × " + _vm._s(_vm.formReserve.number1) + "명)")])])]), _vm._v(" "), _c('dd', {
      staticClass: "receiptDd"
    }, [_c('div', {
      staticClass: " textAlignRight"
    }, [_vm._v(_vm._s(_vm.normalPrice) + "원")])])]), _vm._v(" "), _c('dl', {
      staticClass: "receiptDl mt20"
    }, [_c('dt', {
      staticClass: "receiptDt"
    }, [_c('div', {}, [_vm._v("할인 "), _c('sub', {
      directives: [{
        name: "show",
        rawName: "v-show",
        value: (_vm.formReserve.couponCheckYN === 'Y'),
        expression: "formReserve.couponCheckYN === 'Y'"
      }]
    }, [_vm._v("(" + _vm._s(_vm.coupon.title) + " " + _vm._s(_vm.coupon.discountRate) + "% 할인 × 1명)")])])]), _vm._v(" "), _c('dd', {
      staticClass: "receiptDd"
    }, [_c('div', {
      directives: [{
        name: "show",
        rawName: "v-show",
        value: (_vm.formReserve.couponCheckYN === 'Y'),
        expression: "formReserve.couponCheckYN === 'Y'"
      }],
      staticClass: " textAlignRight"
    }, [_vm._v("-" + _vm._s(_vm.couponDiscountPrice) + "원")])])]), _vm._v(" "), _c('div', {
      staticClass: "pageLine mt50"
    }), _vm._v(" "), _c('dl', {
      staticClass: "receiptDl mt50"
    }, [_vm._m(7), _vm._v(" "), _c('dd', {
      staticClass: "receiptDd"
    }, [_c('div', {
      staticClass: "textAlignRight"
    }, [_vm._v(_vm._s(_vm.finalPrice) + "원")])])])]), _vm._v(" "), _c('dl', {
      staticClass: "columnDl col5 mt50"
    }, [_c('dt', {
      staticClass: "columnDt textAlignLeft"
    }, [_c('label', {
      staticClass: "jejuRadioButton",
      attrs: {
        "for": "paymentTypeCard"
      }
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.paymentType),
        expression: "formReserve.paymentType"
      }],
      attrs: {
        "type": "radio",
        "name": "paymentType",
        "id": "paymentTypeCard",
        "value": "CARD"
      },
      domProps: {
        "checked": _vm._q(_vm.formReserve.paymentType, "CARD")
      },
      on: {
        "change": function($event) {
          return _vm.$set(_vm.formReserve, "paymentType", "CARD")
        }
      }
    }), _vm._v(" "), _c('span', {
      staticClass: "radio"
    }), _vm._v(" "), _c('span', [_vm._v("신용카드")])])]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd textAlignRight"
    }, [_c('label', {
      staticClass: "jejuRadioButton",
      attrs: {
        "for": "paymentTypeBank"
      }
    }, [_c('input', {
      directives: [{
        name: "model",
        rawName: "v-model",
        value: (_vm.formReserve.paymentType),
        expression: "formReserve.paymentType"
      }],
      attrs: {
        "type": "radio",
        "name": "paymentType",
        "id": "paymentTypeBank",
        "value": "DIRECT_BANK"
      },
      domProps: {
        "checked": _vm._q(_vm.formReserve.paymentType, "DIRECT_BANK")
      },
      on: {
        "change": function($event) {
          return _vm.$set(_vm.formReserve, "paymentType", "DIRECT_BANK")
        }
      }
    }), _vm._v(" "), _c('span', {
      staticClass: "radio"
    }), _vm._v(" "), _c('span', [_vm._v("실시간 계좌이체")])])])]), _vm._v(" "), _vm._m(8)]), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt47"
    }, [_c('div', {
      staticClass: "innerBox alignCenter"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full bold",
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.formReserveSubmit($event)
        }
      }
    }, [_vm._v("결제하기")])])])])])])]), _vm._v(" "), _vm._m(9), _vm._v(" "), _vm._m(10)])]), _vm._v(" "), _c('footerContainerRenew'), _vm._v(" "), _c('div', {
      staticClass: "layerPopup layerPopupAgreementTermsOfUse"
    }, [_c('div', {
      staticClass: "popupBg closePopup",
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onClickCloseLayerPopup($event)
        }
      }
    }), _vm._v(" "), _c('div', {
      staticClass: "popupWrap"
    }, [_vm._m(11), _vm._v(" "), _c('div', {
      staticClass: "popupBody"
    }, [(_vm.avail.availType === 'BeerWalk' || _vm.avail.availType === 'FreeTourEvent') ? [_c('agreementTermsOfUseBeerWalk20210730')] : (_vm.avail.availType === 'StringArt') ? [_c('agreementTermsOfUseStringArt20210730')] : (_vm.avail.availType === 'CreateBeerGlass') ? [_c('agreementTermsOfUseCreateBeerGlass20210730')] : (_vm.avail.availType === 'CandleMakingClass') ? [_c('agreementTermsOfUseCandleMakingClass20210730')] : (_vm.avail.availType === 'GlassTasting') ? [_c('agreementTermsOfUseGlassTasting20210730')] : (_vm.avail.availType === 'PairingTable') ? [_c('agreementTermsOfUsePairingTable20210730')] : (_vm.avail.availType === 'BeerTasting') ? [_c('agreementTermsOfUseBeerTasting20210730')] : _vm._e()], 2), _vm._v(" "), _c('div', {
      staticClass: "popupButton"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full bold",
      on: {
        "click": function($event) {
          $event.preventDefault();
          return _vm.onClickAgreementTermsOfUse($event)
        }
      }
    }, [_vm._v("모두 확인했고, 동의합니다.")])])])])], 1)
  },staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignCenter mt100"
    }, [_c('h1', {
      staticClass: "pageTitle"
    }, [_vm._v("예약하기")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "reserveDt pb15"
    }, [_vm._v("신청자명 "), _c('span', {
      staticClass: "require"
    })])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "reserveDt pb15"
    }, [_vm._v("핸드폰 번호 "), _c('span', {
      staticClass: "require"
    })])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "reserveDt pb15"
    }, [_vm._v("인증 번호 "), _c('span', {
      staticClass: "require"
    })])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "reserveDt pb15"
    }, [_vm._v("이메일 "), _c('span', {
      staticClass: "require"
    }), _vm._v(" "), _c('sub', [_vm._v("*입력하신 메일주소로 결제정보가 발송됩니다.")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "reserveDt pb15"
    }, [_vm._v("쿠폰입력 "), _c('sub', [_vm._v("*쿠폰 코드가 있을 경우 입력해 주세요.")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "receiptDt"
    }, [_c('h2', {
      staticClass: "pageSubTitle colorBlack"
    }, [_vm._v("결제금액")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('dt', {
      staticClass: "receiptDt"
    }, [_c('div', {}, [_vm._v("합계")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('ul', {
      staticClass: "termsUl listStyleAsterisk noBorderTop"
    }, [_c('li', {
      staticClass: "termsLi"
    }, [_vm._v("현대카드는 사용하실 수 없습니다. 다른 카드나 실시간 계좌이체를 이용해주세요.")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('form', {
      attrs: {
        "id": "inicisStdWebPay",
        "name": "formInipay",
        "method": "POST"
      }
    }, [_c('input', {
      attrs: {
        "type": "hidden",
        "name": "version",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "mid",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "goodname",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "oid",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "price",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "currency",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "buyername",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "buyertel",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "buyeremail",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "timestamp",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "signature",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "returnUrl",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "mKey",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "gopaymethod",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "offerPeriod",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "acceptmethod",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "languageView",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "charset",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "payViewType",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "closeUrl",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "popupUrl",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "nointerest",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "quotabase",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "vbankRegNo",
        "value": ""
      }
    }), _vm._v(" "), _c('input', {
      attrs: {
        "type": "hidden",
        "name": "merchantData",
        "value": ""
      }
    })])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('form', {
      attrs: {
        "action": "/reserve/couponAuthResponse",
        "name": "formCouponReserve",
        "method": "GET"
      }
    }, [_c('input', {
      attrs: {
        "type": "hidden",
        "name": "orderId",
        "value": ""
      }
    })])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "popupHeader"
    }, [_c('div', {
      staticClass: "popupTitle"
    }, [_c('strong', [_vm._v("잠깐!")]), _c('br'), _vm._v("제주맥주 양조장의 이용 규정을 확인하고,"), _c('br'), _vm._v("결제해주세요.")])])
  }]}
  module.exports.render._withStripped = true
  if (module.hot) {
    module.hot.accept()
    if (module.hot.data) {
       require("vue-hot-reload-api").rerender("data-v-30aafbb4", module.exports)
    }
  }
  
  
  //////////////////
  // WEBPACK FOOTER
  // ./~/vue-loader/lib/template-compiler.js?id=data-v-30aafbb4!./~/vue-loader/lib/selector.js?type=template&index=0!./src/vue-pages-pc/reservationRenewForm.vue
  // module id = 655
  // module chunks = 0