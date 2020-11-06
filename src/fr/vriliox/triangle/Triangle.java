package fr.vriliox.triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Point getPoint(String str) {
        switch (str) {
            case "A":
                return a;
            case "B":
                return b;
            case "C":
                return c;
        }
        return null;
    }

    public Distance getDistance(String str) {
        switch (str) {
            case "AB":
            case "BA":
                return new Distance(a, b);
            case "BC":
            case "CB":
                return new Distance(b, c);
            case "AC":
            case "CA":
                return new Distance(a, c);
        }
        return null;
    }
}
