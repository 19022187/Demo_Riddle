package sg.edu.rp.c346.id19022187.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAns= findViewById(R.id.textView2);
        tvAns.setText("In Third Activity");

        Intent intent = getIntent();
        String qSelected = intent.getStringExtra("Question2");
        tvAns.setText(qSelected + " answer is: Gone");
    }
}
