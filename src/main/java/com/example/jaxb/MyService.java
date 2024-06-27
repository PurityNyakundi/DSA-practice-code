package com.example.jaxb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {
    public void extractDigits(String src) {

        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                numbers.add(c);
            }
        }

        System.out.println(numbers);
    }
}
