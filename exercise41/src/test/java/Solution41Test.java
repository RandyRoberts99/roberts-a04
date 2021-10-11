import baseline.Solution41;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution41Test extends Solution41
{
    @Test
    private void testNameSortingMethod()
    {
        Solution41 testSolution = new Solution41();
        ArrayList<String> testNames = new ArrayList<String>();
        testNames.add("Ling, Mai");
        testNames.add("Johnson, Jim");
        testNames.add("Zarnecki, Sabrina");
        testNames.add("Jones, Chris");
        testNames.add("Jones, Aaron");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");
        testNames = testSolution.sortEmployeeList(testNames);
        assertEquals(testNames, "1");
    }
}