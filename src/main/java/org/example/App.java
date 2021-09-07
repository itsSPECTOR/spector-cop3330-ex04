package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Reese Spector
 */

public class App 
{
    public static void main( String[] args )
    {

        // ask for quote
        Scanner input = new Scanner(System.in);

        //noun
        System.out.print("Enter a noun: ");
        String myNoun = input.nextLine();

        //verb
        System.out.print("Enter a verb: ");
        String myVerb = input.nextLine();

        //adjective
        System.out.print("Enter a adjective: ");
        String myAdj = input.nextLine();

        //adverb
        System.out.print("Enter a adverb: ");
        String myAdv = input.nextLine();

        // print
        System.out.print("Hey! Your " + myAdj + " " + myNoun + " is " + myVerb + " " + myAdv + ", fix it!" );

    }
}
