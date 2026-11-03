package com.smartomr.scanner

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!OpenCVLoader.initDebug()) {
            Toast.makeText(this, "Ralat memuatkan OpenCV", Toast.LENGTH_SHORT).show()
        }

        val btnSetSchema = findViewById<Button>(R.id.btnSetSchema)
        val btnScan = findViewById<Button>(R.id.btnScan)
        val btnHistory = findViewById<Button>(R.id.btnHistory)

        btnSetSchema.setOnClickListener {
            Toast.makeText(this, "Fungsi Set Skema Jawapan", Toast.LENGTH_SHORT).show()
        }

        btnScan.setOnClickListener {
            Toast.makeText(this, "Fungsi Imbas Kertas", Toast.LENGTH_SHORT).show()
        }

        btnHistory.setOnClickListener {
            Toast.makeText(this, "Fungsi Sejarah Keputusan", Toast.LENGTH_SHORT).show()
        }
    }
}
