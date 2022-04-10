public class Bird extends Animal {
    private String featherColor;

    public Bird(){

    }

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird ate");
    }

    @Override
    public void getVoice() {
        System.out.println("SHHUSHHH");        
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird [featherColor=" + featherColor + "]";
    }
    
}
