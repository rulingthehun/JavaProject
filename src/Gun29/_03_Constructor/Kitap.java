package Gun29._03_Constructor;

public class Kitap {
    String name;
    int publisherYear;
    String author;

    public Kitap() {
    }

    public Kitap(String name, int publisherYear, String author) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public Kitap(String name, int publisherYear) {
        this.name = name;
        this.publisherYear = publisherYear;
    }

    public Kitap(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publisherYear=" + publisherYear +
                ", author='" + author + '\'' +
                '}';
    }
}
