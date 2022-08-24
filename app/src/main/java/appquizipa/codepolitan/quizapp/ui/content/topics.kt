package appquizipa.codepolitan.quizapp.ui.content

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.topics_option.*
import kotlinx.android.synthetic.main.topics_option.view.*

class topics  : AppCompatActivity(){
    companion object{
        const val EXTRA_NICKNAME = "extra_nickname"
        const val EXTRA_CONTENTS = "extra_contents"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topics_option)
        button.setOnClickListener{
            val intent = Intent(this, ContentActivityA::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, ContentActivityB::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this, ContentActivityC::class.java)
            startActivity(intent)}



    }
}
