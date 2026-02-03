public class Product {
    private double price;
    private int stock;

    
    public Product(double price, int stock) {
        setPrice(price);
        setStock(stock);
    }

    
    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }


    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
    }

    
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    
    public static void main(String[] args) {
        Product p = new Product(50, 10);
        System.out.println(p.getPrice()); 
        System.out.println(p.getStock());

        p.setPrice(-20); 
        p.setStock(-5);  
        System.out.println(p.getPrice()); 
        System.out.println(p.getStock()); 
    }
}
