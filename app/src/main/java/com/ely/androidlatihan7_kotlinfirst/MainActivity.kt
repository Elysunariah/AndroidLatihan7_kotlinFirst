package com.ely.androidlatihan7_kotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    //deklarasi variable
    var a = "contoh"//secara default di deklarasi sebagai String
    var aa : String = "contoh"
    lateinit var aaa : String

    val b = "contoh"
    val bb :String = "contoh"
    val bbb : String = ""

    val nilai = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = """
            #data pertama
            #data kedua
            #data ketiga
        """.trimMargin("#")

        Log.d("TAG_SAMPLE", text)

        for(a : Int in 1..10){ //dalam java => for(int a = 1; a <= 10; a++)
            Log.d("TAG_SAMPLE", "a = "+a)

            d("TAG_SAMPLE", "a = "+a)
            e("TAG_SAMPLE", "a = " +a)
            i("TAG_SAMPLE", "a = "+a)
        }

        var tv_hello : TextView = findViewById(R.id.tv_hello)
        tv_hello.text = "Assalamualaikum" // sama seperti tv_hello.setText("Assalamualaikum")
        tv_hello.text // sama seperti tv_hello.getText()

        tv_nama.text = "Siapa Nama Kalian" // tv_nama langsung ngambil dari id yg ada
        Konstanta.setnamaVariable(("Namanya Siapa"))
        tv_nama.text = Konstanta.getnamaVariable()

        Konstanta.setterGetterBeda = "Elly"
        tv_nama.text = Konstanta.setterGetterBeda

        tv_nama.setOnClickListener {
            Toast.makeText(this, "hello, ${tv_nama.text}" // sama seperti
                    , Toast.LENGTH_SHORT).show()
        }

        btn_oke.setOnClickListener {
            var angka : Int = et_angka.text.toString().toInt()

            when(angka){
                0 -> Toast.makeText(this, "Angka 0", Toast.LENGTH_SHORT).show()
                1, 2, 3 -> Toast.makeText(this, "Angka 1 - 3", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this, "Angka lebih dari 3", Toast.LENGTH_SHORT).show()
                }

        }
    }
}
