package ordunio.maribel.cheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_started : Button = findViewById(R.id.button_started) as Button

        button_started.setOnClickListener{
            var intent : Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}