package com.example.practica_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica_1.Clases.Tienda
import com.example.practica_1.databinding.TiendaActivityBinding

class TiendaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tienda_activity)

        binding = TiendaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ScrollingActivity::class.java)

        binding.tienda.volver.setOnClickListener {
            startActivity(intent)
        }

        cabecera1()
        cabecera2()
        cabecera3()
        cabecera4()

        tiendadatos()
    }

    private lateinit var binding: TiendaActivityBinding

    private fun cabecera1(url: String = "https://turbologo.com/articles/wp-content/uploads/" +
            "2019/07/The-Trefoil-adidas-logo-1.jpg.webp") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into((binding.tienda.cabecera1))
    }

    private fun cabecera2(url: String = "https://www.eluniversal.com.mx/sites/default/files/" +
            "2019/01/29/zara-logo-cambio-1.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into((binding.tienda.cabecera2))
    }

    private fun cabecera3(url: String = "https://ccairesur.com/wp-content/uploads/2017/" +
            "03/game-1.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into((binding.tienda.cabecera3))
    }

    private fun cabecera4(url: String = "https://marcaporhombro.com/wp-content/uploads/" +
            "2011/10/carrefour-logo-1973.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into((binding.tienda.cabecera4))
    }

    fun tiendadatos() {
        val adidas = Tienda("ADIDAS", "Tienda de deportes absurdamente cara.")

        binding.tienda.nomadidas.text = adidas.nombre
        binding.tienda.desadidas.text = adidas.descripcion

        val zara = Tienda("ZARA", "Tienda de ropa y cosas de esas.")

        binding.tienda.nomzara.text = zara.nombre
        binding.tienda.deszara.text = zara.descripcion

        val game = Tienda("GAME", "Tienda de videojueguitos.")

        binding.tienda.nomgame.text = game.nombre
        binding.tienda.desgame.text = game.descripcion

        val carrefour = Tienda("CARREFOUR", "Un supermercao.")

        binding.tienda.nomcarrefour.text = carrefour.nombre
        binding.tienda.descarrefour.text = carrefour.descripcion

    }
}