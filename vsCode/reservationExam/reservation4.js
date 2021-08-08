module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', {
    staticClass: "wrapper"
  }, [_c('headerContainerRenew', {
    attrs: {
      "reservationRenewModify": "active",
      "gtagSend": "reservation"
    }
  }), _vm._v(" "), _c('div', {
    staticClass: "container reservationRenewPage"
  }, [_vm._m(0), _vm._v(" "), _c('div', {
    staticClass: "alignBox mAuto textAlignLeft mt60 pb150"
  }, [_c('div', {
    staticClass: "innerBox alignCenter pl100 pr100"
  }, [_c('div', {
    staticClass: "innerBox alignCenter w450"
  }, [_c('dl', {
    staticClass: "reserveDl full"
  }, [_c('dt', {
    staticClass: "reserveDt pb15"
  }, [_vm._v("신청자 명")]), _vm._v(" "), _c('dd', {
    staticClass: "reserveDd"
  }, [_c('input', {
    directives: [{
      name: "model",
      rawName: "v-model",
      value: (_vm.formAuth.name),
      expression: "formAuth.name"
    }],
    staticClass: "jejuInputBox full gray",
    attrs: {
      "type": "text",
      "name": "name",
      "placeholder": ""
    },
    domProps: {
      "value": (_vm.formAuth.name)
    },
    on: {
      "input": function($event) {
        if ($event.target.composing) { return; }
        _vm.$set(_vm.formAuth, "name", $event.target.value)
      }
    }
  })])]), _vm._v(" "), _c('dl', {
    staticClass: "reserveDl full mt40"
  }, [_c('dt', {
    staticClass: "reserveDt pb15"
  }, [_vm._v("핸드폰 번호")]), _vm._v(" "), _c('dd', {
    staticClass: "reserveDd"
  }, [_c('dl', {
    staticClass: "columnDl noPadding"
  }, [_c('dt', {
    staticClass: "columnDt"
  }, [_c('input', {
    directives: [{
      name: "model",
      rawName: "v-model",
      value: (_vm.formAuth.telephone),
      expression: "formAuth.telephone"
    }],
    staticClass: "jejuInputBox full gray",
    attrs: {
      "type": "tel",
      "name": "phone",
      "placeholder": ""
    },
    domProps: {
      "value": (_vm.formAuth.telephone)
    },
    on: {
      "blur": function($event) {
        return _vm.onBlurTelephone(_vm.formAuth)
      },
      "keyup": _vm.onChangeTelephone,
      "input": function($event) {
        if ($event.target.composing) { return; }
        _vm.$set(_vm.formAuth, "telephone", $event.target.value)
      }
    }
  })]), _vm._v(" "), _c('dd', {
    staticClass: "columnDd"
  }, [_c('button', {
    staticClass: "buttonTypeCyan full textSmall",
    class: {
      'disabled': _vm.formAuth.reqSeq !== '' && _vm.formAuth.resSeq !== ''
    },
    on: {
      "click": _vm.onRequestAuthNo
    }
  }, [_vm._v("인증번호 발송")])])])])]), _vm._v(" "), _c('dl', {
    staticClass: "reserveDl full mt40"
  }, [_c('dt', {
    staticClass: "reserveDt pb15"
  }, [_vm._v("인증 번호")]), _vm._v(" "), _c('dd', {
    staticClass: "reserveDd"
  }, [_c('dl', {
    staticClass: "columnDl noPadding"
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
      "name": "certCode",
      "placeholder": "",
      "maxlength": "5"
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
    staticClass: "buttonTypeCyan full textSmall",
    class: {
      'disabled': _vm.formAuth.reqSeq === '' && _vm.formAuth.resSeq === ''
    },
    on: {
      "click": _vm.onCheckAuthNo
    }
  }, [_vm._v("인증하기")])])])])])])])]), _vm._v(" "), _vm._m(1), _vm._v(" "), _vm._m(2)]), _vm._v(" "), _c('footerContainerRenew')], 1)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', {
    staticClass: "alignBox mAuto textAlignLeft mt100"
  }, [_c('h1', {
    staticClass: "pageTitle textAlignCenter"
  }, [_vm._v("양조장 예약")]), _vm._v(" "), _c('h1', {
    staticClass: "pageTitle textAlignCenter mt10"
  }, [_vm._v("확인/변경/취소")]), _vm._v(" "), _c('div', {
    staticClass: "pageDescription textAlignCenter mt90"
  }, [_vm._v("\n                    예약 시 인증을 진행하셨던 휴대폰 번호를 입력해주세요."), _c('br'), _vm._v("\n                    예약내역을 확인하실 수 있습니다."), _c('br'), _vm._v(" "), _c('br'), _vm._v("\n                    예약 정보 확인 후 예약일시 변경과 취소를 하실 수 있습니다.\n                ")])])
},function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('form', {
    attrs: {
      "action": "/reserve/detail/info",
      "method": "POST",
      "name": "formReserveInfo"
    }
  }, [_c('input', {
    attrs: {
      "type": "hidden",
      "name": "uid"
    }
  }), _vm._v(" "), _c('input', {
    attrs: {
      "type": "hidden",
      "name": "name"
    }
  }), _vm._v(" "), _c('input', {
    attrs: {
      "type": "hidden",
      "name": "telephone"
    }
  })])
},function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('form', {
    attrs: {
      "action": "/reserve/detail/list",
      "method": "POST",
      "name": "formReserveList"
    }
  }, [_c('input', {
    attrs: {
      "type": "hidden",
      "name": "name"
    }
  }), _vm._v(" "), _c('input', {
    attrs: {
      "type": "hidden",
      "name": "telephone"
    }
  })])
}]}
module.exports.render._withStripped = true
if (module.hot) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-74f2a912", module.exports)
  }
}


//////////////////
// WEBPACK FOOTER
// ./~/vue-loader/lib/template-compiler.js?id=data-v-74f2a912!./~/vue-loader/lib/selector.js?type=template&index=0!./src/vue-pages-pc/reservationRenewDetailCert.vue
// module id = 682
// module chunks = 0