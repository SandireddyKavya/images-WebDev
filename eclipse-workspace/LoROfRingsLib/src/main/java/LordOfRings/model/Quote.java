package LordOfRings.model;
public class Quote {
    private String id;
    private String dialog;
    private String character;
    private String movie;

    // Constructors, getters, and setters

    public Quote() {
    }

    public Quote(String id, String dialog, String character, String movie) {
        this.id = id;
        this.dialog = dialog;
        this.character = character;
        this.movie = movie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", dialog='" + dialog + '\'' +
                ", character='" + character + '\'' +
                ", movie='" + movie + '\'' +
                '}';
    }
}
