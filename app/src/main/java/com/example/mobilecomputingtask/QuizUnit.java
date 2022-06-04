package com.example.mobilecomputingtask;

public class QuizUnit {
    public int imageId;
    public char op1;
    public char op2;
    public char op3;
    public String name;
    public QuizUnit(int i, String s, char o1, char o2, char o3){
        imageId = i;
        name = s;
        op1 = o1;
        op2 = o2;
        op3 = o3;
    }
    public QuizUnit(int i){
        imageId = i;
        name = null;
        op1 = 0;
        op2 = 0;
        op3 = 0;
    }
    public QuizUnit(){
        imageId = 0;
        name = null;
        op1 = 0;
        op2 = 0;
        op3 = 0;
    }
}
