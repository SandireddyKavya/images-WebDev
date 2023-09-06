package LordOfRings.model;
public class Chapter {
    private int chapterNumber;
    private String title;
    private String content;

    // Constructors, getters, and setters

    public Chapter() {
    }

    public Chapter(int chapterNumber, String title, String content) {
        this.chapterNumber = chapterNumber;
        this.title = title;
        this.content = content;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterNumber=" + chapterNumber +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
