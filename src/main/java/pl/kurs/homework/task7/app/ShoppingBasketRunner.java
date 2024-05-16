package pl.kurs.homework.task7.app;

import pl.kurs.homework.task7.model.*;

public class ShoppingBasketRunner {
    public static void main(String[] args) {
        FoodProduct apple = new FoodProduct("Apple", 1.0);
        HomeChemistry detergent = new HomeChemistry("Detergent", 4.5);
        Cosmetic shampoo = new Cosmetic("Shampoo", 10.0);
        Tool screwdriver = new Tool("Screwdriver", 8.0);

        ShoppingBasket basket = new ShoppingBasket();

        basket.addProduct(apple);
        basket.addProduct(detergent);
        basket.addProduct(shampoo);
        basket.addProduct(screwdriver);

        System.out.println("Total price: " + basket.calculateTotalPrice());
        basket.printShoppingBasket();
        System.out.println();

        basket.takeProduct();
        basket.printShoppingBasket();
        System.out.println();

        basket.takeProduct();
        basket.takeProduct();
        basket.printShoppingBasket();

    }
}
