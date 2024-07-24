package com.example.demo;

public class Transport {
    public String segment(String data) {
        //세그먼트로 캡슐화
        String segment = "Segment: " + data;
        System.out.println("Transport Layer - Segmenting data: " + segment);
        return segment;
    }

    public String reassemble(String segment) {
        //세그먼트에서 데이터 재조립
        String data = segment.replace("Segment: ", "");
        System.out.println("Transport Layer - Reassembling segment: " + data);
        return data;
    }
}
