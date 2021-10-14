

package baseline;

import com.google.gson.Gson;

import java.util.Scanner;

public class Solution44
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        // prompt the user to enter a string to use to search the json file for a string that matches
        // if the string does not match, tell the user to enter another string
        // until a string is found that contains the correct keyword, keep asking the user for
        // new strings

        Product[] products = new Gson().fromJson("data/input.json", Product[].class);
    }
    private void loopProductSearch(Product[] products)
    {
        int numMatchingProducts = 0;
        while (numMatchingProducts == 0)
        {

        }
    }
}