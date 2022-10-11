package ru.mirea.Panferov.task3;

public class Circle {
    private final Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public String toString() {
        return "Окружность с центром: " + center + ", и радиусом: " + radius;
    }
}
