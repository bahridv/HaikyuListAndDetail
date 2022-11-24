package com.bahri.mylistanddetail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHaikyu: RecyclerView
    private var list: ArrayList<Haikyu> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title = "Karasuno Team"

        rvHaikyu = findViewById(R.id.rv_list)
        rvHaikyu.setHasFixedSize(true)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHaikyu.layoutManager = LinearLayoutManager(this)
        val haikyuAdapter = HaikyuAdapter(list)
        haikyuAdapter.setData(HaikyuData.listData)
        rvHaikyu.adapter = haikyuAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity,About::class.java)
                startActivity(iAbout)
            }
        }
    }
}