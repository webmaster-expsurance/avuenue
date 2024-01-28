package com.exercice.model;

public class ProductQueryResult {

    private int level;
    private String categoryName;
    private String keyWord;

    public ProductQueryResult(int level, String categoryName, String keyWord) {
        this.level = level;
        this.categoryName = categoryName;
        this.keyWord = keyWord;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "{" +
                level +
                "," + categoryName + '\'' +
                "," + keyWord + '\'' +
                '}';
    }
}
