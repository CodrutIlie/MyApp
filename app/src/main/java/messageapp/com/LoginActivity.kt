package messageapp.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import java.time.Duration

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            Log.i("MainActivity", "Login button was clicked")
            Toast.makeText(this, "Login button was clicked", Toast.LENGTH_SHORT).show()
        }

        nextActivityButton.setOnClickListener {
            val message: String = emailAdress.text.toString();
            val intent = Intent(this, DashboardActivity::class.java)
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}