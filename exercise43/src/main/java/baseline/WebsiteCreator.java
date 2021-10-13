/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;

public class WebsiteCreator
{
    String websiteName;
    String authorName;
    boolean useJS;
    boolean useCSS;

    public WebsiteCreator(String websiteName, String authorName, boolean useJS, boolean useCSS)
    {
        this.websiteName = websiteName;
        this.authorName = authorName;
        this.useJS = useJS;
        this.useCSS = useCSS;
    }
    public void createWebsiteDocuments()
    {
        // create the initial website folder
        createWebsiteDirectory("data/website");

        String websiteDirectory = "data/website/" + websiteName;

        createWebsiteDirectory(websiteDirectory);
        createHTMLFile(websiteDirectory, authorName, websiteName);
        if (useJS)
        {
            createJSPath(websiteDirectory);
        }
        if (useCSS)
        {
            createCSSPath(websiteDirectory);
        }
    }
    private void createWebsiteDirectory(String websiteDirectory)
    {
        try
        {
            Files.createDirectory(Paths.get(websiteDirectory));
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.out.print("There is already a directory with that website name!\n");
            e.printStackTrace();
        }
    }
    private void createHTMLFile(String websiteDirectory, String authorName, String websiteName)
    {
        try (Formatter output = new Formatter(websiteDirectory + "/index.html"))
        {
            output.format("<html>%n<title>%n%s%n</title>%n<meta>%n%s%n</meta>%n</html>", websiteName, authorName);
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.out.print("There is already an html file with that author name in this directory!\n");
            e.printStackTrace();
        }
    }
    private void createJSPath(String websiteDirectory)
    {
        try
        {
            Files.createDirectory(Paths.get(websiteDirectory + "/js"));
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.out.print("There is already a JS directory within this directory!\n");
            e.printStackTrace();
        }
    }
    private void createCSSPath(String websiteDirectory)
    {
        try
        {
            Files.createDirectory(Paths.get(websiteDirectory + "/css"));
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.out.print("There is already a JS directory within this directory!\n");
            e.printStackTrace();
        }
    }
}
