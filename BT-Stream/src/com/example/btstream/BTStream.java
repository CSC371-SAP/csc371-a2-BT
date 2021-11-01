package com.example.btstream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BTStream {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("dataset/5000 BT Records.csv");
        if (Files.exists(path)) {
            try {
                Stream<String> stream = Files.lines(path);
                stream.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("file does not exist");
        }
    }
}
