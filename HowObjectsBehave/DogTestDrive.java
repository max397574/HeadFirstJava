public class DogTestDrive{
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 32;

        one.bark(2);
        two.bark(6);
        three.bark(5);
    }
}

