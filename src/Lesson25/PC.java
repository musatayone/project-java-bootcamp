package Lesson25;

import java.util.Objects;

public class PC {
    private double price;
    private Model model;

    public PC(double price, Model model) {
        this.price = price;
        this.model = model;
    }

    public void makeDiscount(double percent) {
        price = price - price * percent / 100;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", Цена: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return Double.compare(price, pc.price) == 0 && model == pc.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }
}
