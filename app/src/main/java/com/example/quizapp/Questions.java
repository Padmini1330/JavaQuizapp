package com.example.quizapp;

public class Questions {

    public String mQuestions[]= {
            "The default value of a static integer variable of a class in Java is,",
            "Multiple inheritence means,",
            "How many access modifiers are there in java?",
            "which will legally declare,construct and initialize an array?",
            "what is the name of the method used to start a thread execution?",
            "What is the numerical range of char?",
            "which of the following are Java reserved words? 1.run 2.import 3.default 4.implement",
            "how many primitive data types are there in java?",
            "In java byte,short,int and long are",
            "size of int in java is",
            "which of the access modifier means that the field can be accessed by all classes in your application?",
    };
    private String mchoices[][]={
            {"0","1","Garbage value","-1"},
            {"one class inheriting from more super classes","more classes inheriting from one super class","more classes inheriting from more super classs","none of the above"},
            {"2","3","4","1"},
            {"int[] a={'1','2'};","int[] a=(1,2)","int a[][]={1,2}","int a[]={1,2}"},
            {"init();","start();","run();","resume();"},
            {"0 to 32767","0 to 65535","-256 to 255","-32768 to 32767"},
            {"1 and 2","2 and 3","3 and 4","2 and 4"},
            {"6","7","8","9"},
            {"signed","unsigned","both of the above","none of these"},
            {"16 bit","32 bit","64 bit","depends on execution environment"},
            {"private","public","package","protected"},

    };
    private String mcorrectanswers[]={"0","one class inheriting from more super classes","3","int a[]={1,2}","start();","0 to 65535","2 and 3","8","signed","32 bit","public"};
    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }
    public String getchoice1(int a){
        String choice=mchoices[a][0];
    return choice;
    }
    public String getchoice2(int a){
        String choice=mchoices[a][1];
        return choice;
    }
    public String getchoice3(int a){
        String choice=mchoices[a][2];
        return choice;
    }
    public String getchoice4(int a){
        String choice=mchoices[a][3];
        return choice;
    }
    public String getcorrectanswer(int a){
        String answer=mcorrectanswers[a];
        return answer;
    }

}
