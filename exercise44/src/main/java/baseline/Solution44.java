/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Randall Roberts
 */

package baseline;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution44
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        Solution44 solution = new Solution44();
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new FileReader("data/exercise44_input.json"));

        ProductList productList = gson.fromJson(jsonReader, ProductList.class);

        solution.loopProductSearch(productList);
    }
    private void loopProductSearch(ProductList productList)
    {
        ProductSearcher productSearcher = new ProductSearcher();

        boolean noProductsFound = true;

        while (noProductsFound)
        {
            // prompt the user to enter a string to use to search the json file for a string that matches
            // if the string does not match, tell the user to enter another string
            // until a string is found that contains the correct keyword, keep asking the user for
            // new strings
            System.out.print("Enter a product to search: ");
            String userInput = reader.next();
            noProductsFound = productSearcher.searchProducts(userInput, productList);
        }
    }
}