public class Bai3 {

    // ===== Lớp cha =====
    static class Employee {
        protected String name;
        protected double basicSalary;

        // Constructor có tham số
        public Employee(String name, double basicSalary) {
            this.name = name;
            this.basicSalary = basicSalary;
        }

        public void displayInfo() {
            System.out.println("Tên: " + name);
            System.out.println("Lương cơ bản: " + basicSalary);
        }
    }

    // ===== Lớp con =====
    static class Manager extends Employee {
        private String department;

        // Constructor sử dụng super()
        public Manager(String name, double basicSalary, String department) {
            super(name, basicSalary); // phải là dòng đầu tiên
            this.department = department;
        }

        // Hiển thị đầy đủ thông tin
        public void displayInfo() {
            super.displayInfo(); // gọi lại method của lớp cha
            System.out.println("Phòng ban: " + department);
        }
    }

    // ===== Main =====
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Nguyễn Văn A",
                15000000,
                "Công nghệ thông tin"
        );

        manager.displayInfo();
    }
}
