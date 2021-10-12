/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.util.Scanner;

public class Solution43
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        // prompt the user for a website name as a one word string
        // prompt the user for an author name for the website
        // prompt the user for a folder used for JS files
        // prompt the user for a folder used for CSS files

        // print the result of all the users inputs
    }
    private String getString(String prompt)
    {
        System.out.print(prompt);

        // websites don't use spaces, so reader.next is used
        String input = reader.next();
        return input;
    }
}