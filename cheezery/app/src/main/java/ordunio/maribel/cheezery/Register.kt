package ordunio.maribel.cheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button_signin : Button = findViewById(R.id.btn_sign) as Button

        var intent : Intent = Intent(this, MenuActivity::class.java)
    }
}