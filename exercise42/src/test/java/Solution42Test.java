import baseline.Solution42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution42Test
{
    @Test
    void testParseData()
    {
        Solution42 solutionTest = new Solution42();
        String unparsedData = "Ling,Mai,55900";
        unparsedData = solutionTest.parseUserData(unparsedData);
        assertEquals("Ling      Mai       55900", unparsedData);
    }
}