package baitap.examArrayListAndLinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productProductManager = new ProductManager(new ArrayList<>());
        System.out.println("Thêm sản phẩm");
        productProductManager.add(new Product("Mì gói", 1500));
        productProductManager.add(new Product("Sữa", 1700));
        productProductManager.add(new Product("Nước ngọt", 1900));
        productProductManager.add(new Product("Phở gói", 1500));
        productProductManager.add(new Product("Xúc xích", 2000));
        productProductManager.display();
        System.out.println("Sửa thông tin sản phẩm theo id = 1");
        productProductManager.updateProduct(1);
        productProductManager.display();
        System.out.println("Xóa sản phẩm theo id = 2");
        productProductManager.remove(2);
        System.out.println("Hiển thị sản phẩm sau khi xóa");
        productProductManager.display();
        System.out.println("Tìm kiếm sản phẩm theo tên");
        String nameFind = "Phở";
        System.out.println(productProductManager.searchByName(nameFind));;
        System.out.println("Sắp xếp các sản phẩm theo giá tăng dần");
        productProductManager.sortIncrease();
        productProductManager.display();
        System.out.println("Sắp xếp các sản phẩm theo giá giảm dần");
        productProductManager.sortDecrease();
        productProductManager.display();
    }
}
