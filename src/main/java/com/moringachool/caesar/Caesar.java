package com.moringachool.caesar;

import java.util.Scanner;
public class Caesar {

    private String text;
    private int shiftValue;

    public Caesar(String text, int shiftValue) {
        this.text = text;
        this.shiftValue = shiftValue;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getShiftValue() {
        return shiftValue;
    }

    public void setShiftValue(int shiftValue) {
        this.shiftValue = shiftValue;
    }


    public static String encrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }

                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }

                }

            } else {
                cipherText += ch;

            }
        }
        return cipherText;
    }

    public static String decrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c < 'a') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }

                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }

                }

            } else {
                cipherText += ch;

            }
        }
        return cipherText;
    }

}
