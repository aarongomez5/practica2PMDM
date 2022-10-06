package com.example.practica_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.practica_1.databinding.ActivityScrollingBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class ScrollingActivity : AppCompatActivity() {

private lateinit var binding: ActivityScrollingBinding

val alexelcapo = "https://youtube.fandom.com/es/wiki/Alexelcapo"
val knekro = "https://youtube.fandom.com/es/wiki/KNekro"
val juja = "https://juja.fandom.com/wiki/Juja_Wiki"
val illojuan = "https://youtube.fandom.com/es/wiki/IlloJuan"

val openURL = Intent(Intent.ACTION_VIEW)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.content.boton1.setOnClickListener {
            openURL.data = Uri.parse(alexelcapo)
            startActivity(openURL)
        }

        binding.content.boton2.setOnClickListener {
            openURL.data = Uri.parse(knekro)
            startActivity(openURL)
        }

        binding.content.boton3.setOnClickListener {
            openURL.data = Uri.parse(juja)
            startActivity(openURL)
        }

        binding.content.boton4.setOnClickListener {
            openURL.data = Uri.parse(illojuan)
            startActivity(openURL)
        }

        primeraimagen()
        segundaimagen()
        terceraimagen()
        cuartaimagen()
    }

    private fun primeraimagen(url: String = "https://www.famousbirthdays.com/faces/alexelcapo-image.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto1)
    }
    private fun segundaimagen(url: String = "https://www.mystreamlist.com/wp-content/webp-express/webp-images/uploads/2021/02/knekro.jpg.webp") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto2)
    }
    private fun terceraimagen(url: String = "https://yt3.ggpht.com/MibCZFrdagjyt7lk03oFb8Gl7rjWmBlPJePAfea3NpUK6pgzUnzqXFnmNswrOHDKjKTtev03d_A=s88-c-k-c0x00ffffff-no-rj") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto3)
    }
    private fun cuartaimagen(url: String = "https://images.ecestaticos.com/Tu6W7Uy6-SBcidwnAAo-0xmz1U8=/0x0:648x378/557x418/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F718%2F18e%2F5fd%2F71818e5fd3e92891bf8a56f9700c494b.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto4)
    }
}
