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
        // check to see if there is an input file
        try (Scanner reader = new Scanner(Paths.get("data/exercise42_input.txt")))
        {
            // create a list and instantiate a class object to use in your data parser
            List<String> userData = new ArrayList<>();

            DataParser dataParser = new DataParser(userData, reader);

            // take in each line in the file to a list of strings
            dataParser.getUserData();

            // output each string in the correct format in a new file
            dataParser.printUserData();
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
}