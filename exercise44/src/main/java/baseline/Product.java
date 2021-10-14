package baseline;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int searchProducts(String userSearchKey, Product[] products)
    {
        int numMatchingProducts = 0;
        while (numMatchingProducts == 0)
        {
            for (int i = 0; i < products.length; i++)
            {
                if (matchProduct(userSearchKey, products[i]))
                {
                    printProduct(products[i]);
                }
            }
        }
    }
    private boolean matchProduct(String keyword, Product currentProduct)
    {
        boolean isMatchingProduct = false;
        if (currentProduct.name.toLowerCase().contains(keyword))
        {

        }
    }
    private void printProduct(Product foundProduct)
    {

    }
}
