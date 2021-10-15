/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution45
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution45 solution = new Solution45();

        // Create a scanner for reading in lines from a file
        try (Scanner reader = new Scanner(Paths.get("data/exercise45_input.txt")))
        {
            System.out.print("Enter the file name: ");
            String outputName = input.next();

            // For each line in the input file, take it as a string, replace all instances of "utilize" with "use"
            // take the new string and output it into an output file
            solution.scanFile(reader, outputName);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    private void scanFile(Scanner reader, String outputName)
    {
        try (Formatter output = new Formatter("data/" + outputName + ".txt"))
        {
            while (reader.hasNextLine())
            {
                String currentLine = reader.nextLine();
                currentLine = replaceKeywordsInString(currentLine, "(?i)utilize", "use");
                output.format("%s%n", currentLine);
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    public String replaceKeywordsInString(String currentLine, String keyword, String replacement)
    {
        currentLine = currentLine.replaceAll(keyword, replacement);
        return currentLine;
    }
}