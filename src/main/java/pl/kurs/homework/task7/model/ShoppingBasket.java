package pl.kurs.homework.task7.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShoppingBasket {
    Deque<Product> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new ArrayDeque<>();
    }

    public void addProduct(Product product) {
        shoppingBasket.push(product);
    }

    public void takeProduct() {
        shoppingBasket.pop();
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Product product : shoppingBasket) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void printShoppingBasket() {
        for (Product product : shoppingBasket) {
            System.out.println(product);
        }
    }
}
