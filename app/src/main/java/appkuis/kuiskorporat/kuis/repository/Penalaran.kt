package appkuis.kuiskorporat.kuis.repository
import android.content.Context
import appkuis.kuiskorporat.kuis.model.Content
import appkuis.kuiskorporat.kuis.model.Contents
import com.google.gson.Gson
import java.io.IOException

object Penalaran {
  fun getDataContents(context: Context?): List<Content>? {
    val json: String?
    try {
      val inputStream = context?.assets?.open("json/penalaran.json")
      json = inputStream?.bufferedReader().use { it?.readText() }
    } catch (e: IOException) {
      return null
    }
    val contents = Gson().fromJson(json, Contents::class.java)
    return contents.contents
  }
  fun getPdfNameFromAssets(): String {
    return "kunci_penalaran.pdf"
  }
}