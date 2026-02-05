public class Bai2 {

    // ===== Lớp cha =====
    static class Animal {
        public void sound() {
            System.out.println("Động vật phát ra âm thanh");
        }
    }

    // ===== Lớp Dog =====
    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Chó sủa: Gâu gâu");
        }
    }

    // ===== Lớp Cat =====
    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Mèo kêu: Meo meo");
        }
    }

    // ===== Main =====
    public static void main(String[] args) {

        Animal a1 = new Dog(); // đa hình
        Animal a2 = new Cat();

        a1.sound(); // gọi sound() của Dog
        a2.sound(); // gọi sound() của Cat
    }
}
