package sg.edu.rp.c346.id19022187.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer= findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");

        Intent intent = getIntent();
        String qSelected = intent.getStringExtra("Question1");
        tvAnswer.setText(qSelected + " answer is: Queue");
    }
}
