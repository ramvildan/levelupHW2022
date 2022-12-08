package ru.levelup.homework3;

import com.google.common.base.CharMatcher;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCounter {

    public static void main(String[] args) {

        System.out.println("Hello! Enter some words: ");
        consoleReader().stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) -> Math.toIntExact(entry1.getValue() - entry2.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }

    @SneakyThrows
    public static List<String> consoleReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String wordsInput = reader.readLine();
            String charsToRemove = ".,_:;+=!@#$%^&*()?/{}[]";
            wordsInput = CharMatcher.anyOf(charsToRemove).removeFrom(wordsInput);

        return new ArrayList<>(Arrays.asList(wordsInput.split(" ")));
    }

}
