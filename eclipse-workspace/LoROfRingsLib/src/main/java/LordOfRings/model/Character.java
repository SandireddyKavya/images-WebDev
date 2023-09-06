package LordOfRings.model;
public class Character {
    private String name;
    private String race;
    private int age;
    private String description;

    // Constructors, getters, and setters

    public Character() {
    }

    public Character(String name, String race, int age, String description) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
