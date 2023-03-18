package appkuis.kuiskorporat.kuis.ui.content

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.menu_aplikasi.*

class pembahasan_pancasila : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kunci_pancasila)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.text_view_id2) as TextView
        textView?.setOnClickListener{ Toast.makeText(this@pembahasan_pancasila,
            R.string.text_on_click, Toast.LENGTH_LONG).show() }

            button.setOnClickListener {
                finishAffinity()
                System.exit(0);

        }
    }
}