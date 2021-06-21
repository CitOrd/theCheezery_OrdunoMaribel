package ordunio.maribel.cheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var intent = Intent(this, Productos::class.java)

        val btn_ColdDrinks: Button = findViewById(R.id.cold_drinks) as Button
        val btn_hotDrinks: Button = findViewById(R.id.hot_drinks) as Button
        val btn_sweets: Button = findViewById(R.id.sweets) as Button
        val btn_salties: Button = findViewById(R.id.salties) as Button



        btn_ColdDrinks.setOnClickListener{
            intent.putExtra("type","coldDrinks")
            startActivity(intent)
        }

        btn_hotDrinks.setOnClickListener{
            intent.putExtra("type","hotDrinks")
            startActivity(intent)
        }
        btn_sweets.setOnClickListener{
            intent.putExtra("type","sweets")
        }

        btn_salties.setOnClickListener{
            intent.putExtra("type","salties")
            startActivity(intent)
        }
    }
}