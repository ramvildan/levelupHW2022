package ru.levelup.homework3;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCounter {

    public static void main(String[] args) {

        System.out.println("Hello! Enter some words: ");
        consoleReader().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " " + value));

    }

    @SneakyThrows
    public static List<String> consoleReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String wordsInput = reader.readLine();

        return new ArrayList<>(Arrays.asList(wordsInput.split(" ")));
    }

}
