package ru.rickSanchez.company.homework_6;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        //String separator = File.separator;
        String pathFile1 = "Text_1.txt";
        String pathFile2 = "Text_2.txt";

        File f1 = new File(pathFile1);
        File f2 = new File(pathFile2);

        text.glueTogether(f1,f2);
        text.checkWord("There",f1);

    }
}
