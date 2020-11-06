package fr.vriliox.triangle;

import java.util.Scanner;

public class Main {

    private static boolean restart = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Bienvenue dans l'utilitaire des triangles");
        System.out.println("-----------------------------------------");

        while (true) {

            System.out.println("Les coordonnées du point A:");
            System.out.println("veuillez saisir x de A:");
            double xA = scanner.nextDouble();
            System.out.println("veuillez saisir y de A:");
            double yA = scanner.nextDouble();

            System.out.println("Les coordonnées du point B:");
            System.out.println("veuillez saisir x de B:");
            double xB = scanner.nextDouble();
            System.out.println("veuillez saisir y de B:");
            double yB = scanner.nextDouble();

            System.out.println("Les coordonnées du point C:");
            System.out.println("veuillez saisir x de C:");
            double xC = scanner.nextDouble();
            System.out.println("veuillez saisir y de C:");
            double yC = scanner.nextDouble();

            Triangle triangle = new Triangle(new Point(xA, yA), new Point(xB, yB), new Point(xC, yC));
            System.out.println(triangle.toString());

            System.out.println("-----------------------------------------");
            while (!restart) {
                System.out.println("Saisissez une valeur pour avoir plus d'information: ");
                String value = scanner.nextLine();
                System.out.println(value.length());

                if (value.length() < 3 && value.length() > 0) {
                    switch (value.length()) {
                        case 1:
                            Point point = triangle.getPoint(value);
                            System.out.println(point.toString());
                        case 2:
                            Distance distance = triangle.getDistance(value);
                            System.out.println(distance.getDistance());
                    }
                } else if (value.equalsIgnoreCase("stop")) {
                    System.exit(0);
                } else if (value.equalsIgnoreCase("restart")) {
                    restart = true;
                } else {
                    System.out.println("Entrez invalide veuillez retenter");
                }
            }
        }
    }
}
