package com.example.quizapp;

public class Questions3 {

        public String mQuestions[]= {
                "Which of these is a method of the Object class? ",
                "Which of these methods does not guarantee that a thread will leave the running state",
                "which method registers a thread in a thread scheduler?",
                "which class does not override the equals() and hashcode() methods,inheriting them directly from Class Object?",
                "which interface does java.util.Hashable implement?",
                "which is valid declaration of a float?",
                "TCP,FTP,Telnet,SMTP,POP etc. are examples of ?",
                "Which packages does a JSP API consist of?",
                "In the following statements identify the disadvantages of CGI?",
                "the wrapper classes are part of the which package,that is imported by default into all java programs?",
                "which is a perfect example of runtime polymorphism?",
        };
        private String mchoices[][]={
                {"notify();","interrupt();","sleep();","yield();"},
                {"wait();","sleep();","notify();","aLiveThread.join();"},
                {"run();","construct();","start();","register();"},
                {"java.lang.String","java.lang.Double","java.lang.StringBuffer","java.lang.Character"},
                {"java.util.Map","java.util.List","java.util.HashTable","java.util.Collection",},
                {"float f=1F;","float f=1.0;","float f='1';","float f=1.0d;"},
                {"Socket","IP Address","Protocol","MAC Address"},
                {"javax.servlet.jsp","java.servlet","javax.servlet.jsp.tagext","Both A & C"},
                {"If number of clients increases, it takes more time for sending response","For each request, it starts a process and Web server is limited to start processes","It uses platform dependent language e.g. C, C++, perl", "All mentioned above"},
                {"java.lang","java.awt","java.io","java.util"},
                {"method overloading","method overriding","constructor overloading","none of the above"}

        };
        private String mcorrectanswers[]={"notify();","notify();","start();","java.lang.StringBuffer","java.util.Map","float f=1F;","Protocol"," Both A & C","All mentioned above","java.lang","method overiding"};
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


