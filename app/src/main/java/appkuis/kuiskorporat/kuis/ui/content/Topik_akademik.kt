package appkuis.kuiskorporat.kuis.ui.content
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R

import kotlinx.android.synthetic.main.topics_akademik.button
import kotlinx.android.synthetic.main.topics_akademik.button2
import kotlinx.android.synthetic.main.topics_akademik.button3
import org.jetbrains.anko.startActivity


class Topik_akademik  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
    }
    private var nickname: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topics_akademik)

        if(intent !=null){
            nickname = intent.getStringExtra(EXTRA_NICKNAME)
        }

        button.setOnClickListener {
            startActivity<Soal_Bahasa_indo>(
                Soal_Antonim.EXTRA_NICKNAME to nickname
            )
        }
        button2.setOnClickListener {
            startActivity<Soal_Bahasa_ing>(
                Soal_Pancasila.EXTRA_NICKNAME to nickname
            )
        }
        button3.setOnClickListener {
            startActivity<Soal_Matematika>(
                Soal_Antonim.EXTRA_NICKNAME to nickname
            )
        }





    }
    override fun onBackPressed() {
        startActivity<Menu_aplikasi>()
        finishAffinity()

    }
}