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
        Solution43 solution = new Solution43();

        // prompt the user for a website name as a one word string
        String websiteName = solution.getString("Site name: ");

        // prompt the user for an author name for the website
        String authorName = solution.getString("Author: ");

        // prompt the user for a folder used for JS files
        boolean useJS = solution.getResponse("Do you want a folder for JavaScript? ");

        // prompt the user for a folder used for CSS files
        boolean useCSS = solution.getResponse("Do you want a folder for CSS? ");

        // print the result of all the users inputs
        WebsiteCreator websiteCreator = new WebsiteCreator(websiteName, authorName, useJS, useCSS);

        websiteCreator.createWebsiteDocuments();
    }
    private String getString(String prompt)
    {
        System.out.print(prompt);
        // websites don't use spaces, so reader.next is used
         return reader.next();
    }
    private boolean getResponse(String prompt)
    {
        boolean notValidResponse = true;
        String userResponse = "";

        while (notValidResponse)
        {
            System.out.print(prompt);
            userResponse = reader.next();
            if (userResponse.equalsIgnoreCase("Y") || userResponse.equalsIgnoreCase("N"))
            {
                notValidResponse = false;
            }
            else
            {
                System.out.print("Not a valid response! Please use 'Y' or 'N' for your response.\n");
            }
        }
        boolean isUsed = false;

        if (userResponse.equalsIgnoreCase("Y"))
        {
            isUsed = true;
        }
        return isUsed;
    }
}