package fr.vriliox.triangle;

public class Distance {

    private Point a;
    private Point b;

    public Distance(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public double getDistance() {
        return Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2);
    }
}
