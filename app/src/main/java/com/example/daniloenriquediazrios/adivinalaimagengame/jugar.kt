package com.example.daniloenriquediazrios.adivinalaimagengame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_jugar.*

class jugar : AppCompatActivity() {

    var listimages= hashMapOf<String,Int>( "Tsunade" to R.mipmap.img12, "Goku" to R.mipmap.img10,
            "Naruto" to R.mipmap.img11, "Vegeta" to R.mipmap.img13, "Black" to  R.mipmap.img2,
            "Charizard" to R.mipmap.img3, "Gengar" to R.mipmap.img4, "Articuno" to R.mipmap.img5,
            "Shikamaru" to R.mipmap.img6, "Hinata" to R.mipmap.img7, "Gohan" to R.mipmap.img8,
            "Azuma" to R.mipmap.img9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)

        imageView.setImageResource(listimages.get("Tsunade")!!)
        imageView.setImageResource(listimages.get("Goku")!!)
        imageView.setImageResource(listimages.get("Naruto")!!)
        imageView.setImageResource(listimages.get("Vegeta")!!)
        imageView.setImageResource(listimages.get("Black")!!)
        imageView.setImageResource(listimages.get("Charizard")!!)
        imageView.setImageResource(listimages.get("Gengar")!!)
        imageView.setImageResource(listimages.get("Articuno")!!)
        imageView.setImageResource(listimages.get("Shikamaru")!!)
        imageView.setImageResource(listimages.get("Hinata")!!)
        imageView.setImageResource(listimages.get("Gohan")!!)
        imageView.setImageResource(listimages.get("Azuma")!!)



    }
}
