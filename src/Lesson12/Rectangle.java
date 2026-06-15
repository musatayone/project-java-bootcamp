package Lesson12;

public class Rectangle {
    int width;
    int height;
    String color;

    public int sumArea() {
        return width * height;
    }

    void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Нельзя использовать негативное значение");
        }
    }

    void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Нельзя использовать негативное значение");
        }
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void makeSquare(int side) {
        if (side > 0) {
            this.width = side;
            this.height = side;
        } else {
            System.out.println("Сторона квадрата должна быть > 0");
        }
    }
}
