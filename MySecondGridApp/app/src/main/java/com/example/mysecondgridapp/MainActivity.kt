package com.example.mysecondgridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView) as GridView

        val arrayListImage = ArrayList<Int>()
        arrayListImage.add(R.drawable.cupcake)
        arrayListImage.add(R.drawable.lollipop)
        arrayListImage.add(R.drawable.donut)
        arrayListImage.add(R.drawable.froyo)
        arrayListImage.add(R.drawable.gingerbread)
        arrayListImage.add(R.drawable.kitkat)
        arrayListImage.add(R.drawable.jellybean)



        val name = arrayOf("cupcake", "lollipop", "donut", "froyo", "gingerbread" , "kitkat" , "jellybean")

        val customAdapter =  CustomAdapter(this@MainActivity, arrayListImage, name)
        gridView.adapter = customAdapter

    /*    gridView.setOnItemClickListener(adapterView, parent,  position, l ->
        Toast.makeText(this@MainActivity, "Click on:" + name[position], Toast.LENGTH_LONG.show())) */
    }
}
