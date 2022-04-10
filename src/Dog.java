public class Dog extends Mammal{
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    public Dog(String name, int age, String weight, String color, String breed) {
        super(name, age, weight, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + "]";
    }

}
