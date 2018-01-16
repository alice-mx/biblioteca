package com.twu.biblioteca;

import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;

public class BibliotecaApp {

    public static boolean isValid(String line) {
        String[] actions = {"list", "checkout", "return"};
        String[] types = {"book", "movie"};

        String[] arguments = line.split(" ");

        if (arguments.length != 2) {
            return false;
        } else {
            if (Arrays.asList(actions).contains(arguments[0]) && Arrays.asList(types).contains(arguments[1])){
                return true;
            } else {
                return false;
            }
        }

    }


    public static void main(String[] args) {

        User[] users = new User[]{
                new User("123-456", "hunter2", "joh  smith", "joh@mail.com"),
                new User("123-457", "hunter3", "bob  smith", "bsmith@mail.com")
        };

        Book[] books = new Book[]{
                new Book("Barry Totter", "M.K. Bowling", "1234567890123", "2012", false),
                new Book("Hungry Games", "A.B. Smith", "1234567890124", "2015", true),
                new Book("Where the Mild Things Are", "Boris Sendlack", "1234567890125", "2014", false)
        };

        Movie[] movies = new Movie[]{
                new Movie("Bar  Wars", "JJ Abrams", 3, "2012", false),
                new Movie("The Dogfather", "A.B. Jones", 4, "2015", true),
                new Movie("Thor", "BA James", 5, "2014", false)
        };


        Library lib = new Library(books, movies, users);
        Scanner sc = new Scanner(System.in);
        String line = "";

        while (!line.equals("quit")) {
            System.out.println("Please enter your user id to log in, or 'quit' to quit.");
            line = sc.nextLine();
            if(!line.equals("quit")) {
                User user = lib.findUser(line);
                if (user != null) {
                    System.out.print("Password: ");
                    String pw = sc.nextLine();

                    if (user.logIn(pw)) {
                        System.out.println(" Welcome! Type a word to perform an action" +
                                "\n" +
                                "list     [movie/book] : List Books/Movies \n" +
                                "checkout [movie/book] : Checkout a book/movie \n" +
                                "return   [movie/book] : Return a book/movie \n" +
                                "logout                : logout \n");
                        line = sc.nextLine();
                        while (!line.equals("logout")) {
                            if (!BibliotecaApp.isValid(line)) {
                                System.out.println("Error! That's not a valid code");
                            } else {
                                String action = line.split(" ")[0];
                                String category = line.split(" ")[1];

                                if (action.equals("list")) {
                                    if (category.equals("book")) {
                                        System.out.print(lib.printBooks());
                                    } else {
                                        System.out.println(lib.printMovies());
                                    }
                                } else if (action.equals("checkout") || action.equals("return")) {


                                    System.out.println("Enter the title of the " + category + " you want to " + action);

                                    Scanner ts = new Scanner(System.in);
                                    String title = ts.nextLine();

                                    Item i;
                                    if (category.equals("book")) {
                                        i = lib.findBook(title);
                                    } else {
                                        i = lib.findMovie(title);
                                    }

                                    if (action.equals("checkout")) {
                                        if (i == null || !i.checkOut()) {
                                            System.out.println("That " + category + " is not available.");
                                        } else {
                                            System.out.println("Thank you! Enjoy the " + category);
                                        }
                                    } else {
                                        if (i == null || !i.checkIn()) {
                                            System.out.println("That is not a valid "+category+" to return ");
                                        } else {
                                            System.out.println("Thank you for returning your book");
                                        }
                                    }

                                }
                            }
                            line = sc.nextLine();
                        }

                    } else {
                        System.out.println("Invalid Password");
                    }
                } else {
                    System.out.println("That user doesn't exist");
                }
            }

        }

    }

}
