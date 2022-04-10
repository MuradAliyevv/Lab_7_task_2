public class Pigeon extends Bird{
    private String species;

    public Pigeon(String species) {
        this.species = species;
    }

    public Pigeon(String featherColor, String species) {
        super(featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon [species=" + species + "]";
    }
    
}
