package com.example.hackathon

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class WatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch)

        // テスト用にWriteDiaryActivityから取得しているが、実際は日付でDBから取得
        val mainText = intent.getStringExtra("TEXT")
        val happinessCount = intent.getIntExtra("HAPPINESS", 50)
        val date = intent.getStringExtra("DATE")
        val year = intent.getIntExtra("YEAR", 1111)
        val month = intent.getIntExtra("MONTH", 11)
        val day = intent.getIntExtra("DAY", 11)

//        var databaseOperation_get = DatabaseOperation(this)
//        val getdata = databaseOperation_get.getDataByDate(year,month,day)
//        val mainText = getdata?.mainText ?:""
//        val happinessCount = getdata?.happiness ?:""

        supportActionBar?.setTitle("${date}")
        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.component_background)))

        val mainTextView = findViewById<TextView>(R.id.main_text_view)
        mainTextView.text = mainText

        val happinessView = findViewById<TextView>(R.id.happiness_view)
        happinessView.text = happinessCount.toString()

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener{
            finish()
        }

        val chatButton = findViewById<Button>(R.id.chat_button)
        chatButton.setOnClickListener {
//            val intent = Intent(this, ChatActivity::class.java)
//            intent.putExtra("TEXT", mainText)
//            intent.putExtra("HAPPINESS", happiness)
//            intent.putExtra("YEAR", year)
//            intent.putExtra("MONTH", month)
//            intent.putExtra("DAY", day)
//            startActivity(intent)
        }
    }
}