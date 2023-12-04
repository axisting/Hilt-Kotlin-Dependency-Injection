package com.axisting.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ExampleClass
@Inject
constructor(@FirstImplementor private var myInterfaceImplementer: MyInterface,
            gson : Gson,
            @SecondImplementor private var mySecondInterfaceImplementor: MyInterface
            ) {

    fun  myFunction () : String {
        return "working.... ${myInterfaceImplementer.myPrintFunction()}"
    }

    fun mySecondFunction () : String {
        return "working.... ${mySecondInterfaceImplementor.myPrintFunction()}"
    }

}