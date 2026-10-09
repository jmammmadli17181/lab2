package pp2.week03.geometry;

import week03.invoice.Invoice;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(10, 5);
        Point pointC = new Point(1, 10);

        System.out.println("Distance: " + pointA.distance(pointC));

        Segment seg1 = new Segment(pointA, pointB);
        System.out.println("Slope: " + seg1.getSlope());
        System.out.println("Length: " + seg1.length());

        Invoice item1 = new Invoice("1234", "apple", 10, 1.54);
        Invoice item2 = new Invoice("123", "hammer", 2, 15.50);

        System.out.println(item1.getNomer() + " " + item2.getInvoiceAmount());

        item2.setNomer("1235");
        System.out.println(item2.getNomer());
    }
}