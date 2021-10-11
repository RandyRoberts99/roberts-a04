/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution41
{
    public static void main(String[] args)
    {
        Solution41 solution = new Solution41();

        // check to see if there is an input file
        try (Scanner reader = new Scanner(Paths.get("data/exercise41_input.txt"))) {

            ArrayList<String> names = new ArrayList<String>();

            // check while there is an input stream, get the next line
            // add that line into an arraylist and repeat until there are no more lines to add
            names = solution.getUnsortedNames(reader, names);

            // sort the arraylist using collections.sort
            names = solution.sortNames(names);

            // output the new arraylist in the correct order into a new file
            solution.printNamesToFile(names);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e) {
            e.printStackTrace();
        }
    }
    private ArrayList<String> getUnsortedNames(Scanner reader, ArrayList<String> employeeNames)
    {
        while(reader.hasNextLine())
        {
            employeeNames.add(reader.nextLine());
        }
        return employeeNames;
    }
    public ArrayList<String> sortNames(ArrayList<String> names)
    {
        Collections.sort(names);
        return names;
    }
    private void printNamesToFile(ArrayList<String> names)
    {
        try (Formatter output = new Formatter("data/exercise41_output.txt"))
        {
            output.format("Total of %d names\n-----------------\n", names.size());
            for (int i = 0; i < names.size(); i++)
            {
                output.format("%s\n", names.get(i));
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
}