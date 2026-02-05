import java.util.ArrayList;
import java.util.List;

public class B6 {

    // ===== LỚP CHA TRỪU TƯỢNG =====
    static abstract class Shape {
        public abstract double calculateArea();
        public abstract String getInfo();
    }

    // ===== HÌNH TRÒN =====
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        // ===== OVERRIDING =====
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String getInfo() {
            return "Hình tròn (r=" + radius + ")";
        }
    }

    // ===== HÌNH CHỮ NHẬT / HÌNH VUÔNG =====
    static class Rectangle extends Shape {
        private double width;
        private double height;

        // ===== OVERLOADING CONSTRUCTOR (Hình chữ nhật) =====
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // ===== OVERLOADING CONSTRUCTOR (Hình vuông) =====
        public Rectangle(double side) {
            this.width = side;
            this.height = side;
        }

        // ===== OVERRIDING =====
        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public String getInfo() {
            if (width == height) {
                return "Hình vuông (cạnh " + width + ")";
            }
            return "Hình chữ nhật (" + width + " x " + height + ")";
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        // Sử dụng Overloading constructor
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6)); // Hình vuông

        double totalArea = 0;
        int index = 1;

        System.out.println("Kết quả tính toán hình học:\n");

        for (Shape s : shapes) {
            double area = s.calculateArea(); // OVERRIDING → Runtime
            totalArea += area;

            System.out.println(index + ". " + s.getInfo()
                    + " - Diện tích: "
                    + String.format("%.2f", area));
            System.out.println();
            index++;
        }

        System.out.println("=> Tổng diện tích các hình: "
                + String.format("%.2f", totalArea));
    }
}
