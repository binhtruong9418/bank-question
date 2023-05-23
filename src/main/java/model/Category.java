package model;

public class Category {
    private String name;

    private Integer parentCategory;

    private String info;

    private Integer IdNumber;

    private Integer count;
    
    public Category(String name, Integer parentCategory, String info, Integer IdNumber, Integer count) {
        this.name = name;
        this.parentCategory = parentCategory;
        this.info = info;
        this.IdNumber = IdNumber;
        this.count = count;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public Integer getParentCategory() {
        return parentCategory;
    }

    public String getInfo() {
        return info;
    }

    public Integer getIdNumber() {
        return IdNumber;
    }

    public Integer getCount() {
        return count;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setParentCategory(Integer parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setIdNumber(Integer IdNumber) {
        this.IdNumber = IdNumber;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
}
