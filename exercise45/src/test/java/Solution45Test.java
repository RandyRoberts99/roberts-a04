import baseline.Solution45;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution45Test
{
    @Test
    void testReplacementMethod()
    {
        Solution45 testSolution = new Solution45();
        String sampleStr = "We must utilize deez nuts to accomplish our goals of world domination.";
        sampleStr = testSolution.replaceKeywordsInString(sampleStr, "(?i)utilize", "use");
        assertEquals("We must use deez nuts to accomplish our goals of world domination.", sampleStr);
    }
}