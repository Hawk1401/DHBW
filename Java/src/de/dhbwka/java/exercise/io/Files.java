package de.dhbwka.java.exercise.io;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File("c:\\myDir");
        dir.mkdir();

        File file1 = new File("c:\\myDir", "foo1.txt");
        File file2 = new File("c:\\myDir", "foo2.txt");
        File file3 = new File("c:\\myDir", "foo3.txt");

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        File[] items = dir.listFiles();
        for (File item : items) {
            System.out.println(item.toString());
        }

        file1.delete();
        file2.delete();
        file3.delete();

        dir.delete();
    }
}
