package appkuis.kuiskorporat.kuis.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import appkuis.kuiskorporat.kuis.ui.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    delayAndGotoMain()
  }

  private fun delayAndGotoMain() {
    Handler(Looper.getMainLooper()).postDelayed({
      startActivity<MainActivity>()
    }, 1200)
  }
}