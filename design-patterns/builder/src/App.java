

import entities.Product;


public class App {
    public static void main( String[] args ){

        Product productOne  = new Product.ProductBuilder()
            .id(1)
            .name("Boneca")
            .price(6.0)
            .stock(100)
            .quantitySold(15)
            .build();

        Product productTwo  = new Product.ProductBuilder()
            .id(2)
            .name("Carrinho de madeira")
            .price(26.0)
            .stock(30)
            .quantitySold(20)
            .build();

        System.out.println("\n---SALES REPORT - João---\n");
        productOne.refreshStock();
        System.out.println(productOne + "\n");
        productTwo.refreshStock();
        System.out.println(productTwo);
  
    }
}
