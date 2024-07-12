package com.example.examenexamen

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examenexamen.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //declarando la vista
    private lateinit var vista: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        vista= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(vista.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //funcion para sumar
        vista.sumar.setOnClickListener {
            sumarNumeros()
        }
        //funcion para restar
        vista.restar.setOnClickListener {
            restarNumeros()
        }
        //funcion para multiplicar
        vista.multiplicar.setOnClickListener {
            multiplicarNumeros()
        }
        //funcion para dividir
        vista.dividir.setOnClickListener {
            dividirNumeros()
        }

        //funcion para encontrar el modulo
        vista.modulo.setOnClickListener {
            moduloNumeros()
        }
        vista.ciclo.setOnClickListener {
            mostrarCicloVida()
        }
    }

    private fun mostrarCicloVida() {
        startActivity(Intent(this,MainActivity3::class.java))
    }

    private fun restarNumeros() {
        if(validarNumeros()){
            //convierte los numeros a flotantes
            val num1=vista.num1.text.toString().toFloat()
            val num2=vista.num2.text.toString().toFloat()
            //realiza la operacion en este caso restar
            val result=num1-num2
            vista.resultado.setText(result.toString())
        }else{
            Toast.makeText(this, "Campos requeridos", Toast.LENGTH_SHORT).show()
        }

    }

    private fun multiplicarNumeros() {
        if(validarNumeros()){
            val num1=vista.num1.text.toString().toFloat()
            val num2=vista.num2.text.toString().toFloat()
            val result=num1*num2
            vista.resultado.setText(result.toString())
        }else{
            Toast.makeText(this, "Campos requeridos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun moduloNumeros() {
        if(validarNumeros()){
            val num1=vista.num1.text.toString().toFloat()
            val num2=vista.num2.text.toString().toFloat()
            val result=num1 % num2
            vista.resultado.setText(result.toString())
        }else{
            Toast.makeText(this, "Campos requeridos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun dividirNumeros() {
        if(validarNumeros()){
            val num1=vista.num1.text.toString().toFloat()
            val num2=vista.num2.text.toString().toFloat()
            val result=num1 /num2
            vista.resultado.setText(result.toString())
        }else{
            Toast.makeText(this, "Campos requeridos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sumarNumeros() {
        if(validarNumeros()){
            val num1=vista.num1.text.toString().toFloat()
            val num2=vista.num2.text.toString().toFloat()
            val result=num1+num2
            vista.resultado.setText(result.toString())
        }else{
            Toast.makeText(this, "Campos requeridos", Toast.LENGTH_SHORT).show()
        }
    }
    //funcion para validar la entrada de datos
    private fun validarNumeros():Boolean{
        val num1=vista.num1.text.toString()
        val num2=vista.num2.text.toString()
        if(num1.isNullOrEmpty() && num2.isNullOrEmpty()){
            //devuelve falso si no se ha completado todos los campos
            return false
        }
        //devuelve verdadero si se ha completado los campos
        return true
    }

}