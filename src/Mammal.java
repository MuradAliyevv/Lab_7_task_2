public class Mammal extends Animal {
    private String color;

    public Mammal() {
        
    }

    public Mammal(String color) {
        this.color = color;
    }

    public Mammal(String name, int age, String weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Mammal ate");
    }

    @Override
    public void getVoice() {
        System.out.println("ARRRR");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mammal [color=" + color + "]";
    }
    
}


