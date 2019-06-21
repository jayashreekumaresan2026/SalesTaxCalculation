package com.company;

public class Item {
        private String name;
        private int quantity;
        private Double price;

        Item(String name, Double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        void showName() {
            System.out.println("Item Name :" + name);
        }
}
