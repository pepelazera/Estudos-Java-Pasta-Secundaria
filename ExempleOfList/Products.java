package ExempleOfList;

public class Products {

    private String ProductName;
    private double ProductPrice;
    private int ProductId;

    public Products() {
    }

    public Products(String productName, double productPrice, int productId) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductId = productId;
    }

    // Getters Methods
    public String getProductName() {
        return ProductName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public int getProductId() {
        return ProductId;
    }


    // Setters Methods
    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }
}
