package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id = id;
        int HH=Integer.valueOf(deliveryTime.charAt(0)+""+deliveryTime.charAt(1));
        int MM=Integer.valueOf(deliveryTime.charAt(3)+""+deliveryTime.charAt(4));

        this.deliveryTime  = HH*60 + MM;

    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
