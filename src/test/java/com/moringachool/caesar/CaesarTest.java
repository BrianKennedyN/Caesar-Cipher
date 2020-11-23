package com.moringachool.caesar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest{
    @Test
    public void savesEncryptionMessage_String() {
        Caesar testText = new Caesar("Rafiki", 3);
        assertEquals("Rafiki", testText.getText());
    }

    @Test
    public void savesEncytptionShitValue_int(){
        Caesar testText = new Caesar("Rafiki", 3);
        assertEquals(3, testText.getShiftValue());

    }
     //Decryption tests
     @Test
     public void encryptDecrypt_decipherText_String() {
         Caesar testText = new Caesar("rafiki", 3);
         assertEquals("udilnl", testText.decrypt("rafiki", 3));
     }

}