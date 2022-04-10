public class Fish extends Animal{
    private String backbone_color;

    public Fish(){

    }

    public Fish(String backbone_color) {
        this.backbone_color = backbone_color;
    }

    public Fish(String name, int age, String weight, String backbone_color) {
        super(name, age, weight);
        this.backbone_color = backbone_color;
    }

    @Override
    public void eat() {
        System.out.println("Fish ate");
    }

    @Override
    public void getVoice() {
        System.out.println("bulbulbul");
    }

    public String getBackbone_color() {
        return backbone_color;
    }

    public void setBackbone_color(String backbone_color) {
        this.backbone_color = backbone_color;
    }

    @Override
    public String toString() {
        return "Fish [backbone_color=" + backbone_color + "]";
    }
    
}
