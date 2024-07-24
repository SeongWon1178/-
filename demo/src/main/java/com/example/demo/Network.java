package com.example.demo;

public class Network {
    public String route(String data) {
        //패킷 라우팅
        String packet = "Packet: " + data;
        System.out.println("Network Layer - Routing data: " + packet);
        return packet;
    }

    public String unroute(String packet) {
        //패킷에서 데이터 추출
        String data = packet.replace("Packet: ", "");
        System.out.println("Network Layer - Unrouting packet: " + data);
        return data;
    }
}
