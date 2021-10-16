import baseline.WebsiteCreator;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

// I can check to see if the creation of any element of my website exists after creation with this method
class Solution43Test
{
    @Test
    void testWebsiteCreationMethod()
    {
        String websiteName = "sampleweb";
        String authorName = "sampleauthor";
        boolean useJS = false;
        boolean useCSS = true;

        WebsiteCreator testWebCreator = new WebsiteCreator(websiteName, authorName, useJS, useCSS);
        testWebCreator.createWebsiteDocuments();

        File cssFile = new File("data/website/" + websiteName + "/css");
        boolean cssFileExists = cssFile.exists();
        assertEquals(true, cssFileExists);

        /*  (for testing if js file exists)
        * File jsFile = new File("data/website/" + websiteName + "/js");
        * boolean jsFileExists = jsFile.exists();
        * assertEquals(false, jsFileExists);
        */
    }
}
