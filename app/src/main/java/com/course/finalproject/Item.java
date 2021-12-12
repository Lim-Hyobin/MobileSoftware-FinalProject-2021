package com.course.finalproject;

public class Item {

    String item_name;
    int item_imageID;
    int item_imageID2;
    int item_price;
    String item_desc;
    String item_url;

    public Item(String name, int id, int id2, int price, String desc, String url){
        this.item_name = name;
        this.item_imageID = id;
        this.item_imageID2 = id2;
        this.item_price = price;
        this.item_desc = desc;
        this.item_url = url;
    }

    public String getItemName(){
        return item_name;
    }
    public int getItemImageID(){
        return item_imageID;
    }
    public int getItemImageID2(){
        return item_imageID2;
    }
    public int getItemPrice(){
        return item_price;
    }
    public String getItemDesc(){
        return item_desc;
    }
    public String getItemUrl(){
        return item_url;
    }

}
