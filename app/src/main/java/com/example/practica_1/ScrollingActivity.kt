package com.example.practica_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica_1.Clases.CentroComercial
import com.example.practica_1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, TiendaActivity::class.java)

        binding.content.cv1.setOnClickListener {
            startActivity(intent)
        }

        binding.content.cv2.setOnClickListener {
            startActivity(intent)
        }

        binding.content.cv3.setOnClickListener {
            startActivity(intent)
        }

        binding.content.cv4.setOnClickListener {
            startActivity(intent)
        }

        primeraimagen()
        segundaimagen()
        terceraimagen()
        cuartaimagen()

        ccdatos()
    }

    private fun primeraimagen(url: String = "https://valenciacity.es/wp-content/uploads/Saler_Pl" +
            "aza-min-1170x658.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto1)
    }
    private fun segundaimagen(url: String = "https://estaticos-cdn.prensaiberica.es/clip/e5f9b4a" +
            "d-e697-420b-9442-027978038449_16-9-discover-aspect-ratio_default_0.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto2)
    }
    private fun terceraimagen(url: String = "https://www.viuvalencia.com/netpublisher/minfo/imag" +
            "enes/5728_GRAN_TURIA.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto3)
    }
    private fun cuartaimagen(url: String = "https://fastly.4sqi.net/img/general/width960/JpMO18" +
            "3v9sXmBpDv1y-KTxCBnzPO0x__CDgVv0YW26o.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.ivFoto4)
    }

    fun ccdatos() {
        val saler = CentroComercial("Av. del Professor López Piñero, 16", "C." +
                "C. El Saler", "4")

        binding.content.direccionsaler.text = saler.direccion
        binding.content.nombresaler.text = saler.nombre
        binding.content.tiendassaler.text = saler.tiendas

        val arena = CentroComercial("C. de Santa Genoveva Torres, 21", "C.C. Arena"
            , "4")

        binding.content.direccionarena.text = arena.direccion
        binding.content.nombrearena.text = arena.nombre
        binding.content.tiendasarena.text = arena.tiendas

        val turia = CentroComercial("Plaza de Europa, s/n", "C.C. Turia",
            "4")

        binding.content.direccionturia.text = turia.direccion
        binding.content.nombreturia.text = turia.nombre
        binding.content.tiendasturia.text = turia.tiendas

        val aqua = CentroComercial("C. de Menorca, 19", "C.C. Aqua",
            "4")

        binding.content.direccionaqua.text = aqua.direccion
        binding.content.nombreaqua.text = aqua.nombre
        binding.content.tiendasaqua.text = aqua.tiendas
    }
}
