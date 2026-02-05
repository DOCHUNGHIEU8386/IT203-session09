// ================== LỚP CHA ==================
class Employee {
    protected String name;
    protected double baseSalary;

    // Constructor lớp cha
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Phương thức tính lương (sẽ bị ghi đè)
    double getSalary() {
        return baseSalary;
    }

    void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

// ================== LỚP CON: MANAGER ==================
class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); // gọi constructor lớp cha
        this.department = department;
    }

    // Ghi đè phương thức
    @Override
    double getSalary() {
        return super.getSalary() + 5000; // phụ cấp quản lý
    }

    void showInfo() {
        super.showInfo();
        System.out.println("Phòng ban: " + department);
        System.out.println("Lương thực nhận: " + getSalary());
    }
}

// ================== LỚP CON: DEVELOPER ==================
class Developer extends Employee {

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    // Overriding
    @Override
    double getSalary() {
        return baseSalary + 3000; // phụ cấp dev
    }

    // Overloading (cùng tên, khác tham số)
    double getSalary(int bonus) {
        return getSalary() + bonus;
    }
}

// ================== CLASS MAIN ==================
public class EmployeeManagement {

    public static void main(String[] args) {

        // ====== ĐA HÌNH ======
        Employee e1 = new Manager("Nguyễn Văn A", 10000, "IT");
        Employee e2 = new Developer("Trần Văn B", 9000);

        System.out.println("=== ĐA HÌNH ===");
        System.out.println("Lương Manager: " + e1.getSalary());
        System.out.println("Lương Developer: " + e2.getSalary());

        // ====== KIỂU KHAI BÁO & KIỂU THỰC TẾ ======
        System.out.println("\n=== instanceof & ÉP KIỂU ===");
        if (e2 instanceof Developer) {
            Developer dev = (Developer) e2; // downcasting
            System.out.println("Lương Dev + thưởng: " + dev.getSalary(2000));
        }

        // ====== HIỂN THỊ THÔNG TIN ======
        System.out.println("\n=== THÔNG TIN MANAGER ===");
        ((Manager) e1).showInfo();

        // ====== SO SÁNH ======
        System.out.println("\n=== GHI CHÚ ===");
        System.out.println("Overriding: quyết định lúc runtime");
        System.out.println("Overloading: quyết định lúc compile-time");
    }
}
