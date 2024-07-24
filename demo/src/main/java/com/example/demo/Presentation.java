package com.example.demo;

public class Presentation {
//시저암호
    private static final int SHIFT = 3;

    public String encrypt(String data) {
        // 데이터 암호화
        StringBuilder encryptedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            encryptedData.append((char) (c + SHIFT));
        }
        String encryptedString = encryptedData.toString();
        System.out.println("Presentation Layer - Encrypting data: " + encryptedString);
        return encryptedString;
    }

    public String decrypt(String encryptedData) {
        // 데이터 암호화 해제
        StringBuilder decryptedData = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            decryptedData.append((char) (c - SHIFT));
        }
        String decryptedString = decryptedData.toString();
        System.out.println("Presentation Layer - Decrypting data: " + decryptedString);
        return decryptedString;
    }}
