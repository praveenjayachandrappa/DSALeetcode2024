package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {


    public static void main(String[] args) {


        //Map -it is one to one transformation

//        List<String> list= Arrays.asList("hello","world","foo");
//
//        List<Integer> lengthOfwords = list.stream().map(str -> str.length()).collect(Collectors.toList());
//
//        System.out.println(lengthOfwords);

        //FlatMap : The flatMap is used for one to many transformation of elements


        List<String> words= Arrays.asList("hello","world","foo");

        for (String word:words
             ) {
            System.out.println(Arrays.toString(word.split("")));
        }
        //words.stream().map(word->word.split(""))

        List<String> charsList = words.stream().map(word -> word.split("")).flatMap(carr -> Arrays.stream(carr)).distinct()
                .collect(Collectors.toList());

        System.out.println(charsList);

        //FlatMap is used for one to many transformations .flattening the result into single stream.

    }
}
