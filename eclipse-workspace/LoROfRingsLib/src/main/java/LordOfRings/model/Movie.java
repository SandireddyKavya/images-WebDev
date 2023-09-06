package LordOfRings.model;

/**
 * Hello world!
 *
 */
import java.util.List;

public class Movie {
    private String _id;
    private String title;
    private String year;
    private List<String> cast;
    private List<String> genres;
    private String plot;
    private String poster;
    private String runtime;

    // Constructors, getters, and setters

    public Movie() {
    }

    public Movie(String _id, String title, String year, List<String> cast, List<String> genres, String plot, String poster, String runtime) {
        this._id = _id;
        this.title = title;
        this.year = year;
        this.cast = cast;
        this.genres = genres;
        this.plot = plot;
        this.poster = poster;
        this.runtime = runtime;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", cast=" + cast +
                ", genres=" + genres +
                ", plot='" + plot + '\'' +
                ", poster='" + poster + '\'' +
                ", runtime='" + runtime + '\'' +
                '}';
    }
}

