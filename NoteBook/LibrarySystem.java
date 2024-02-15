package NoteBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {
  private Map<String, Book> library;

  public LibrarySystem() {
  library = new HashMap<>();
  }

  public void run() {
  Scanner scanner = new Scanner(System.in);
  int choice;

  do {
  System.out.println("Library System Menu");
  System.out.println("1. Add Books");
  System.out.println("2. Borrow Books");
  System.out.println("3. Return Books");
  System.out.println("4. Exit");
  System.out.print("Enter your choice: ");
  choice = scanner.nextInt();
  scanner.nextLine(); // Consume the newline character

  switch (choice) {
  case 1:
  addBooks(scanner);
  break;
  case 2:
  borrowBooks(scanner);
  break;
  case 3:
  returnBooks(scanner);
  break;
  case 4:
  System.out.println("Exiting the program...");
  break;
  default:
  System.out.println("Invalid choice. Please try again.");
  }
  System.out.println();
  } while (choice != 4);
  }

  private void addBooks(Scanner scanner) {
  System.out.print("Enter the book title: ");
  String title = scanner.nextLine();
  System.out.print("Enter the book author: ");
  String author = scanner.nextLine();
  System.out.print("Enter the quantity: ");
  int quantity = scanner.nextInt();
  scanner.nextLine(); // Consume the newline character

  if (library.containsKey(title)) {
  Book book = library.get(title);
  book.setQuantity(book.getQuantity() + quantity);
  System.out.println("Quantity updated for book: " + title);
  } else {
  Book book = new Book(title, author, quantity);
  library.put(title, book);
  System.out.println("Book added to the library: " + title);
  }
  }

  private void borrowBooks(Scanner scanner) {
  System.out.print("Enter the book title: ");
  String title = scanner.nextLine();
  System.out.print("Enter the number of books to borrow: ");
  int quantity = scanner.nextInt();
  scanner.nextLine(); // Consume the newline character

  if (library.containsKey(title)) {
  Book book = library.get(title);
  if (book.getQuantity() >= quantity) {
  book.setQuantity(book.getQuantity() - quantity);
  System.out.println("Successfully borrowed " + quantity + " books: " + title);
  } else {
  System.out.println("Insufficient quantity. Cannot borrow " + quantity + " books: " + title);
  }
  } else {
  System.out.println("Book not found in the library: " + title);
  }
  }

  private void returnBooks(Scanner scanner) {
  System.out.print("Enter the book title: ");
  String title = scanner.nextLine();
  System.out.print("Enter the number of books to return: ");
  int quantity = scanner.nextInt();
  scanner.nextLine(); // Consume the newline character

  if (library.containsKey(title)) {
  Book book = library.get(title);
  book.setQuantity(book.getQuantity() + quantity);
  System.out.println("Successfully returned " + quantity + " books: " + title);
  } else {
  System.out.println("Book not found in the library: " + title);
  }
  }

  public static void main(String[] args) {
  LibrarySystem librarySystem = new LibrarySystem();
  librarySystem.run();
  }
}

class Book {
  private String title;
  private String author;
  private int quantity;

  public Book(String title, String author, int quantity) {
  this.title = title;
  this.author = author;
  this.quantity = quantity;
  }

  public String getTitle() {
  return title;
  }

  public String getAuthor() {
  return author;
  }

  public int getQuantity() {
  return quantity;
  }

  public void setQuantity(int quantity) {
  this.quantity = quantity;
  }
}