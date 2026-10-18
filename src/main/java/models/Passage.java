package models;

public class Passage {
    Book book;
    String passage;
    int word_count; //REMEMBER TO TEST THAT THIS DOES NOT GO OVER WORD COUNT LIMIT

    public Passage(Book book, String passage, int word_count){
        this.book = book;
        this.passage = passage;
        this.word_count = word_count;
    }
}
