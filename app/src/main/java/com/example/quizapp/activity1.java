package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class activity1 extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,question;
    private Questions mquestions=new Questions();
    private String manswer;
    private int mscore=0;
    private int mQuestionslength=mquestions.mQuestions.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        r=new Random();

        answer1=(Button) findViewById(R.id.answer1);
        answer2=(Button) findViewById(R.id.answer2);
        answer3=(Button) findViewById(R.id.answer3);
        answer4=(Button) findViewById(R.id.answer4);

        score=(TextView)findViewById(R.id.score);
        question=(TextView)findViewById(R.id.question);
        score.setText("Score  "+mscore);
        updateQuestion(r.nextInt(mQuestionslength));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText()==manswer){
                    mscore++;
                    score.setText("Score "+mscore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameover();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText()==manswer){
                    mscore++;
                    score.setText("Score  "+mscore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameover();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText()==manswer){
                    mscore++;
                    score.setText("Score  "+mscore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameover();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText()==manswer){
                    mscore++;
                    score.setText("Score  "+mscore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameover();
                }

            }
        });
    }

    private void updateQuestion(int num){
        question.setText(mquestions.getQuestion(num));
        answer1.setText(mquestions.getchoice1(num));
        answer2.setText(mquestions.getchoice2(num));
        answer3.setText(mquestions.getchoice3(num));
        answer4.setText(mquestions.getchoice4(num));
        manswer=mquestions.getcorrectanswer(num);

    }
    private void gameover(){
        AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(activity1.this);
        alertdialogbuilder.setMessage("Game over! Your score is "+mscore+" points.")
                .setCancelable(false)
                .setPositiveButton("New game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),activity1.class));
                                finish();
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertdialogbuilder.create();
        alertDialog.show();

    }
}



