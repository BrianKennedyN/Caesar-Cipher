package com.moringachool.caesar;

import java.util.Scanner;

import static com.moringachool.caesar.Caesar.decrypt;
import static com.moringachool.caesar.Caesar.encrypt;

public class App {
    public static void main(String[] args){
        System.out.println("This a Caesar Cipher Encryption Program \n Follow instructions below to get started");
        while (true){
            System.out.println("Choose E for encrytpion and D for decryption");
            Scanner myScanner = new Scanner(System.in);
            String choice = myScanner.nextLine();
            if (choice.equals("E")){
                System.out.println("Welcome to Caesar Cipher \n Enter text you want encrypted");
                Scanner scanner = new Scanner(System.in);
                String text  = scanner.nextLine();
                System.out.println("Enter Key to encrypt with \n");
                int shift = scanner.nextInt();
                String cipher = encrypt(text, shift);
                System.out.println("Encrypted Text is " + "" + cipher);
                break;
            } else if (choice.equals("D")){
                //decryption
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Message You want Decrypted");
                String encryptedText = scanner.nextLine();
                System.out.println("Enter Key to Decrypt with \n");
                int decryptShift = scanner.nextInt();
                String decryptedText = decrypt(encryptedText, decryptShift);

                System.out.println("Decrypted Text is:" + decryptedText);

            }
        }
    }

}
      // encryption


