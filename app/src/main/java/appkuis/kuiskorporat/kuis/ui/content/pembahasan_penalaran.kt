package appkuis.kuiskorporat.kuis.ui.content

import android.graphics.pdf.PdfDocument
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codepolitan.quizapp.R
import kotlinx.android.synthetic.main.menu_aplikasi.*


import android.app.Activity
import android.content.Intent
import android.net.Uri

import android.view.View
import androidx.appcompat.app.AlertDialog
import appkuis.kuiskorporat.kuis.repository.Penalaran


import com.downloader.Error
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader

import kotlinx.android.synthetic.main.kunci_penalaran.*
import org.jetbrains.anko.startActivity
import java.io.File

class pembahasan_penalaran : AppCompatActivity() {

    companion object {
        private const val PDF_SELECTION_CODE = 99
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kunci_penalaran)
        PRDownloader.initialize(applicationContext)
        checkPdfAction(intent)
    }

    private fun showPdfFromAssets(pdfName: String) {
        pdfView.fromAsset(pdfName)
            .password(null)
            .defaultPage(0)
            .onPageError { page, _ ->
                Toast.makeText(
                    this@pembahasan_penalaran,
                    "Error at page: $page", Toast.LENGTH_LONG
                ).show()
            }
            .load()
    }
    private fun checkPdfAction(intent: Intent) {
        when (intent.getStringExtra("ViewType")) {
            "assets" -> {
                showPdfFromAssets(Penalaran.getPdfNameFromAssets())
            }

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

