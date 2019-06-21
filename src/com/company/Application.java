package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        List<Item> parseItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items :");
        int itemCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter the item name :");
            String name = scanner.nextLine();
            System.out.print("Enter the item quantity :");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the item price :");
            double price = Double.parseDouble(scanner.nextLine());
            Item item = new Item(name, price, quantity);
            items.add(item);
        }
        for (Item item : items) {
            item.showName();
        }
        System.out.print("Enter the String :");
        itemCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter the input string :");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            Arrays.asList(words);
            int quantity = Integer.parseInt(words[0]);
            String itemName = words[1];
            double price = Double.parseDouble(words[3]);
            Item item = new Item(itemName, price, quantity);
            parseItems.add(item);
        }
        for (Item item : parseItems) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------------------");
    }
}