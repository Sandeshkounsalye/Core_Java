package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCustomObj {
    public static void main(String[] args) {
        Set<ProductSet> productSet=new HashSet<>();
        productSet.add(new ProductSet(23,"Mobile",21000));
        productSet.add(new ProductSet(6,"Charger",299));
        productSet.add(new ProductSet(42,"Cable",149));
        productSet.add(new ProductSet(2,"Case",160));
        productSet.add(new ProductSet(8,"Bag",1200));
        productSet.add(new ProductSet(12,"Earphones",899));
        //For custom objects we need to override equals & hashCode
        productSet.forEach(System.out::println);
    }
}
