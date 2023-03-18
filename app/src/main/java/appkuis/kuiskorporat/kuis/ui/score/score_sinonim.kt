package appkuis.kuiskorporat.kuis.ui.score

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import appkuis.kuiskorporat.kuis.ui.content.*

import com.codepolitan.quizapp.databinding.ActivityScoreBinding
import org.jetbrains.anko.startActivity

import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.activity_score.*

class score_sinonim : AppCompatActivity() {

  companion object{
    const val EXTRA_SCORE = "extra_score"
    const val EXTRA_NICKNAME = "extra_nickname"
  }
  private lateinit var scoreBinding: ActivityScoreBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    scoreBinding = ActivityScoreBinding.inflate(layoutInflater)
    setContentView(scoreBinding.root)

    //Get Data
    if (intent != null){
      val score = intent.getIntExtra(EXTRA_SCORE, 0)
      val nickname = intent.getStringExtra(EXTRA_NICKNAME)

      scoreBinding.tvNickname.text = nickname
      scoreBinding.tvScore.text = score.toString()
    }
    onClick()
  }

  private fun onClick() {
    this.btn_done.setOnClickListener {
      startActivity<pembahasan_sinonim>()
      finishAffinity()
    }
    this.Menu.setOnClickListener {
      startActivity<Menu_aplikasi>()

      finishAffinity()


    }
  }



  override fun onBackPressed() {
    AlertDialog.Builder(this)
      .setTitle(getString(R.string.are_you_sure))
      .setMessage(getString(R.string.message_exit))
      .setPositiveButton(getString(R.string.yes)){ dialog, _->
        dialog.dismiss()
        startActivity<Menu_aplikasi>()
        finishAffinity()
        super.onBackPressed()
      }
      .setNegativeButton(getString(R.string.no)){ dialog, _->
        dialog.dismiss()
      }
      .show()
  }


}