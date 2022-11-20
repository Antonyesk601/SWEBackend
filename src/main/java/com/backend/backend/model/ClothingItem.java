package com.backend.backend.model;

import java.util.ArrayList;

public class ClothingItem {


    private String ItemName;
    private String itemDescription;
    private String ItemID;
    private int ChildAgeMonth;
    private int childAgeYear;
    private Size size;
    private Category cat;
    private ArrayList<String> ImagesPaths;
    
    
    public ClothingItem(String itemName, int childAgeMonth, int childAgeYear, Size s, Category cat) {
        ItemName = itemName;
        ChildAgeMonth = childAgeMonth;
        this.childAgeYear = childAgeYear;
        this.size = s;
        this.cat = cat;
    }


    public String getItemID() {
        return ItemID;
    }
    public void setItemID(String itemID) {
        ItemID = itemID;
    }
    public ArrayList<String> getImagesPaths() {
        return ImagesPaths;
    }
    public void setImagesPaths(ArrayList<String> imagesPaths) {
        ImagesPaths = imagesPaths;
    }
    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public int getChildAgeMonth() {
        return ChildAgeMonth;
    }
    public void setChildAgeMonth(int childAgeMonth) {
        ChildAgeMonth = childAgeMonth;
    }
    public int getChildAgeYear() {
        return childAgeYear;
    }
    public void setChildAgeYear(int childAgeYear) {
        this.childAgeYear = childAgeYear;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size s) {
        this.size = s;
    }
    public Category getCategory() {
        return cat;
    }
    public void setCategory(Category cat) {
        this.cat = cat;
    }
           
}
