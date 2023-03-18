package appkuis.kuiskorporat.kuis.ui.score

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import appkuis.kuiskorporat.kuis.ui.content.Menu_aplikasi
import appkuis.kuiskorporat.kuis.ui.content.Topik_psikologi

import appkuis.kuiskorporat.kuis.ui.content.pembahasan_penalaran
import com.codepolitan.quizapp.databinding.ActivityScoreBinding
import appkuis.kuiskorporat.kuis.ui.main.MainActivity
import com.codepolitan.quizapp.R
import org.jetbrains.anko.startActivity

class score_penalaran : AppCompatActivity() {

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
    this.scoreBinding.btnDone.setOnClickListener {
      val intent = Intent(this, pembahasan_penalaran::class.java)
      intent.putExtra("ViewType", "assets")
      intent.getIntExtra(EXTRA_SCORE, 0)
      intent.getStringExtra(EXTRA_NICKNAME)
      startActivity(intent)

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