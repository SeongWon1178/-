package com.example.demo;

public class Session {
    public String establishSession(String data) {
        //세션 설정
        String sessionData = "Session: " + data;
        System.out.println("Session Layer - Establishing session for data: " + sessionData);
        return sessionData;
    }

    public String terminateSession(String sessionData) {
        //세션 종료
        String data = sessionData.replace("Session: ", "");
        System.out.println("Session Layer - Terminating session for data: " + data);
        return data;
    }
}
