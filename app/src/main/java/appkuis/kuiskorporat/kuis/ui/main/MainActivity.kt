package appkuis.kuiskorporat.kuis.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.databinding.ActivityMainBinding
import appkuis.kuiskorporat.kuis.ui.prepare.PrepareActivity
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

  private lateinit var mainBinding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mainBinding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(mainBinding.root)

    onClick()
  }

  private fun onClick() {
    mainBinding.btnPlay.setOnClickListener {
      startActivity<PrepareActivity>()
    }
  }
}