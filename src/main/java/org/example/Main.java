package org.example;

import org.example.Models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final ArrayList<Person> personArrayList = new ArrayList<>();
    private static final Queue<String> colorQueue = new LinkedList(Arrays.asList("\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"));

    public static void main(String[] args) {
        Person mahdiMazaheri = new Person("Mahdi Mazaheri 🔥🐢");
        // Construct your person object below


        // ----------------------------------------
        personArrayList.add(mahdiMazaheri);
        personArrayList.addAll(Arrays.asList(
                // Add your person object here
        ));
        printResultToTerminal();
    }

    private static void printResultToTerminal() {
        personArrayList.stream().forEach(person -> {
            colorQueue.add(colorQueue.peek());
            System.out.println(colorQueue.poll() + person.getName());
        });
    }

    public static int sum(int x, int y) {
        return 10;
    }
}