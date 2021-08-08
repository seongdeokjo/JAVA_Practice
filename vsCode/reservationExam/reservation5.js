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
    }, [_c('div', {
      staticClass: "stepReservation"
    }, [_c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('h1', {
      staticClass: "pageTitle textAlignCenter"
    }, [_vm._v("양조장 예약")]), _vm._v(" "), _c('h1', {
      staticClass: "pageTitle textAlignCenter mt10"
    }, [_vm._v("확인/변경/취소")]), _vm._v(" "), _c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('dl', {
      staticClass: "reserveDl mt150"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("신청자 명")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.formReserve.name))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("프로그램 명")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.formReserve.reserveTypeKorean))])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt25 lineHeight70"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("일시")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_c('dl', {
      staticClass: "columnDl col5 noPadding"
    }, [_c('dt', {
      staticClass: "columnDt"
    }, [_vm._v("\n                                            " + _vm._s(_vm.getDateTimeFormat(_vm.formReserve.date, _vm.formReserve.time)) + "\n                                        ")]), _vm._v(" "), _c('dd', {
      staticClass: "columnDd"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full textLarge",
      on: {
        "click": _vm.toggleAvailCalendar
      }
    }, [(!_vm.isOpenCalendar) ? _c('span', [_vm._v("예약일시 변경")]) : _vm._e(), _vm._v(" "), (_vm.isOpenCalendar) ? _c('span', [_vm._v("취소")]) : _vm._e()])])])]), _vm._v(" "), (_vm.isOpenCalendar) ? _c('dd', {
      staticClass: "reserveDd full"
    }, [_c('div', {
      staticClass: "changeReserveDatetime"
    }, [_c('dl', {
      staticClass: "columnDl col5"
    }, [_c('dt', {
      staticClass: "columnDt"
    }, [_c('h2', {
      staticClass: "pageSubTitle textAlignCenter"
    }, [_vm._v("날짜")]), _vm._v(" "), _c('datePicker', {
      attrs: {
        "format": "yyyy-MM-dd",
        "name": "reservationDate",
        "language": "ko",
        "inline": "true",
        "disabled": _vm.reserveDate.disabled,
        "highlighted": _vm.reserveDate.highlighted
      },
      on: {
        "changedMonth": _vm.changedMonth,
        "selected": _vm.dateSelected
      },
      model: {
        value: (_vm.reserveDate.date),
        callback: function($$v) {
          _vm.$set(_vm.reserveDate, "date", $$v)
        },
        expression: "reserveDate.date"
      }
    })], 1), _vm._v(" "), _c('dd', {
      staticClass: "columnDd"
    }, [_c('h2', {
      staticClass: "pageSubTitle textAlignCenter"
    }, [_vm._v("시간")]), _vm._v(" "), _c('div', {
      staticClass: "timeBox"
    }, [_c('ul', {
      staticClass: "timeUl"
    }, _vm._l((_vm.currentVacant.listTime), function(time) {
      return _c('li', {
        key: time.availTime,
        staticClass: "timeLi",
        class: {
          'disabled': 0 >= (time.capacity - time.reserved)
        }
      }, [_c('div', {
        staticClass: "pageDescription",
        on: {
          "click": function($event) {
            return _vm.onSelectTime(time)
          }
        }
      }, [_vm._v("\n                                                                " + _vm._s(_vm.getTimeFormat(time.availTime)) + " (잔여석:" + _vm._s(time.capacity - time.reserved) + ")\n                                                            ")])])
    }), 0)])])])])]) : _vm._e()]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt25"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("인원")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.formReserve.number1) + "명")])]), _vm._v(" "), _c('dl', {
      staticClass: "reserveDl mt50"
    }, [_c('dt', {
      staticClass: "reserveDt"
    }, [_vm._v("핸드폰 번호")]), _vm._v(" "), _c('dd', {
      staticClass: "reserveDd"
    }, [_vm._v(_vm._s(_vm.formReserve.telephone))])]), _vm._v(" "), _c('ul', {
      staticClass: "columnUl typeMargeHalf mt80"
    }, [_c('li', {
      staticClass: "columnLi"
    }, [_c('button', {
      staticClass: "buttonTypeCyan full textLarge",
      on: {
        "click": _vm.formReserveSubmit
      }
    }, [_vm._v("예약일시 변경 확정")])]), _vm._v(" "), _c('li', {
      staticClass: "columnLi"
    }, [_c('button', {
      staticClass: "buttonTypeGray full textLarge",
      on: {
        "click": _vm.formCancelSubmit
      }
    }, [_vm._v("예약 취소")])])])]), _vm._v(" "), _c('div', {
      staticClass: "pageLine mt100"
    })])]), _vm._v(" "), _vm._m(0), _vm._v(" "), _vm._m(1)])]), _vm._v(" "), _c('footerContainerRenew')], 1)
  },staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20"
    }, [_c('strong', [_vm._v("[이용안내]")])]), _vm._v(" "), _c('ul', {
      staticClass: "termsUl listStyleHyphen mt30"
    }, [_c('li', {
      staticClass: "termsLi"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        프로그램 참여 전, 양조장 안내데스크 3층에서 예약 확인이 필요합니다.\n                                    ")])]), _vm._v(" "), _c('li', {
      staticClass: "termsLi mt5"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        양조장 당일예약/ 전화예약은 불가능하며,"), _c('br'), _vm._v("\n                                        당일 잔여 인원에 한해 현장 결제 순으로 예약 가능합니다.\n                                    ")])]), _vm._v(" "), _c('li', {
      staticClass: "termsLi mt5"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        프로그램 정원은 조정이 불가능합니다.\n                                    ")])])])])])])
  },function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
    return _c('div', {
      staticClass: "alignBox mAuto textAlignLeft mt70 pb150"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "innerBox alignCenter pl100 pr100"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20"
    }, [_c('strong', [_vm._v("[주의사항]")])]), _vm._v(" "), _c('ul', {
      staticClass: "termsUl listStyleHyphen mt30"
    }, [_c('li', {
      staticClass: "termsLi"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        미취학 아동 참여 불가"), _c('br'), _vm._v("\n                                        미취학 아동의 경우프로그램 참여가 제한되므로 양해 부탁드립니다."), _c('br'), _vm._v("\n                                        3층 펍, md샵은 부모동반 하에  자유롭게 이용 가능합니다.\n                                    ")])]), _vm._v(" "), _c('li', {
      staticClass: "termsLi"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        당일 10분 이상 지각 참여 및 환불 불가"), _c('br'), _vm._v("\n                                        양조장 투어, 테이스팅 클래스, 푸드페어링 클래스, 캔들만들기 클래스는"), _c('br'), _vm._v("\n                                        시작 10분 후에는 프로그램 참여가 불가능하며, 지각으로 인한 환불은 불가능합니다.\n                                    ")])]), _vm._v(" "), _c('li', {
      staticClass: "termsLi"
    }, [_c('div', {
      staticClass: "pageDescription fontSize20 lineHeight28"
    }, [_vm._v("\n                                        정원 조정 불가"), _c('br'), _vm._v("\n                                        프로그램의 정원 추가는 불가능합니다.\n                                    ")])])])])])])
  }]}
  module.exports.render._withStripped = true
  if (module.hot) {
    module.hot.accept()
    if (module.hot.data) {
       require("vue-hot-reload-api").rerender("data-v-07b59dfe", module.exports)
    }
  }
  
  
  //////////////////
  // WEBPACK FOOTER
  // ./~/vue-loader/lib/template-compiler.js?id=data-v-07b59dfe!./~/vue-loader/lib/selector.js?type=template&index=0!./src/vue-pages-pc/reservationRenewDetailInfo.vue
  // module id = 607
  // module chunks = 0