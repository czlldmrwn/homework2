/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.homework2;

/**
 *
 * @author НР
 */
public class FoodDelivery extends OnlineStore{
    private boolean foodIsFresh;

    public FoodDelivery(boolean foodIsFresh, int deliveryTimeHours, String name, boolean discountCards) {
        super(deliveryTimeHours, name, discountCards);
        this.foodIsFresh = foodIsFresh;
    }
    
public void deliveredFood (boolean foodIsFresh) {
    if (foodIsFresh){
        System.out.println("The food delivered from" + getName() + "is fresh");
    }
    else {
        System.out.println("The food delivered from" + getName() + " is not fresh");
    }
}

    @Override
    public String toString() {
        return "name=" + getName() + ", moneySpent=" + getMoneySpent() + ", discountCards=" + isDiscountCards() + ", hoursOpen=" + getHoursOpen() + ", hoursClose=" + getHoursClose() + ", deliveryTimeHours=" + getDeliveryTimeHours();
    }
    
}
