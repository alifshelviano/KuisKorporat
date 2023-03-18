package appkuis.kuiskorporat.kuis.ui.content

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.menu_aplikasi.*
import org.jetbrains.anko.startActivity

class pembahasan_sinonim : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kunci_sinonim)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.text_view_id) as TextView
        textView?.setOnClickListener{ Toast.makeText(this@pembahasan_sinonim,
            R.string.text_on_click, Toast.LENGTH_LONG).show() }
        button.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.are_you_sure))
                .setMessage(getString(R.string.message_exit))
                .setPositiveButton(getString(R.string.yes)){ dialog, _->
                    dialog.dismiss()
                    finishAffinity()
                    System.exit(0);
                    super.onBackPressed()
                }
                .setNegativeButton(getString(R.string.no)){ dialog, _->
                    dialog.dismiss()
                }
                .show()


        }

    }
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.are_you_sure))
            .setMessage(getString(R.string.message_exit))
            .setPositiveButton(getString(R.string.yes)){ dialog, _->
                dialog.dismiss()
                startActivity<Topik_psikologi>()
                finishAffinity()
                super.onBackPressed()
            }
            .setNegativeButton(getString(R.string.no)){ dialog, _->
                dialog.dismiss()
            }
            .show()
    }
}