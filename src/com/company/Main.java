package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        Scanner declaration = new Scanner(new File("src/Files/Declaration.txt"));
        Scanner codex = new Scanner(new File("src/Files/Codex.txt")).useDelimiter(",\\s");

        while (codex.hasNext()) {
            num.add(codex.nextInt() - 1);  //Account for indexing starting at 1 instead of 0.

        }
        while (declaration.hasNext()) {
            words.add(declaration.next());
        }

        for (int n : num) {
            System.out.print(words.get(n).charAt(0));
        }

        declaration.close();
        codex.close();
    }
}
