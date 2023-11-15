import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageProduct manageProduct = new ManageProduct();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Thoát khỏi chương trình");

            System.out.println("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập ID:");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá:");
                    int newPrice = scanner.nextInt();
                    System.out.println("Nhập chất lượng (Low/Medium/High):");
                    String choiceQuantity = scanner.nextLine();
                    manageProduct.addProduct(new Product(newId, newName, newPrice, choiceQuantity));
                    break;
                case 2:
                    System.out.println("Nhập ID muốn sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    manageProduct.update(updateId, new Product());
                    break;
                case 3:
                    System.out.println("Nhập ID muốn xóa: ");
                    int removeId = scanner.nextInt();
                    manageProduct.removeProduct(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách hiện có");
                    manageProduct.findAll();
                    break;
                case 5:
                    System.out.println("Nhập tên muốn tìm:");
                    String findName = scanner.nextLine();
                    manageProduct.findByName(findName);
                    break;
                case 6:
                    System.exit(0); // Thoát khỏi chương trình
                    break;
            }
        }
    }
}
