package Gun29._02_Constructor;

public class Kitaplar {
    String name;
    int publishYear;
    String author;

    Kitaplar(){
    }

    Kitaplar(String name, String author){
        this.name = name;
        this.author = author;
        this.publishYear = 0;
    }

    Kitaplar(String name){
        this (name, "");
    }

    void yazdir(){
        System.out.println(name + " " + author + " " + publishYear);
    }

    public String toString(){
        return name + " " + author + " " + publishYear;
    }
}
