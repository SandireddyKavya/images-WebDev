package TestSample.Sample;
import java.util.List;

public class MovieData {
    private List<Movie> docs;
    private int total;
    private int limit;
    private int offset;
    private int page;
    private int pages;

    public List<Movie> getDocs() {
        return docs;
    }

    public void setDocs(List<Movie> docs) {
        this.docs = docs;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

class Movie {
    private String _id;
    private String name;
    private int runtimeInMinutes;
    private double budgetInMillions;
    private double boxOfficeRevenueInMillions;
    private int academyAwardNominations;
    private int academyAwardWins;
    private double rottenTomatoesScore;

    // Getters and setters for all the fields go here

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public double getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(double budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    public double getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public void setBoxOfficeRevenueInMillions(double boxOfficeRevenueInMillions) {
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
    }

    public int getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public void setAcademyAwardNominations(int academyAwardNominations) {
        this.academyAwardNominations = academyAwardNominations;
    }

    public int getAcademyAwardWins() {
        return academyAwardWins;
    }

    public void setAcademyAwardWins(int academyAwardWins) {
        this.academyAwardWins = academyAwardWins;
    }

    public double getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(double rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }
}
