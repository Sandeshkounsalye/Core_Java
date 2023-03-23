package Java_8_Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private int productId;
    private String productName;
    private  double productPrice;

    public Product(int productId, String productName, double productPrice) {
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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}
class ProductBO{
    Stream<Product> streamOfProducts;
    List<Product> listOfProduct=new ArrayList<>();
    //original container
    void addProduct(Product product){
        listOfProduct.add(product);
        streamOfProducts=listOfProduct.stream();
    }
    //temp container(
    Stream<Product> getStreamOfProducts(){
        return streamOfProducts;
    }
    List<Product> getListOfProductBasedOnPrice(){
        List<Product> productList=listOfProduct.stream().filter(p->p.getProductPrice()>=10000).collect(Collectors.toList());
        return listOfProduct;

    }
//    double getTotalPriceForAllProduct(){}
}
