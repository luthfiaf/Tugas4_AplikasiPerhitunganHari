/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_perhitunganhari;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Aplikasi_PerhitunganHari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate today = LocalDate.now();
        System.out.println("Tanggal hari ini: " + today);

        // Membuat tanggal tertentu
        LocalDate specificDate = LocalDate.of(2023, 10, 1);
        System.out.println("Tanggal tertentu: " + specificDate);
    }
    
    
}
