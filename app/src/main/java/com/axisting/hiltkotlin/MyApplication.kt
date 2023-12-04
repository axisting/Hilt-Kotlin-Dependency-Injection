package com.axisting.hiltkotlin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Bu sınıfı boş bıraksak bile böyle bir application sınıfı oluşturmalıyız.
//Bu sayede uygulamamız hilt kullanacağımızı biliyor ve hilt için gerekli sınıfları oluşyuruyor
//Birde çalıştığından emin olmak için Manifest içinde belirtmekte fayda var
@HiltAndroidApp
class MyApplication : Application() {
}