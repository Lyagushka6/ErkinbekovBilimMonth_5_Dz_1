package com.example.erkinbekovbilimmonth_5_dz_1

class CounterModel{
    private var count = 0

    fun plus(){
        count++
    }

    fun minus(){
        count--
    }

    fun getCount() : Int{
        return count
    }
}
