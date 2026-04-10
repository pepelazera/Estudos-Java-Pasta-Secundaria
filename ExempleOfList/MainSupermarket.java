package ExempleOfList;

import java.util.ArrayList;
import java.util.List;

public class MainSupermarket {
    public static void main(String[] args) {

        Products products = new Products("Rice", 2.34, 332);
        List<Object> InformationProducts = new ArrayList<>();

        InformationProducts.add(products.getProductName());
        InformationProducts.add(products.getProductPrice());
        InformationProducts.add(products.getProductId());

        System.out.println(" Name  Price  Id ");
        System.out.println(InformationProducts.toString());

    }
}
