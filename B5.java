import java.util.ArrayList;
import java.util.List;

public class B5 {

    // ===== LỚP CHA =====
    static abstract class Employee {
        protected String name;

        public Employee(String name) {
            this.name = name;
        }

        public abstract double calculateSalary();

        public abstract String getType(); // dùng để hiển thị, KHÔNG phải if-else
    }

    // ===== NHÂN VIÊN VĂN PHÒNG =====
    static class OfficeEmployee extends Employee {

        private double baseSalary;

        public OfficeEmployee(String name, double baseSalary) {
            super(name);
            this.baseSalary = baseSalary;
        }

        @Override
        public double calculateSalary() {
            return baseSalary;
        }

        @Override
        public String getType() {
            return "Office";
        }
    }

    // ===== NHÂN VIÊN SẢN XUẤT =====
    static class ProductionEmployee extends Employee {

        private int numOfProducts;
        private double price;

        public ProductionEmployee(String name, int numOfProducts, double price) {
            super(name);
            this.numOfProducts = numOfProducts;
            this.price = price;
        }

        @Override
        public double calculateSalary() {
            return numOfProducts * price;
        }

        @Override
        public String getType() {
            return "Production";
        }

        public int getNumOfProducts() {
            return numOfProducts;
        }

        public double getPrice() {
            return price;
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            totalSalary += salary;

            System.out.print(index + ". " + e.name + " (" + e.getType() + ") - Lương: "
                    + String.format("%,.0f", salary));

            // Chỉ để hiển thị chi tiết, KHÔNG dùng để tính lương
            if (e instanceof ProductionEmployee p) {
                System.out.print(" (" + p.getNumOfProducts()
                        + " sản phẩm * "
                        + String.format("%,.0f", p.getPrice()) + ")");
            }

            System.out.println();
            index++;
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: "
                + String.format("%,.0f", totalSalary));
    }
}
