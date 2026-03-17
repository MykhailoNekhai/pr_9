package ua.uni;

public class Library {
    static String name;

    static class Book {
        private final String name;
        String title;
        String author;

        public static void main(String[] args) {
            Book book = new Book("exsaple","author","name");
            System.out.println(book.toString());
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }

        Book(String title, String author,String name) {
            this.title = title;
            this.author = author;
            this.name = name;

        }

        String bookLabel() {
            return title + " by " + author + name;
        }
    }
}