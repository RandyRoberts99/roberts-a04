import baseline.Solution41;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution41Test extends Solution41
{
    @Test
    void testNameSortingMethod()
    {
        Solution41 testSolution = new Solution41();
        List<String> testNames = new ArrayList<>();

        testNames.add("Ling, Mai");
        testNames.add("Johnson, Jim");
        testNames.add("Zarnecki, Sabrina");
        testNames.add("Jones, Chris");
        testNames.add("Jones, Aaron");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");

        testNames = testSolution.sortNames(testNames);

        // check if collections.sort is working correctly for any given line
        assertEquals("Johnson, Jim", testNames.get(0));
    }
}