import java.util.Arrays;

public class categoryManager {

    public void add(Category category) {
        System.out.println(category.categoryName + " Kategori Sisteme Eklendi");
    }

    public void viewer(Category[] categories) {
        for (Category category : categories) {
            System.out.println(category.categoryName);
            System.out.println(Arrays.toString(category.categoryItems));
            System.out.println("-----------------------------------------");
        }
    }
}