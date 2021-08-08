module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "wrapper"
    }, [_c('headerContainerRenew', {
      attrs: {
        "reservationRenew": "active",
        "gtagSend": "reservation"
      }
    }), _vm._v(" "), _c('div', {
      staticClass: "container reservationRenewPage"
    }, [(_vm.step === 'stepSuccess') ? [_vm._m(0), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('dl', {
      staticClass: "reserveDl"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("신청자명")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.order.name))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("프로그램 명")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.order.reserveTypeKorean))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("일시")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.order.reserveTimeDisplay))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("인원")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.order.number1))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("핸드폰 번호")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.order.telephone))])])]), _vm._v(" "), _c('div', {
      staticClass: "pageLine mt80"
    })])]), _vm._v(" "), _vm._m(1), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt70 pb150"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100 completeTermsOfUseUlBox"
    }, [_vm._m(2), _vm._v(" "), _c('attentionTermsOfUse20210226')], 1)])])] : _vm._e(), _vm._v(" "), (_vm.step == 'stepError') ? [_vm._m(3), _vm._v(" "), _vm._m(4), _vm._v(" "), _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('dl', {
      staticClass: "reserveDl"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("에러 코드")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.errorCode))]), _vm._v(" "), _c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("에러 메시지")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.errorMessage))])])])])])] : _vm._e()], 2), _vm._v(" "), _c('footerContainerRenew')], 1)
  },staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('h1', {
      staticClass: "pageTitle textAlignCenter"
    }, [_vm._v("예약이 완료되었습니다!")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt80"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20"
    }, [_c('strong', [_vm._v("[이용안내]")])]), _vm._v(" "), _c('ul', {
      staticClass: "termsUl listStyleHyphen mt30"
    }, [_c('li', {
      staticClass: "termsLi fontSize20"
    }, [_vm._v("\n                                    프로그램 참여 전, 양조장 안내데스크 3층에서 예약 확인이 필요합니다.\n                                ")]), _vm._v(" "), _c('li', {
      staticClass: "termsLi fontSize20 mt5"
    }, [_vm._v("\n                                    양조장 당일예약/ 전화예약은 불가능하며,"), _c('br'), _vm._v("\n                                    당일 잔여 인원에 한해 현장 결제 순으로 예약 가능합니다.\n                                ")]), _vm._v(" "), _c('li', {
      staticClass: "termsLi fontSize20 mt5"
    }, [_vm._v("\n                                    프로그램 정원은 조정이 불가능합니다.\n                                ")])])])])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "pageDescription fontSize20 mb30"
    }, [_c('strong', [_vm._v("[주의사항]")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('h1', {
      staticClass: "pageTitle textAlignCenter"
    }, [_vm._v("예약오류")])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "pageDescription textAlignCenter mt90"
    }, [_vm._v("\n                    예약 진행도중 오류가 발생하였습니다."), _c('br'), _vm._v("\n                    다시 신청해주세요.\n                ")])
  }]}
  module.exports.render._withStripped = true
  if (module.hot) {
    module.hot.accept()
    if (module.hot.data) {
       require("vue-hot-reload-api").rerender("data-v-9eca21ca", module.exports)
    }
  }
  
  
  //////////////////
  // WEBPACK FOOTER
  // ./~/vue-loader/lib/template-compiler.js?id=data-v-9eca21ca!./~/vue-loader/lib/selector.js?type=template&index=0!./src/vue-pages-pc/reservationRenewComplete.vue
  // module id = 691
  // module chunks = 0