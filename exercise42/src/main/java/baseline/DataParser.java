package baseline;

import java.io.IOException;
import java.util.*;

public class DataParser
{
    Scanner reader;
    List<String> userData;

    public DataParser(List<String> userData, Scanner reader)
    {
        this.userData = userData;
        this.reader = reader;
    }
    public List<String> getUserData()
    {
        while(reader.hasNextLine())
        {
            userData.add(reader.nextLine());
        }
        return userData;
    }
    public void printUserData()
    {
        try (Formatter output = new Formatter("data/exercise42_output.txt"))
        {
            output.format("Last      First     Salary%n--------------------------%n");
            for (int i = 0; i < userData.size(); i++)
            {
                String userDataLine = userData.get(i);

                // use string.split and stringbuilder to separate a line into multiple strings, and create spaces for formatting accordingly
                userDataLine = parseUserData(userDataLine);
                output.format("%s%n", userDataLine);
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            e.printStackTrace();
        }
    }
    public String parseUserData(String userDataLine)
    {
        StringBuilder parsedUserData = new StringBuilder();

        userDataLine = userDataLine.replace(",", " ");

        String[] newUserData = userDataLine.split(" ");

        for (int i = 0; i < 2; i++)
        {
            int length = 10;
            length -= newUserData[i].length();

            parsedUserData.append(newUserData[i]);

            for (int j = 0; j < length; j++)
            {
                parsedUserData.append(" ");
            }
        }
        parsedUserData.append(newUserData[2]);

        return parsedUserData.toString();
    }
}