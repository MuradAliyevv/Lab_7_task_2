abstract class Animal {
    private String name;
    private int age;
    private String weight;

    public abstract void eat();
    public abstract void getVoice();

    public Animal() {
//    Teacher in this task there are animals name. You said your surname and student id should be written.
//        In task 1 I did. Task 2 i can not because of the animals))). I can write in comment line
//        SURNAME: Aliyev;
//        Student Id: 55400;
    }

    public Animal(String name, int age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }
    
}