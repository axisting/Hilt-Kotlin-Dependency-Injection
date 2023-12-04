package com.axisting.hiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var lars : Musician
    @Inject
    lateinit var exampleClass: ExampleClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val instrument = Instrument()
        val band = Band()
        val saniser : Musician = Musician(instrument, band)
        saniser.sing()

         */
        println(exampleClass.myFunction())
        println(exampleClass.mySecondFunction())

        lars.sing()
    }
}