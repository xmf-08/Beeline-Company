package com.example.beelinecompany.utils

import com.example.beelinecompany.models.MyTemplate

object MyData {
    var listTerif = ArrayList<MyTemplate>()//0
    var listDaqiqa = ArrayList<MyTemplate>()//1
    var listInternet = ArrayList<MyTemplate>()//2
    var listXizmatlar = ArrayList<MyTemplate>()//3
    var listSMS = ArrayList<MyTemplate>()//4

    fun addTemplate(){
        listTerif.add(MyTemplate("Zo'r 7", "*5#", "40000", "Zo'r tarif bu Zo'r 7"))
        listTerif.add(MyTemplate("Zo'r 7", "*5#", "40000", "Zo'r tarif bu Zo'r 7"))
        listTerif.add(MyTemplate("Zo'r 7", "*5#", "40000", "Zo'r tarif bu Zo'r 7"))
        listTerif.add(MyTemplate("Zo'r 7", "*5#", "40000", "Zo'r tarif bu Zo'r 7"))

        listDaqiqa.add(MyTemplate("Zo'r 7", "*5#", "40000", "Xoxlagancha ishlating"))
        listDaqiqa.add(MyTemplate("Zo'r 7", "*5#", "40000", "Xoxlagancha ishlating"))
        listDaqiqa.add(MyTemplate("Zo'r 7", "*5#", "40000", "Xoxlagancha ishlating"))
        listDaqiqa.add(MyTemplate("Zo'r 7", "*5#", "40000", "Xoxlagancha ishlating"))

        listInternet.add(MyTemplate("Zo'r 7", "*5#", "40000", "7gb 30 kunga"))
        listInternet.add(MyTemplate("Zo'r 7", "*5#", "40000", "7gb 30 kunga"))
        listInternet.add(MyTemplate("Zo'r 7", "*5#", "40000", "7gb 30 kunga"))
        listInternet.add(MyTemplate("Zo'r 7", "*5#", "40000", "7gb 30 kunga"))

        listXizmatlar.add(MyTemplate("paket 1", "*5#", "50000", "kop xammasi 30 kunga"))
        listXizmatlar.add(MyTemplate("paket 1", "*5#", "50000", "kop xammasi 30 kunga"))
        listXizmatlar.add(MyTemplate("paket 1", "*5#", "50000", "kop xammasi 30 kunga"))
        listXizmatlar.add(MyTemplate("paket 1", "*5#", "50000", "kop xammasi 30 kunga"))

        listSMS.add(MyTemplate("Zo'r 7", "*5#", "40000", "O'zbekiston bo'ylab xoxlagancha sms"))
        listSMS.add(MyTemplate("Zo'r 7", "*5#", "40000", "O'zbekiston bo'ylab xoxlagancha sms"))
        listSMS.add(MyTemplate("Zo'r 7", "*5#", "40000", "O'zbekiston bo'ylab xoxlagancha sms"))
        listSMS.add(MyTemplate("Zo'r 7", "*5#", "40000", "O'zbekiston bo'ylab xoxlagancha sms"))
    }
}