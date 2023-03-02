package entities;


public class Product {
    
    private int id;
    private String name;
    private double price;
    private int stock;
    private int quantitySold;

    

    private Product(int id, String name, double price, int stock, int quantitySold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.quantitySold = quantitySold;
    }

    public static class ProductBuilder{

        private int id;
        private String name;
        private double price;
        private int stock;
        private int quantitySold;
        
        
        public ProductBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public ProductBuilder quantitySold(int quantitySold) {
            this.quantitySold = quantitySold;
            return this;
        }

        public Product build(){
            return new Product(id, name, price, stock, quantitySold);
        }
    }

    public void refreshStock(){
        this.stock -= this.quantitySold;
    }

    public int getStock(){
        return this.stock;
    }

    public double totalSales(){
        return this.quantitySold * price;
    }

    @Override
    public String toString(){
        return 
            "Product: " + this.name 
            + "\nPrice: R$" + this.price
            + "\nStock: " + this.stock
            + "\nQuantity Sold:" + this.quantitySold
            + "\nTotal Sales: R$" + this.totalSales();
    }

}
