package com.example.quizapp;

public class Questions2{

        public String mQuestions[]= {
                "Which of the following will directly stop the execution of a Thread",
                "Multiple inheritence means",
                "What is XML used to simplify?",
                "Give the abbrevation of BSD.",
                "Which are also known as inner classes?",
                "which method is used in thread class to test if the current thread has been interrupted?",
                "what is used to convert the byte-oriented stream into character-oriented stream?",
                "which class cannot be instantiated?",
                "which method cannot be overridden?",
                "where are these five keywords try,catch,finally,throw and throws used in?",
                "which specification that provides runtime environment in which java byte code can be executed?",
                "Which field cannot be changed after the object has been constructed?",
        };
        private String mchoices[][]={
                {"wait()","notify()","notifyall()","yield()"},
                {"one class inheriting from more super classes","more classes inheriting from one super class","more classes inheriting from more super classs","none of the abaove"},
                {"Data storage","Data sharing","Both A & B","None of the above"},
                {"Berkeley Software Distribution","Berkeley Socket Distribution","Berkeley System Distribution","None of the above"},
                {"Non-static nested class","Static nested class","Nested class","None of the above"},
                {"public static boolean interrupted()","public boolean isInterrupted()","public void interrupt()","public boolean isAlive()"},
                {"console","scanner","inputstreamreader","datainputstream"},
                {"abstract class","static class","both a and b","none of the above"},
                {"final method","final class","final variable","both a and c"},
                {"exception handling","string handling","event handling","none of the above"},
                {"mars","JVM","JRE","none of the above"},
                {"Static field","Non-static field","Final field","Naming field"},

        };
        private String mcorrectanswers[]={"wait()","one class inheriting from more super classes","Both A & B","Berkeley Software Distribution","Non-static nested class","public static boolean interrupted()","inputstreamreader","abstract class","final method","exception handling","JVM","Final field"};
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

