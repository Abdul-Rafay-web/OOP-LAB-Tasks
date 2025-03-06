package Q1;

public class Category {
    private String categoryName;
    private String categoryDescription;
    public Category(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }
    public void displayCategory() {
        System.out.println(categoryName);
        System.out.println(categoryDescription);
    }
}
