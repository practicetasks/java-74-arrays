package example_1;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        // Car (brand, model, releaseYear)
        // Book (author, title, releaseYear)

        Product product = new Product();
        product.name = "Smart TV";
        product.price = 699990;
        products[0] = product;

        products[1] = new Product();
        products[1].name = "Xiaomi";
        products[1].price = 134444;

        product = new Product();
        product.name = "SAMSUNG Smart 4K";
        product.price = 999990;
        products[2] = product;

        products[3] = new Product();


        for (Product p : products) {
            System.out.println(p.name + " " + p.price);
        }



    }
}

