package appquizipa.codepolitan.quizapp.ui.prepare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import com.codepolitan.quizapp.databinding.ActivityPrepareBinding
import appquizipa.codepolitan.quizapp.ui.content.ContentActivityA
import appquizipa.codepolitan.quizapp.ui.content.TopicActivity
import org.jetbrains.anko.startActivity

class PrepareActivity : AppCompatActivity() {

  private lateinit var prepareBinding: ActivityPrepareBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    prepareBinding = ActivityPrepareBinding.inflate(layoutInflater)
    setContentView(prepareBinding.root)

    onClick()
  }

  private fun onClick() {
    prepareBinding.btnStart.setOnClickListener {
      val nickname = prepareBinding.etNickname.text.toString()
      if (checkValidation(nickname)) {
        startActivity<TopicActivity>(
          TopicActivity.EXTRA_NICKNAME to nickname
        )
      }
    }
  }

  private fun checkValidation(nickname: String): Boolean {
    return if (nickname.isEmpty()) {
      prepareBinding.etNickname.error = getString(R.string.please_field_your_nickname)
      false
    } else {
      true
    }
  }
}