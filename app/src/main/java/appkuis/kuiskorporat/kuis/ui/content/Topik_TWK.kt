package appkuis.kuiskorporat.kuis.ui.content
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.menu_aplikasi.*
import kotlinx.android.synthetic.main.menu_aplikasi.button
import kotlinx.android.synthetic.main.menu_aplikasi.button2
import kotlinx.android.synthetic.main.menu_aplikasi.button3
import kotlinx.android.synthetic.main.topik_twk.*
import org.jetbrains.anko.startActivity


class Topik_TWK  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
    }
    private var nickname: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topik_twk)

        if(intent !=null){
            nickname = intent.getStringExtra(EXTRA_NICKNAME)
        }

        button.setOnClickListener {
            startActivity<Soal_Pancasila>(
                Soal_Pancasila.EXTRA_NICKNAME to nickname
            )
        }
        button2.setOnClickListener {
            startActivity<Soal_Uud>(
                Soal_Uud.EXTRA_NICKNAME to nickname
            )
        }
        button3.setOnClickListener {
            startActivity<Soal_Nkri>(
                Soal_Nkri.EXTRA_NICKNAME to nickname
            )
        }







    }
    override fun onBackPressed() {
        startActivity<Menu_aplikasi>()
        finishAffinity()

    }
}