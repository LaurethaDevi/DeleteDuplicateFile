/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package removeduplicatefiles;

/**
 *
 * @author Devi - BOE
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;
import java.util.HashSet;

public class DeleteDuplicateFiles {
       public static void main(String[] args) throws IOException {
        // Tentukan path folder yang akan dibaca
        File folder = new File("E:\\Ujicoba");

        // Buat Set untuk menyimpan file yang unik
        Set<String> uniqueContents = new HashSet<>();

        // Periksa setiap file di dalam folder
        for (File file : folder.listFiles()) {
            // Baca isi file
            String content = new String(Files.readAllBytes(file.toPath()));

            // Jika isi file belum ada di Set, maka file tersebut unik
            if (!uniqueContents.contains(content)) {
                uniqueContents.add(content);
            } else {
                // Jika isi file sudah ada di Set, maka file tersebut duplikat
                System.out.println("File " + file.getName() + " adalah duplikat");
                file.delete();
            }
        }
    }
    }
    
