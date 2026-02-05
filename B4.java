public class Bai4 {

    // ===== Lớp cha =====
    static class Animal {
        public void sound() {
            System.out.println("Động vật phát ra âm thanh");
        }
    }

    // ===== Lớp con =====
    static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Chó sủa: Gâu gâu");
        }

        // Phương thức riêng của Dog
        public void wagTail() {
            System.out.println("Chó vẫy đuôi");
        }
    }

    // ===== Main =====
    public static void main(String[] args) {

        // Declared type: Animal
        // Actual type: Dog
        Animal animal = new Dog();

        // Gọi phương thức chung (đa hình runtime)
        animal.sound(); // chạy sound() của Dog

        // animal.wagTail(); //  LỖI BIÊN DỊCH (compile-time)

        // Downcasting an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail(); // OK
        }
    }
}
