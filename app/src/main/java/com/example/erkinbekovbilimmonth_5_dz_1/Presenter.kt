package com.example.erkinbekovbilimmonth_5_dz_1

class Presenter {

    lateinit var view: CounterView
    var model = CounterModel()

    fun plus(){
        model.plus()
        view.showCount(model.getCount())
        if (model.getCount() == 10){
            view.showToast()
        }else if (model.getCount() == 15) {
            view.changeColor()
        }
    }

    fun minus(){
        model.minus()
        view.showCount(model.getCount())
        if (model.getCount() == 10) {
            view.showToast()
        }
    }

    fun attachView(view: CounterView){
        this.view = view
    }
}