package com.backend.backend.model;

import java.util.ArrayList;

public class User {
    
    private String Name; 
    private String ID;
    private int ChildAgeYear;
    private int ChildAgeMonth;
    private String Email;
    private String Password;
    private ArrayList<ClothingItem> onSale;
    private ArrayList<ClothingItem> Wishlist;
    private ArrayList<Order> OrderHistory;
    public User() {
        Name = "";
        ID = "";
        ChildAgeMonth=-1;
        ChildAgeYear = -1;
        Email = "";
        Password = "";
    }


    public User(String name, String iD, int childAgeYear, int childAgeMonth, String email, String password) {
        Name = name;
        ID = iD;
        ChildAgeYear = childAgeYear;
        ChildAgeMonth = childAgeMonth;
        Email = email;
        Password = password;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public int getChildAgeYear() {
        return ChildAgeYear;
    }


    public void setChildAgeYear(int childAgeYear) {
        ChildAgeYear = childAgeYear;
    }


    public int getChildAgeMonth() {
        return ChildAgeMonth;
    }


    public void setChildAgeMonth(int childAgeMonth) {
        ChildAgeMonth = childAgeMonth;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }
}
