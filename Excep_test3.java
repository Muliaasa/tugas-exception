/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class Excep_test3 {

public static void main(String args[]) {
    int a = 3;
    int b = 0;
    try {
      System.out.println("result:" + divide(a,b));
    } catch (Exception e) {
      System.out.println("Exception: " + e);
}
}

private static int divide(int a, int b) throws Exception { 
    if(b == 0) { 
        throw new Exception("second argument cannot be zero.");
    }
    return a/b;
}
}

//Blok try mencoba memanggil divide(a, b). Karena b adalah 0, metode divide akan melempar pengecualian dengan pesan "Second argument cannot be zero.".
//Blok catch menangkap pengecualian ini dan mencetak pesan pengecualian.
//Metode ini memeriksa apakah b == 0. Jika benar, ia melempar pengecualian (Exception) dengan pesan "Second argument cannot be zero.".
//Jika b bukan nol, ia mengembalikan hasil pembagian a / b.
//output yang akan muncul yaitu Exception: java.lang.Exception: Second argument cannot be zero.
