import java.util.ArrayList;
import java.util.List;

public class ManageProduct {
    List<Product> productList = new ArrayList<>();

    ManageProduct() {
        productList.add(new Product(1, "A", 2, "High"));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int id) {
        int index = findProductIndexById(id);
        if (index != -1) {
            productList.remove(index);
            System.out.println("Product with ID " + id + " removed successfully.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void findAll() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void findByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void update(int id, Product product) {
        int index = findProductIndexById(id);
        if (index != -1) {
            productList.set(index, product);
            System.out.println("Product with ID " + id + " updated successfully.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    private int findProductIndexById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1; // Return -1 if not found
    }
}