/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.homework2;

/**
 *
 * @author НР
 */
public class OnlineStore extends Store {
    private int deliveryTimeHours;

    public OnlineStore(int deliveryTimeHours, String name, boolean discountCards) {
        super(name, discountCards);
    }

    public int getDeliveryTimeHours() {
        return deliveryTimeHours;
    }

    public void setDeliveryTimeHours(int deliveryTimeHours) {
        if (deliveryTimeHours>0){
            this.deliveryTimeHours = deliveryTimeHours;
        }
        if (deliveryTimeHours == 0){
            this.deliveryTimeHours = 1;
        }
        else{
            this.deliveryTimeHours = -deliveryTimeHours;
        }
    }
    
    public void deliver(int deliveryTimeHours){
        System.out.println(getName() + " delivers goods for " + deliveryTimeHours + " hours");
    }
}
