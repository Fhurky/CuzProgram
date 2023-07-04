package CüzUygulması;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberFileProcessor {
    private String filename;
    private List<Integer> numbers;

    public NumberFileProcessor(String filename) {
        this.filename = filename;
        this.numbers = new ArrayList<>();
    }

    public void readNumbersFromFile() {
        numbers.clear(); // Diziyi temizle

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    try {
                        int number = Integer.parseInt(token);
                        numbers.add(number);
                    } catch (NumberFormatException e) {
                        // Sayıya dönüştürme hatası durumunda devam et
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public void clearFileContents() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Dosyayı sıfırlayarak içeriğini siler
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeNumbersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (int number : numbers) {
                writer.write(String.valueOf(number));
                writer.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeNumber(int number) {
        numbers.remove(Integer.valueOf(number));
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    
}