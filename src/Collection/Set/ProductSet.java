package Collection.Set;

public class ProductSet implements Comparable<ProductSet>{
    private int productId;
    private String productName;
    private int productPrice;

    public ProductSet(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice ;
    }


    @Override
    public int compareTo(ProductSet o) {
        return this.productId-o.productId;
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ProductSet that = (ProductSet) o;
//        return productId == that.productId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(productId);
//    }

}
