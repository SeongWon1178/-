package com.example.demo;

public class DataLink {
    public String encapsulate(String data) {
        // 데이터 링크 계층의 역할: 프레임으로 캡슐화
        String frame = "Frame: " + data;
        System.out.println("DataLink Layer - Encapsulating data: " + frame);
        return frame;
    }

    public String decapsulate(String frame) {
        // 데이터 링크 계층의 역할: 프레임을 데이터로 디캡슐화
        String data = frame.replace("Frame: ", "");
        System.out.println("DataLink Layer - Decapsulating frame: " + data);
        return data;
    }
}
