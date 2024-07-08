package com.example.englishquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val score = intent.getIntExtra(Constants.SCORE, 0)

        val congratulationsTv: TextView = findViewById(R.id.congratulationsTv)
        val scoreTv: TextView = findViewById(R.id.scoreTv)
        val btnRestart: Button = findViewById(R.id.btnRestart)

        val message = when {
            score < 5 -> "Try Again, $userName!"
            score in 5..7 -> "Not Bad, $userName!"
            score in 8..10 -> "Great, $userName!"
            else -> "Congratulations, $userName!"
        }

        congratulationsTv.text = message
        scoreTv.text = "Your score is $score out of $totalQuestions"

        btnRestart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
