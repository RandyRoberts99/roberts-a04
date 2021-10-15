import baseline.Product;
import baseline.ProductSearcher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution44Test
{
    @Test
    void testProductMatchMethod()
    {
        ProductSearcher sampleProdSearch = new ProductSearcher();

        String keyword = "deez";

        Product sampleProduct = new Product("DeezedNuts", 69.420, 42);

        boolean actual = sampleProdSearch.matchProduct(keyword, sampleProduct);

        assertEquals(true, actual);
    }
    @Test
    void testProductMatchMethodTwo()
    {
        ProductSearcher sampleProdSearch = new ProductSearcher();

        String keyword = "42";

        Product sampleProduct = new Product("DeezedNuts", 69.420, 42);

        boolean actual = sampleProdSearch.matchProduct(keyword, sampleProduct);

        assertEquals(true, actual);
    }
    @Test
    void testProductMatchMethodThree()
    {
        ProductSearcher sampleProdSearch = new ProductSearcher();

        String keyword = "69.420";

        Product sampleProduct = new Product("DeezedNuts", 69.420, 42);

        boolean actual = sampleProdSearch.matchProduct(keyword, sampleProduct);

        assertEquals(true, actual);
    }
}