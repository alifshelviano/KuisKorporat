package appquizipa.codepolitan.quizapp.ui.content
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.topics_option.*
import org.jetbrains.anko.startActivity


class TopicActivity  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
        private var nickname: String? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topics_option)
        button.setOnClickListener {
            val intent = Intent(this, ContentActivityA::class.java)
            startActivity<ContentActivityA>(
                ContentActivityA.EXTRA_NICKNAME to nickname
            )
        }
        button.setOnClickListener {
            val intent = Intent(this, ContentActivityB::class.java)
            startActivity<ContentActivityB>(
                ContentActivityB.EXTRA_NICKNAME to nickname
            )
        }
        button.setOnClickListener {
            val intent = Intent(this, ContentActivityC::class.java)
            startActivity<ContentActivityC>(
                ContentActivityC.EXTRA_NICKNAME to nickname
            )
        }






    }
}