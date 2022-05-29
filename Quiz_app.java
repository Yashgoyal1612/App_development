package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Have you ever told about your crush to your parents?", "Have you ever slept in your love one’s laps? ",
            "Have you ever been to your girlfriend’s house all alone which is just you and her sitting on the couch? ",
            "Can you love two people at the same time?", "Will you leave your current girlfriend for 1 billion $ and unexcepted love from your ex"};
    private boolean[] answers = {false, false, false, true, true};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        yes = findViewById(R.id.yes);
//        no = findViewById(R.id.no);
//        question = findViewById(R.id.question);
//        question.setText(questions[index]);
//        yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (index <= questions.length - 1) {
//                    if (answers[index] == true) {
//                        score++;
//                    }
//                    index++;
//                    if (index <= questions.length - 1) {
//                        question.setText(questions[index]);
//                    } else {
//                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
//                    }
//                } else {
//                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
//                }
//            }

//        });
//
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(index <= questions.length-1){
//                    if (answers[index] == false){
//                        score++;
//                    }
//                    index++;
//                    if (index <= questions.length-1){
//                        question.setText(questions[index]);
//                    }
//                    else{
//                        Toast.makeText(MainActivity.this, "Your score is: "+ score, Toast.LENGTH_SHORT).show();
//                    }
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
//                }
//            }
//        }
    }
}
