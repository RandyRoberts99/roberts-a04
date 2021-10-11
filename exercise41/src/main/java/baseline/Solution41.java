/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution41
{
    public static void main(String[] args)
    {
        Solution41 solution = new Solution41();

        // check to see if there is an input file
        // check while there is an input stream, get the next line
        // add that line into an arraylist and repeat until there are no more lines to add
        // sort the arraylist using collections.sort
        // output the new arraylist in the correct order into a new file

        try(Scanner reader = new Scanner(Paths.get("data/exercise41_input.txt"))) {
            ArrayList<String> names = new ArrayList<String>();
            names = solution.getUnsortedEmployeeList(reader, names);

        }
        catch (NoSuchElementException | IllegalStateException | IOException e) {
            e.printStackTrace();
        }
    }
    private ArrayList<String> getUnsortedEmployeeList(Scanner reader, ArrayList<String> employeeNames)
    {
        while(reader.hasNextLine())
        {
            employeeNames.add(reader.nextLine());
        }
        return employeeNames;
    }
    private void sortEmployeeList(ArrayList<String> names)
    {

    }
    private void printSortedEmployeeList()
    {

    }
}