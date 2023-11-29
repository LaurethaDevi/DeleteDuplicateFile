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

public class ReadFolder {
        public static void main(String[] args) throws IOException {
        // Tentukan path folder yang akan dibaca
        File folder = new File("E:\\Ujicoba");

        // Buat objek File untuk setiap file di dalam folder
        File[] files = folder.listFiles();

        // Cetak nama setiap file
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
    
}
