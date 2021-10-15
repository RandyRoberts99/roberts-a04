package baseline;

public class ProductSearcher
{
    public boolean searchProducts(String userSearchKey, ProductList productList)
    {
        boolean productNotFound = true;

        for (int i = 0; i < productList.products.length; i++)
        {
            if (matchProduct(userSearchKey, productList.products[i]))
            {
                printProduct(productList.products[i]);
                productNotFound = false;
            }
        }
        if (productNotFound)
        {
            System.out.print("Sorry, that product was not found in our inventory.\n");
        }
        return productNotFound;
    }
    public boolean matchProduct(String keyword, Product currentProduct)
    {
        boolean isMatchingProduct = false;
        if (currentProduct.name.toLowerCase().contains(keyword.toLowerCase()))
        {
            isMatchingProduct = true;
        }
        // check to see if the string is a double that matches the double used
        if (keyword.contains("."))
        {
            try
            {
                double keyDouble = Double.parseDouble(keyword);
                if (keyDouble == currentProduct.price)
                {
                    isMatchingProduct = true;
                }
            }
            catch (NumberFormatException e)
            {
                // There is no need to do anything here
            }
        }
        else
        {
            try
            {
                int keyInt = Integer.parseInt(keyword);
                if (keyInt == currentProduct.quantity)
                {
                    isMatchingProduct = true;
                }
            }
            catch (NumberFormatException e)
            {
                // There is no need to do anything here
            }
        }
        return isMatchingProduct;
    }
    private void printProduct(Product foundProduct)
    {
        System.out.print("Name: " + foundProduct.name + "\n");
        System.out.print("Price: " + foundProduct.price + "\n");
        System.out.print("Quantity: " + foundProduct.quantity + "\n");
    }
}