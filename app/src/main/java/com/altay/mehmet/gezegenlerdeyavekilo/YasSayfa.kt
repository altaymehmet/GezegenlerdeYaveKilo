package com.altay.mehmet.gezegenlerdeyavekilo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kilo_sayfa.*
import kotlinx.android.synthetic.main.activity_yas_sayfa.*

class YasSayfa : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yas_sayfa)

        var mars = 0.56
        var venüs = 1.49
        var jubiter = 0.30

    bykilo.setOnClickListener {
        val kiloSayfaAcma = Intent(this, KiloSayfa::class.java)
        startActivity(kiloSayfaAcma)
    }
        var liste = arrayListOf<Double>()

        var sonuç = 0

        bymars.setOnClickListener {
            var yas = textyas.text.toString().toDouble()
            var marstakiyas = mars * yas

            liste.add(yas)


            if (liste.isEmpty()) {

                sonuçyas.text = sonuç.toString()


            }
            else {
                sonuçyas.text = marstakiyas.Formatla(2)

            }




        }

        byvenüs.setOnClickListener {
            var yas = textyas.text.toString().toDouble()
            var venüstekiyas = venüs * yas

            sonuçyas.text = venüstekiyas.Formatla(2)
        }
        byjüpiter.setOnClickListener {
            var yas = textyas.text.toString().toDouble()
            var jüpiterdekiyas = jubiter * yas

            sonuçyas.text = jüpiterdekiyas.Formatla(2)
        }



    byanasayfa.setOnClickListener {
        var geri = Intent(this, AnaSayfa::class.java)
        startActivity(geri)
    }

    }
    fun Double.Formatla(KaçTaneRakam : Int)= java.lang.String.format("%.${KaçTaneRakam}f",this)


}
