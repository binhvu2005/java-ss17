import java.util.*;

public class Bai9 {

    public static class Book {
        private String id;
        private String title;
        private String author;
        private int year;

        public Book(String id, String title, String author, int year) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return id.equals(book.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
}
 public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("1", "Java", "Author 1", 2000));
        books.add(new Book("2", "Python", "Author 2", 2001));
        books.add(new Book("3", "C++", "Author 3", 2002));
        books.add(new Book("4", "JavaScript", "Author 4", 2003));
        books.add(new Book("5", "PHP", "Author 5", 2004));
        books.add(new Book("6", "Ruby", "Author 6", 2005));
        books.add(new Book("7", "C#", "Author 7", 2006));
        books.add(new Book("8", "Swift", "Author 8", 2007));
        books.add(new Book("9", "Kotlin", "Author 9", 2008));
        books.add(new Book("10", "Go", "Author 10", 2009));

        List<Book> booksAfter2005 = filterBooksByYear(books, 2005);
        Collections.sort(booksAfter2005, Comparator.comparing(Book::getTitle));
        for (Book book : booksAfter2005) {
            System.out.println(book);
        }
    }

    public static List<Book> filterBooksByYear(Set<Book> books, int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
 }
}
