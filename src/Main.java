import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("PLEASE READ MY COMMENT IN ANIMAL CLASS");

        Dog dog = new Dog("Dog_1");
        Blowfish blowfish = new Blowfish("BlowFish_1");
        Pigeon pigeon = new Pigeon("Pigeon_1");


        animals.add(dog);
        animals.add(blowfish);
        animals.add(pigeon);

        for (Animal animal : animals) {
            animal.eat();
            animal.getVoice();
        }
    }
}
