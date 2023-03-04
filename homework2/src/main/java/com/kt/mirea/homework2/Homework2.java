/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kt.mirea.homework2;

import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Homework2 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите название службы доставки еды:");
    String nameFirst = scan.nextLine();
    System.out.println("Наличие дисконтных карт (true/false):");
    boolean discountCardsFirst = scan.nextBoolean();
    System.out.println("Введите потреченную сумму денег:");
    int moneySpentFirst = scan.nextInt();
    System.out.println("Будет ли еда свежей (true/false):");
    boolean foodIsFreshFirst = scan.nextBoolean();
    System.out.println("Введите время доставки в часах:");
    int foodDeliveryHoursFirst = scan.nextInt();
    System.out.println("Введите время открытия (только час в 24 формате):");
    int hoursOpenFirst = scan.nextInt();
    System.out.println("Введите время закрытия (только час в 24 формате):");
    int hoursCloseFirst = scan.nextInt();
    
    FoodDelivery firstStore = new FoodDelivery(foodIsFreshFirst, foodDeliveryHoursFirst, nameFirst, discountCardsFirst);
    firstStore.setMoneySpent(moneySpentFirst);
    firstStore.sellGoods(firstStore.getMoneySpent());
    firstStore.workFromTo(hoursOpenFirst, hoursCloseFirst);
    firstStore.giveDiscountCards(discountCardsFirst);
    firstStore.deliver(foodDeliveryHoursFirst);
    firstStore.deliveredFood(foodIsFreshFirst);
    System.out.println(firstStore.toString());
}
}