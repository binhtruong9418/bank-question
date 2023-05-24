package model;

public class Category {
    private String name;

    private Category parentCategory;

    private String info;

    private Integer IdNumber;

    public Category(String name, Category parentCategory, String info, Integer IdNumber) {
        this.name = name;
        this.parentCategory = parentCategory;
        this.info = info;
        this.IdNumber = IdNumber;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public String getInfo() {
        return info;
    }

    public Integer getIdNumber() {
        return IdNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setIdNumber(Integer IdNumber) {
        this.IdNumber = IdNumber;
    }
}
