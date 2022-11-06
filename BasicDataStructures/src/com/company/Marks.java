package com.company;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int sub1, sub2,sub3;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter marks of subject 1 : ");
        sub1=Sc.nextInt();
        System.out.println("enter marks of subject 2 : ");
        sub2=Sc.nextInt();
        System.out.println("enter marks of subject 3 : ");
        sub3=Sc.nextInt();
        if (sub1>60 && sub2>60 && sub3>60) {
            System.out.println("passed");
        }
        else if ((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)) {
            System.out.println("promoted");
        }
        else if (sub1>60 || sub2>60 || sub3>60 || (sub1<60&&sub2<60&&sub3<60)) {
            System.out.println("failed");
        }

    }
}

