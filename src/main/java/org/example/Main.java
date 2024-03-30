package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\anche\\Desktop\\Picnic\\src\\main\\java\\org\\example\\input.txt";
        File file = new File(path);
        Scanner scanner;


        String[] words;
        {
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String line = scanner.nextLine();
            words = line.split(" ");

            int count = 0;
            while (count < words.length)
                count++;
            System.out.println("Количество слов в файле: " + count);

        }
        System.out.println("Количество букв в динном слове: " + array());

        Map<String, Long> freq = Stream.of(words)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        System.out.println("Частота слова встречающиеся в файле: " + freq);

    }
    public static int array(){

        String path = "C:\\Users\\anche\\Desktop\\Picnic\\src\\main\\java\\org\\example\\input.txt";
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        int a = 0;
        String st = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > a){
                a = words[i].length();
                st = words[i];
            }
        }
        System.out.println("Самое длинное слово: " + st);
        return a;
    }
}