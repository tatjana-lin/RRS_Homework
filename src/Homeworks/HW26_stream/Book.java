package Homeworks.HW26_stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class Book {

    private final String title;
    private final String author;
    private final int year;
    private final double price;
    private final String genre;

    public Book(String title, String author, int year, double price, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Book> library = List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 10.99, "Fantasy"),
                new Book("Clean Code", "Robert C. Martin", 2008, 32.95, "Programming"),
                new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 28.50, "Programming"),
                new Book("Brave New World", "Aldous Huxley", 1932, 9.99, "Dystopian"),
                new Book("The Martian", "Andy Weir", 2011, 15.99, "Science Fiction")
        );

//    Задача №1
//Вывести в консоль (или вернуть из метода) все книги, выпущенные до 2000 года
        System.out.println("Task #1 ______________________________");
        System.out.println("Books published before year 2000: ");
        library.stream()
                .filter(b -> b.year < 2000)
                .forEach(System.out::println);

//    Задача №2
//Вывести в консоль все жанры и все книги каждого жанра
        System.out.println("\nTask #2 ______________________________");
        List<String> genres = library.stream()
                .map(b -> b.genre)
                .distinct()
                .toList();

        System.out.println("Genres: " + genres);

        library.stream()
                .collect(Collectors.groupingBy(b -> b.genre))
                .forEach((e1, e2) -> System.out.println(e1 + ":\n" + e2));

//        Задача №3
//Рассчитать среднюю цену книги.
        System.out.println("\nTask #3 ______________________________");
        OptionalDouble averagePrice = library.stream()
                .mapToDouble(b -> b.price)
                .average();

        System.out.println("Average book price: " + averagePrice.getAsDouble());

//        Задача №4
//Вывести в консоль все названия книг, отсортировав список по году издания
        System.out.println("\nTask #4 ______________________________");
        library.stream()
                .map(b -> b.title)
                .sorted()
                .forEach(System.out::println);

//        Задача №5
//Найти самую дорогую книгу, вывести ее название и цену
        System.out.println("\nTask #5 ______________________________");
        Optional<Book> mostExpensiveBook = library.stream()
                .max(Comparator.comparingDouble(b -> b.price));

        mostExpensiveBook.ifPresent(b -> System.out.println("The most expensive book is: " + b.title + ", price " + b.price));

//        Задача №6
//Вывести в консоль (или вернуть из метода) всех авторов через запятую (подсказка: желательно использовать Collectors.joining)
        System.out.println("\nTask #6 ______________________________");
        System.out.println(library.stream()
                .map(b -> b.author)
                .collect(Collectors.joining(", ", "Authors: ", ".")));

//        Задача №7
//Разделить всю библиотеку на книги по программированию и все остальные (используя Collectors.partitioningBy)
        System.out.println("\nTask #7 ______________________________");
        Map<Boolean, List<Book>> partitionedBooks = library.stream()
                .collect(Collectors.partitioningBy(b -> b.genre.equalsIgnoreCase("Programming")));

        System.out.println("Programming books:");
        partitionedBooks.get(true).forEach(System.out::println);

        System.out.println("Other books:");
        partitionedBooks.get(false).forEach(System.out::println);

//        Задача №8
//Для каждого жанра найти самую раннюю книгу
        System.out.println("\nTask #8 ______________________________");
        Map<String, Book> oldestBooks = library.stream()
                .collect(Collectors.groupingBy(
                        b -> b.genre,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingInt(b -> b.year)),
                                Optional::get)
                ));
        oldestBooks.forEach((genre, book) ->
                System.out.println("Genre: " + genre + " -> " + book.title + " (" + book.year + ")"));

//        Задача №9
//Подсчитать, сколько книг написал каждый автор
        System.out.println("\nTask #9 ______________________________");
        Map<String, Long> booksPerAuthor = library.stream()
                .collect(Collectors.groupingBy(b -> b.author, Collectors.counting()));
        booksPerAuthor.forEach((author, count) ->
                System.out.println(author + " wrote " + count + " book(s)"));
    }
}
