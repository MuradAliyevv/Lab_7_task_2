public class Blowfish extends Fish{
    private String eye_color;

    public Blowfish(String eye_color) {
        this.eye_color = eye_color;
    }

    public Blowfish(String backbone_color, String eye_color) {
        super(backbone_color);
        this.eye_color = eye_color;
    }

    public Blowfish(String name, int age, String weight, String backbone_color, String eye_color) {
        super(name, age, weight, backbone_color);
        this.eye_color = eye_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    @Override
    public String toString() {
        return "Blowfish [eye_color=" + eye_color + "]";
    }

}
