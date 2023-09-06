package TestSample.Sample;
import java.util.List;

public class BookData {
    private List<Book> docs;
    private int total;
    private int limit;
    private int offset;
    private int page;
    private int pages;

    public List<Book> getDocs() {
        return docs;
    }

    public void setDocs(List<Book> docs) {
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

class Book {
    private String _id;
    private String name;

    // Getters and setters for _id and name fields go here

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
}
