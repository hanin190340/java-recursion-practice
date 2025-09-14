class Category {
    private String name;
//task13
    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } //

    public Category deepClone() {
        return new Category(this.name);
    }

}

class Product {
    private int id;
    private Category category;

    public Product(int id, Category category) {
        this.id = id;
        this.category = category;
    }

    public Product deepClone() {

        Category clonedCategory = this.category.deepClone();
        Product clonedProduct = new Product(this.id, clonedCategory);
        return clonedProduct;


    }
}
