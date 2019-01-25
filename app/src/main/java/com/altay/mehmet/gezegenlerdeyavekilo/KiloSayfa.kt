package com.altay.mehmet.gezegenlerdeyavekilo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kilo_sayfa.*

class KiloSayfa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilo_sayfa)

        var mars = 0.38
        var venüs = 0.91
        var jubiter = 2.34

        btgeriKilo.setOnClickListener {
            var geri = Intent(this, AnaSayfa::class.java)
            startActivity(geri)
        }

        bkmars.setOnClickListener {
            var kilo = textkilo.text.toString().toDouble()
            var marstakiAğırlık = mars * kilo

            sonuçkilo.text = marstakiAğırlık.Formatla(2)
        }

        bkvenüs.setOnClickListener {
            var kilo = textkilo.text.toString().toDouble()
            var venüstekiAğırlık = venüs * kilo

            sonuçkilo.text = venüstekiAğırlık.Formatla(2)
        }
        bkjüpiter.setOnClickListener {
            var kilo = textkilo.text.toString().toDouble()
            var jüpiterdekiAğırlık = jubiter * kilo

            sonuçkilo.text = jüpiterdekiAğırlık.Formatla(2)
        }
        bkyaş.setOnClickListener {
            val yasSayfaAc = Intent(this, YasSayfa::class.java)
            startActivity(yasSayfaAc)
        }


    }
    fun Double.Formatla(KaçTaneRakam : Int)= java.lang.String.format("%.${KaçTaneRakam}f",this)
}
