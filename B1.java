public class Bai1 {

    // ===== Lớp Person =====
    static class Person {
        protected String name;
        protected int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Phương thức hiển thị thông tin
        public void displayInfo() {
            System.out.println("Họ tên: " + name);
            System.out.println("Tuổi: " + age);
        }
    }

    // ===== Lớp Student kế thừa Person =====
    static class Student extends Person {
        private String studentId;
        private double avgScore;

        // Constructor
        public Student(String name, int age, String studentId, double avgScore) {
            super(name, age); // gọi constructor lớp cha
            this.studentId = studentId;
            this.avgScore = avgScore;
        }

        // Ghi đè phương thức hiển thị
        @Override
        public void displayInfo() {
            super.displayInfo(); // dùng lại method lớp cha
            System.out.println("Mã sinh viên: " + studentId);
            System.out.println("Điểm trung bình: " + avgScore);
        }
    }

    // ===== Main =====
    public static void main(String[] args) {
        Student st = new Student(
                "Đỗ Chung Hiếu",
                20,
                "SV001",
                8.2
        );

        st.displayInfo();
    }
}
