package appkuis.kuiskorporat.kuis.ui.content
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.menu_aplikasi.*
import org.jetbrains.anko.startActivity
import com.codepolitan.quizapp.databinding.ActivityContentBinding

class Menu_aplikasi  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
    }
    private var nickname: String? = null
    private lateinit var contentBinding: ActivityContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_aplikasi)

        if(intent !=null){
            nickname = intent.getStringExtra(EXTRA_NICKNAME)
        }

        button.setOnClickListener {
            startActivity<Topik_psikologi>(
                Soal_Sinonim.EXTRA_NICKNAME to nickname
            )
        }
        button2.setOnClickListener {
            startActivity<Topik_TWK>(
                Soal_Pancasila.EXTRA_NICKNAME to nickname
            )
        }
        button3.setOnClickListener {
            startActivity<Topik_akademik>(
                Soal_Bahasa_indo.EXTRA_NICKNAME to nickname
            )
        }


        button4.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.are_you_sure))
                .setMessage(getString(R.string.message_exit))
                .setPositiveButton(getString(R.string.yes)){ dialog, _->
                    dialog.dismiss()

                    finishAffinity()
                    System.exit(0);
                }
                .setNegativeButton(getString(R.string.no)){ dialog, _->
                    dialog.dismiss()
                }
                .show()
        }




    }
}