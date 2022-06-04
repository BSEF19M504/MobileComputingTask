package com.example.mobilecomputingtask;

public class QuizUnit {
    public int imageId;
    public char op1;
    public char op2;
    public char op3;
    public char ans;
    public QuizUnit(int i, char o1, char o2, char o3, char a){
        imageId = i;
        op1 = o1;
        op2 = o2;
        op3 = o3;
        ans = a;
    }

    public QuizUnit(int i, char [] op, char a){
        imageId = i;
        op1 = op[0];
        op2 = op[1];
        op3 = op[2];
        ans = a;
    }
    public QuizUnit(int i){
        imageId = i;
        op1 = 0;
        op2 = 0;
        op3 = 0;
        ans = 0;
    }
    public QuizUnit(){
        imageId = 0;
        op1 = 0;
        op2 = 0;
        op3 = 0;
        ans = 0;
    }
}
