/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution42
{
    public static void main(String[] args)
    {
        Solution42 solution = new Solution42();

        // check to see if there is an input file
        try (Scanner reader = new Scanner(Paths.get("data/exercise42_input.txt")))
        {
            List<String> userData = new ArrayList<>();

            // take in each line in the file to a list of strings
            userData = solution.getUserData(reader, userData);

            // output each string in the correct format in a new file
            solution.printUserData(userData);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    private List<String> getUserData(Scanner reader, List<String> userData)
    {
        while(reader.hasNextLine())
        {
            userData.add(reader.nextLine());
        }
        return userData;
    }
    private void printUserData(List<String> userData)
    {
        try (Formatter output = new Formatter("data/exercise42_output.txt"))
        {
            output.format("Last      First     Salary%n--------------------------%n");
            for (int i = 0; i < userData.size(); i++)
            {
                String userDataLine = userData.get(i);

                // use string.split and stringbuilder to separate a line into multiple strings, and create spaces for formatting accordingly
                userDataLine = parseUserData(userDataLine);
                output.format("%s%n", userDataLine);
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    public String parseUserData(String userDataLine)
    {
        StringBuilder parsedUserData = new StringBuilder();

        userDataLine = userDataLine.replace(",", " ");

        String[] newUserData = userDataLine.split(" ");

        for (int i = 0; i < 2; i++)
        {
            int length = 10;
            length -= newUserData[i].length();

            parsedUserData.append(newUserData[i]);

            for (int j = 0; j < length; j++)
            {
                parsedUserData.append(" ");
            }
        }
        parsedUserData.append(newUserData[2]);

        return parsedUserData.toString();
    }
}