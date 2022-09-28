/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soucetsoucin;

/**
 *
 * @author Filip Plass
 */
import java.util.Scanner;
public class SoucetSoucin {
    
    public static void main(String[] args) {
        int sum, multi, num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte dvě čísla oddělena mezerou: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        multi = num1 * num2;
        System.out.println(String.format("%d %d", sum, multi));
        
    }
}
