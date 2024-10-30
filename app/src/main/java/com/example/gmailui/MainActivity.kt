package com.example.gmailui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailui.ui.theme.GmailUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        // Tao data
        var mails = mutableListOf<Mail>()
        val mail1 = Mail("Edurila.com","advertisement",
            "Are you looking to Learn Web Designing","12:34 AM")
        val mail2 = Mail("Chrish Abad", "Take survey", "Let us know your though", "11:22 AM")
        val mail3 = Mail("Tuto.com", "You have a meeting", "Your presentation will start at 9:00 am tomorrow", "11:04 AM")
        val mail4 = Mail("Support", "Make you better", "Attend our courses for your coding skill", "1:35 PM")
        val mail5 = Mail("Edurila.com", "Discount on Web Design Courses!", "Grab your discount for the best-selling web design course. Limited spots available!", "12:34 PM")
        val mail6 = Mail("Chris Abad", "Campaign Monitor Feedback", "We would love to hear your thoughts on how we can improve Campaign Monitor.", "11:22 AM")
        val mail7 = Mail("Matt from Ionic", "Introducing the New Ionic Creator", "Check out the all-new Ionic Creator with improved features and a smoother experience.", "5:50 PM")
        val mail8 = Mail("GitHub", "New Pull Request in Project-X", "A new pull request has been created in your repository. Review and merge if everything looks good.", "7:45 AM")
        val mail9 = Mail("Customer Support", "Ticket #12345 Resolved", "Your support ticket has been successfully resolved.", "3:47 PM")
        val mail10 = Mail("Spotify", "Your Weekly Playlist is Here!", "Enjoy your personalized playlist based on your recent listening habits. Happy listening!.", "Yesterday")
        val mail11 = Mail("Stack Overflow", "You've earned a new badge!", "Congratulations! You've earned the 'Enthusiast' badge. Keep participating to earn more.", "Last week")
        val mail12 = Mail("Amazon", "Your Order has been Shipped!", "Your recent purchase has been shipped and is on its way to you. Track your order for more details.", "Last week")
        mails.add(mail1)
        mails.add(mail2)
        mails.add(mail3)
        mails.add(mail4)
        mails.add(mail5)
        mails.add(mail6)
        mails.add(mail7)
        mails.add(mail8)
        mails.add(mail9)
        mails.add(mail10)
        mails.add(mail11)
        mails.add(mail12)
        Log.d("Adapter", "Mails size: ${mails.size}")

        // Adapter
        val adapter = NewAdapter(mails)
        // recycleview
        val recyclerView = findViewById<RecyclerView>(R.id.recycle1)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}

