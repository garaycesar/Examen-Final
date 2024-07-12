package com.example.examenexamen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examenexamen.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var vista:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        vista=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(vista.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mostrarCiclo()
    }
    private  fun mostrarCiclo(){

        vista.mostrar.setText(" Creación (onCreate):\n" +
                "\n" +
                "Este método se llama cuando la actividad se crea por primera vez.\n" +
                "Se utiliza para inicializar la actividad, inflar el diseño de la interfaz de usuario y configurar\n" +
                " los componentes de la actividad.\n" +
                "Inicio (onStart):\n" +
                "\n" +
                "Este método se llama cuando la actividad se vuelve visible para el usuario.\n" +
                "Se utiliza para preparar la actividad para la interacción del usuario, como iniciar animaciones\n" +
                "o cargar datos.\n" +
                "Resumen (onResume):\n" +
                "\n" +
                "Este método se llama cuando la actividad se convierte en la actividad en primer plano.\n" +
                "Se utiliza para hacer que la actividad sea interactiva y responder a los eventos del usuario.\n" +
                "Pausa (onPause):\n" +
                "\n" +
                "Este método se llama cuando la actividad pierde el foco, pero aún es visible.\n" +
                "Se utiliza para guardar el estado de la actividad, como la posición del scroll o el texto\n" +
                "introducido en un campo de entrada.\n" +
                "Detención (onStop):\n" +
                "\n" +
                "Este método se llama cuando la actividad se vuelve invisible para el usuario.\n" +
                "Se utiliza para liberar recursos que ya no son necesarios, como detener animaciones o\n" +
                " cerrar conexiones de red.\n" +
                "Destrucción (onDestroy):\n" +
                "\n" +
                "Este método se llama cuando la actividad se destruye por completo.\n" +
                "Se utiliza para liberar todos los recursos que la actividad haya utilizado, como cerrar archivos\n" +
                " o cancelar tareas en segundo plano.")
    }
}