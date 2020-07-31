package cz.mtrakal.issues162564820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vEditText.setOnKeyListener { v, keyCode, event ->
            // If the event is a key-down event on the "enter" button
            if (event.action == KeyEvent.ACTION_DOWN) {
                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(this, "Enter pressed!", Toast.LENGTH_SHORT).show()
                }
                vTextView.text = "${vTextView.text}; $keyCode"
            }
            return@setOnKeyListener false
        }
    }
}