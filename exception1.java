/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class exception1 {

    public static void main(String[] args) {
        int a[]= new int[5];
        a[5]=100;
    }
    
}
//Kode tersebut akan menghasilkan ArrayIndexOutOfBoundsException karena mencoba mengakses elemen array pada indeks ke-5, sedangkan array a hanya memiliki 5 elemen dengan indeks mulai dari 0 hingga 4.
//Kamu mendeklarasikan array a dengan ukuran 5.
//Elemen-elemen di array tersebut memiliki indeks dari 0 hingga 4.
//Baris a[5]=100; mencoba mengakses indeks ke-5, yang berada di luar jangkauan (out of bounds), sehingga menyebabkan exception.