package org.example;

public class Main {
    public static void main(String[] args) {
        int R0 = 11, R1 = 14;
        for (int i = 0; i < 5; i++) {
            double R2 = halfMultiplication(R0, R1);
            System.out.println(R2);
            R0 = R1;//15
            R1 = (int)(R2*100);//0.211*1000 = 211.0 = 211
        }
    }
    public static double halfMultiplication(int R0, int R1){//R0=11, R1=14
        int n = Integer.toString(R0).length();//2
        int R2 = R0*R1;//R2 = 154
        String R2Str = Integer.toString(R2);//"154"
        if(R2Str.length()<2*n){
            R2Str= "0"+R2Str;//"0154"
        }
        String randomValueSTR = "0."+R2Str.substring((n+1)/2, (n+1)/2+n);//"15"
        return Double.parseDouble(randomValueSTR);
    }
}