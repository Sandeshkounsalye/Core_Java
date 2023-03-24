package Java_8_Features.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
    int id;
    String name;
    int price;

    public Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class FilterDemo4 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Mobile",30500));
        productList.add(new Product(2,"Fan",6000));
        productList.add(new Product(3,"laptop",75000));
        productList.add(new Product(4,"Charger",1299));
        productList.add(new Product(5,"Tab",40500));

        productList.stream()
                .filter(p->p.price>25000)
                .forEach(pr-> System.out.println(pr.id+"-"+pr.name+"-"+pr.price));

        System.out.println("~~~~~~~~");

        //Here we are sorting the bases on the price
        Comparator<Product> productComparator=(p1,p2)->p1.price-p2.price;
        productList.stream().sorted(productComparator).forEach(System.out::println);

    }
}
