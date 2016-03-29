/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class nomer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int faktor = in.nextInt();
        int hasil = 1;
        for(int i=1;i<=faktor;i++){
            hasil = hasil * i;
        }
        System.out.println(hasil);
    }
    Apri riyarahayu
    
}
