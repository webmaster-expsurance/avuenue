package com.exercice.model;

public class Product {

    private int categoryId;
    private String categoryName;
    private String keywords;
    private int parentCategoryId;

    public Product(int categoryId, String categoryName, String keywords, int parentCategoryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.keywords = keywords;
        this.parentCategoryId = parentCategoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(int parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}
