import baseline.Solution46;
import baseline.WordCounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution46Test
{
    @Test
    public void testWordPrintingMethod()
    {
        Solution46 testSolution = new Solution46();
        List<WordCounter> testWordCounterList = new ArrayList<>();
        WordCounter testWordCounter = new WordCounter("how", 1);

        try (Scanner reader = new Scanner(Paths.get("data/sample_input2.txt")))
        {
            testWordCounterList = testSolution.scanFile(reader, testWordCounterList);
            assertEquals(testWordCounter.uniqueWord, testWordCounterList.get(0).uniqueWord);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void testWordPrintingMethodTwo()
    {
        Solution46 testSolution = new Solution46();
        List<WordCounter> testWordCounterList = new ArrayList<>();
        WordCounter testWordCounter = new WordCounter("how", 1);

        try (Scanner reader = new Scanner(Paths.get("data/sample_input2.txt")))
        {
            testWordCounterList = testSolution.scanFile(reader, testWordCounterList);
            assertEquals(testWordCounter.wordCount, testWordCounterList.get(0).wordCount);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
