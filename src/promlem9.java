import java.util.ArrayList;

public class promlem9 {
    public static void main(String [] args){
        ArrayList<Product> productArrayList = new ArrayList<>();
        Product student1 = new Product(1, "Milka", "8754125", "Mukhitkyzy", 12, 8, 15 );
        Product student2 = new Product(2, "Small", "96345125", "Kurmashevna", 25,7, 23);
        Product student3 = new Product(3, "Gucci", "7896451", "Kuanyshovna", 16, 3, 67);
        Product student4 = new Product(4, "Zara", "8524623", "Namaz", 18, 10, 98);
        Product student5 = new Product(5, "KFC", "1236548", "Bakytkyzy", 25, 3, 100);

        productArrayList.add(student1);
        productArrayList.add(student2);
        productArrayList.add(student3);
        productArrayList.add(student4);
        productArrayList.add(student5);

        for (Product s : productArrayList){
            if (s.name.equals("Zara")){
                System.out.println(s);
            }
        }

        for (Product s : productArrayList){
            if (s.name.equals("Zara")){
                if (s.price < 15){
                    System.out.println(s);
                }
            }
        }

        for (Product s : productArrayList){
            if (s.shelfLife > 5){
                System.out.println(s);
            }
        }
    }
}


class Product{
    int id;
    String name;
    String UPC;
    String manufacturer;
    int price;
    int shelfLife;
    int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product (int id, String name, String UPC, String manufacturer, int price, int shelfLife, int quantity){
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC='" + UPC + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLife='" + shelfLife + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
