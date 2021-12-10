import java.util.ArrayList;
import java.util.List;

public class task_2_5 {
 public static void main(String[] args) {
  List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Story", "Berezovsky", "The science", 1979, 384, 50, "-"));
        books.add(new Book(2, "Kobzar", "Shevchenko", "kniga", 1980, 50, 200, "-"));
  books.add(new Book(3, "Directory", "Shchavursky", "Academy", 2007, 299, 150, "-"));
  books.add(new Book(4, "Toftul", "Franko", "ethics", 2014, 416, 80, "-"));
  
  System.out.println("\na)");
        for (Book b: books) {
            if (b.getAuthor() == "Franko") {
                System.out.println(b.toString());
            }
        }
        
        System.out.println("\nb)");
        for (Book b: books) {
            if (b.getPublHouse() == "kniga") {
                System.out.println(b.toString());
            }
        }
        
        System.out.println("\nc)");
        for (Book b: books) {
            if (b.getYear() > 1999) {
                System.out.println(b.toString());
            }
        }
 }
}

