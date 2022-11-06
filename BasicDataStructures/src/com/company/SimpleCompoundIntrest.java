package com.company;
import  java.util.Scanner;
public class SimpleCompoundIntrest {

    public static void main(String[] args) {
        double SI,CI,p,r,t;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter principle");
        p=Sc.nextDouble();
        System.out.println("enter rate");
        r=Sc.nextDouble();
        System.out.println("enter time");
        t=Sc.nextDouble();
        SI=(p*t*r/100);
        System.out.println("simple interest is "+SI);
        CI=p*Math.pow(1+r/100,t)-p;
        System.out.println("compound interest is "+CI);


    }
}

