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
        try (Scanner reader = new Scanner(Paths.get("data/exercise41_input.txt")))
        {
            List<String> names = new ArrayList<>();

            // check while there is an input stream, get the next line
            // add that line into a list and repeat until there are no more lines to add
            names = solution.getUnsortedNames(reader, names);

            // sort the list using collections.sort
            names = solution.sortNames(names);

            // output the new list in the correct order into a new file
            solution.printNamesToFile(names);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    private List<String> getUnsortedNames(Scanner reader, List<String> employeeNames)
    {
        while(reader.hasNextLine())
        {
            employeeNames.add(reader.nextLine());
        }
        return employeeNames;
    }
    public List<String> sortNames(List<String> names)
    {
        Collections.sort(names);
        return names;
    }
    private void printNamesToFile(List<String> names)
    {
        try (Formatter output = new Formatter("data/exercise41_output.txt"))
        {
            output.format("Total of %d names%n-----------------%n", names.size());
            for (int i = 0; i < names.size(); i++)
            {
                output.format("%s%n", names.get(i));
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
}