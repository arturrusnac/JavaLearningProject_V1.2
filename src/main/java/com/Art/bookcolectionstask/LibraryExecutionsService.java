package com.Art.bookcolectionstask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionsService {
    public static void main(String[] args) {


        Book book1984 = new Book("1984", "George O.");
        Book bookByology = new Book("Byology", "Martin L.");
        Book bookOameniibeauCafea = new Book("Oamenii fericiti, beau cafea", "Martin L.");
        Book bookIon = new Book("Ion", "Liviu Rebreanu");

        Library classicLibrary = new Library("Librarius");
        classicLibrary.addBook(bookByology);
        classicLibrary.addBook(bookOameniibeauCafea);
        classicLibrary.addBook(book1984);
        classicLibrary.addBook(bookIon);

        classicLibrary.printAllTheBooks();

        System.out.println("Num. Carti este :  " + classicLibrary.returnNumberBooks());
        classicLibrary.removeBook (3);
        System.out.println("1. numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook(book1984);
        System.out.println("2. numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook("Byology");
        System.out.println("3. numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.printAllTheBooks();

        Library literaLibrary = new Library("LITERA");
        literaLibrary.addBook(bookIon, book1984);
        literaLibrary.addBook(bookByology, bookOameniibeauCafea);
        literaLibrary.addBook(bookIon, bookByology);
        System.out.println(literaLibrary.returnNumberBooks());
        Map<String, Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("str. Arborilor 22", classicLibrary);
        librariesNetwork.put("str. Gr. Vieru 14", literaLibrary);

        librariesNetwork.get("str. Gr. Vieru 14").addBook(bookIon);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
        librariesNetwork.get("str. Arborilor 22").addBook(bookIon);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListOfBooksIntoTheLibraryList(literaLibrary.getBookList() );
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

    }
}