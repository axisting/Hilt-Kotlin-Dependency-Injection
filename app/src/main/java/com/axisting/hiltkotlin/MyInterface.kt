package com.axisting.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction () : String
}

/*
//Binds kullanımı ile interface ve hilt kullanımı
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule () {

    @ActivityScoped
    @Binds
    abstract fun bindingFun(myInterfaceImplementor: MyInterfaceImplementor) : MyInterface
}
*/

@InstallIn(SingletonComponent::class)
@Module
class MyModuleWithProvides (){
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFun () :MyInterface {
        return MyInterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFun () : MyInterface{
        return SecondInterfaceImplementor()
    }


    //Hilt Provides ile harici kütüphaneleri bile kolaylıkla kullanabiliriz.
    @Singleton
    @Provides
    fun gSonProvides () : Gson {
        return Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor

