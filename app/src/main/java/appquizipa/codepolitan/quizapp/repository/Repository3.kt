package appquizipa.codepolitan.quizapp.repository

import android.content.Context
import appquizipa.codepolitan.quizapp.model.Content
import appquizipa.codepolitan.quizapp.model.Contents
import com.google.gson.Gson
import java.io.IOException

object Repository3 {
  fun getDataContents(context: Context?): List<Content>? {
    val json: String?
    try {
      val inputStream = context?.assets?.open("json/contents3.json")
      json = inputStream?.bufferedReader().use { it?.readText() }
    } catch (e: IOException) {
      return null
    }
    val contents = Gson().fromJson(json, Contents::class.java)
    return contents.contents
  }
}