package com.example.beelinecompany.models

import java.io.Serializable

data class MyTemplate(
    var name:String,
    var code:String,
    var price:String,
    var about:String
): Serializable
