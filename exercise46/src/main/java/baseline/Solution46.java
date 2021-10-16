/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution46
{
    public static void main(String[] args)
    {
        Solution46 solution = new Solution46();
        // get the input file
        try (Scanner reader = new Scanner(Paths.get("data/exercise46_input.txt")))
        {
            // create a list to hold every unique word and integer representing the number of said unique words.
            List<WordCounter> wordCounterList = new ArrayList<>();

            // Go through the input file and determine if each word is unique or not, and add to words that
            // have already been made unique.
            // return a new list with all the unique words in a file and their counters.
            wordCounterList = solution.scanFile(reader, wordCounterList);

            // print each word (by descending word count) in order.
            solution.printWordsInOrder(wordCounterList);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    public List<WordCounter> scanFile(Scanner reader, List<WordCounter> wordCounterList)
    {
        while (reader.hasNext())
        {
            boolean unregisteredWord = true;
            String currentWord = reader.next();

            for (int i = 0; i < wordCounterList.size(); i++)
            {
                if (wordCounterList.get(i).uniqueWord.equalsIgnoreCase(currentWord))
                {
                    wordCounterList.get(i).wordCount++;
                    unregisteredWord = false;
                }
            }
            if (unregisteredWord)
            {
                WordCounter newWord = new WordCounter(currentWord, 1);
                wordCounterList.add(newWord);
            }
        }
        return wordCounterList;
    }
    public void printWordsInOrder(List<WordCounter> wordCounterList)
    {
        while (!wordCounterList.isEmpty())
        {
            int maxWordAmount = -1;
            int maxWordAmountIndex = -1;

            for (int i = 0; i < wordCounterList.size(); i++)
            {
                if (wordCounterList.get(i).wordCount > maxWordAmount)
                {
                    maxWordAmount = wordCounterList.get(i).wordCount;
                    maxWordAmountIndex = i;
                }
            }
            printWord(wordCounterList.get(maxWordAmountIndex));
            wordCounterList.remove(maxWordAmountIndex);
        }
    }
    public void printWord(WordCounter highestWord)
    {
        System.out.print(highestWord.uniqueWord + ":");
        int numSpaces = 10 - highestWord.uniqueWord.length() - 1;
        
        for (int i = 0; i < numSpaces; i++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < highestWord.wordCount; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}