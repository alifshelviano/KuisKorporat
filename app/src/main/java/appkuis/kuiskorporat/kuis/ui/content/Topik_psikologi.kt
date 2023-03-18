package appkuis.kuiskorporat.kuis.ui.content
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R



import kotlinx.android.synthetic.main.topik_psikologi.*
import org.jetbrains.anko.startActivity


class Topik_psikologi  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
    }
    private var nickname: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topik_psikologi)

        if(intent !=null){
            nickname = intent.getStringExtra(EXTRA_NICKNAME)
        }

        sin.setOnClickListener {
            startActivity<Soal_Sinonim>(
                Soal_Sinonim.EXTRA_NICKNAME to nickname
            )
        }
        ant.setOnClickListener {
            startActivity<Soal_Antonim>(
                Soal_Antonim.EXTRA_NICKNAME to nickname
            )
        }
        pen.setOnClickListener {
            startActivity<Soal_Penalaran>(
                Soal_Penalaran.EXTRA_NICKNAME to nickname
            )
        }
        der.setOnClickListener {
            startActivity<Soal_Deret>(
                Soal_Deret.EXTRA_NICKNAME to nickname
            )
        }






    }
    override fun onBackPressed() {
                startActivity<Menu_aplikasi>()
                finishAffinity()

    }
}