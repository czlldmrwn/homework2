/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.homework2;

/**
 *
 * @author НР
 */
public class Store {
    private String name;
    private int moneySpent;
    private boolean discountCards;
    private int hoursOpen;
    private int hoursClose;

    public Store(String name, boolean discountCards) {
        this.name = name;
        this.discountCards = discountCards;
    }

    public void setMoneySpent(int moneySpent) {
        if (moneySpent>=0){
            this.moneySpent = moneySpent;
        }
        else {
            this.moneySpent = - moneySpent;
        }
    }

    public void setHoursOpen(int hoursOpen) {
        if (hoursOpen>=0) {
            this.hoursOpen = hoursOpen;
        }
        else {
            this.hoursOpen = 0;
        }
    }

    public void setHoursClose(int hoursClose) {
        if (hoursClose <= 24){
            this.hoursClose = hoursClose;
        }
        else {
            this.hoursClose = 24;
        }
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public int getHoursOpen() {
        return hoursOpen;
    }

    public int getHoursClose() {
        return hoursClose;
    }

    public String getName() {
        return name;
    }

    public boolean isDiscountCards() {
        return discountCards;
    }
    
public void sellGoods(int moneySpent) {
    System.out.println(name + " sold goods for " + moneySpent + " rubles");
}

public void workFromTo(int hoursOpen, int hoursClose){
    if (hoursOpen > 0 && hoursClose<24){
        System.out.println(name + " works from " + hoursOpen + " to " + hoursClose);
}
    else {
        System.out.println(name + " works fot 24 hours");
} 
}

public void giveDiscountCards (boolean discountCards){
    if (discountCards) {
        System.out.println(name + " gave their discount card");
    }
    else {
        System.out.println(name + "doesn't give discount cards");
    }
}
}