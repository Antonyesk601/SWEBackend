package com.backend.backend.model;
import java.util.ArrayList;
import java.util.Date;
public class Order {
    private Date orderTime;
    private ArrayList<ClothingItem> orderedItems;
}
enum orderStatus
{
    Cancelled, InReview, Completed
}