package com.axisting.hiltkotlin

import javax.inject.Inject

class MyInterfaceImplementor
    @Inject
    constructor():MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}

