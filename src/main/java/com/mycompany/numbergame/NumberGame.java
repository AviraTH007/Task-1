

package com.mycompany.numbergame;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        int randNum,num;
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        randNum=random.nextInt(100);
        //System.out.println("The random number is "+randNum);
        
        int guess=5;
        System.out.println("Guess a number between 1-100");
        while(guess>1){
        System.out.println("You have "+guess+" guess left");
        num=sc.nextInt();
        if(num==randNum){
            System.out.println("Correct Guess!\nThe number is "+num);
            break;
        }
        else if(num>randNum)
            System.out.println("The number "+num+" is too high");
        else 
            System.out.println("The number "+num+" is a too low");
        guess--;
        }
        if(guess==1){
            System.out.println("Guess the number generated\nYou have "+guess+" guess left");
            num=sc.nextInt();
            if(num==randNum)
                System.out.println("Correct Guess!\nThe number is "+num); 
             else
                System.out.println("Oops! The correct number is "+randNum);
        }
    }
 }
