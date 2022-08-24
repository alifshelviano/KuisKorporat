package appquizipa.codepolitan.quizapp.ui.content
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.topics_option.*
import org.jetbrains.anko.startActivity


class TopicActivity  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
    }
    private var nickname: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topics_option)

        if(intent !=null){
            nickname = intent.getStringExtra(EXTRA_NICKNAME)
        }

        button.setOnClickListener {
            startActivity<ContentActivityA>(
                ContentActivityA.EXTRA_NICKNAME to nickname
            )
        }
        button2.setOnClickListener {
            startActivity<ContentActivityB>(
                ContentActivityB.EXTRA_NICKNAME to nickname
            )
        }
        button3.setOnClickListener {
            startActivity<ContentActivityC>(
                ContentActivityC.EXTRA_NICKNAME to nickname
            )
        }






    }
}