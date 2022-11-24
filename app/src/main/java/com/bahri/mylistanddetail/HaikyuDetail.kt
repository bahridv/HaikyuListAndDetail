package com.bahri.mylistanddetail

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HaikyuDetail : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haikyu_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Anggota Karasuno"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetNama: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDescripsi: TextView = findViewById(R.id.tv_set_descripsi)
        val tvSetRate: TextView = findViewById(R.id.tv_item_rate)

        val tNAme = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tOverview = intent.getStringExtra(EXTRA_DESCRIPSI)
        val tRate = intent.getStringExtra(EXTRA_RATE)

        tvSetNama.text = tNAme
        imgSetPhoto.setImageResource(tImg)
        tvDescripsi.text = tOverview
        tvSetRate.text = tRate

    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPSI = "extra_overview"
        const val EXTRA_RATE = "extra_rate"


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}