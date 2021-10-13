import baseline.DataParser;
import baseline.Solution42;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution42Test
{
    @Test
    void testParseData()
    {
        DataParser dp = new DataParser(null, null);
        String unparsedData = "Ling,Mai,55900";
        unparsedData = dp.parseUserData(unparsedData);
        assertEquals("Ling      Mai       55900", unparsedData);
    }
}