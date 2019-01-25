package com.altay.mehmet.gezegenlerdeyavekilo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ana_sayfa.*

class AnaSayfa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_sayfa)

        btkilo.setOnClickListener {
            val kiloSayfaAcma = Intent(this, KiloSayfa::class.java)
            startActivity(kiloSayfaAcma)
        }
        btyas.setOnClickListener {
            val yasSayfaAcma = Intent(this, YasSayfa::class.java)
            startActivity(yasSayfaAcma)
        }


    }


}
