package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Demo0717Application {
	public static void main(String[] args) {
		// 원본 데이터
		String originalData = "Hello, World!";

		// 데이터 링크 계층
		DataLink dataLink = new DataLink();
		String frame = dataLink.encapsulate(originalData);

		// 네트워크 계층
		Network network = new Network();
		String packet = network.route(frame);

		// 전송 계층
		Transport transport = new Transport();
		String segment = transport.segment(packet);

		// 세션 계층
		Session session = new Session();
		String sessionData = session.establishSession(segment);

		// 표현 계층
		Presentation presentation = new Presentation();
		String translatedData = presentation.encrypt(sessionData);

		// 각 계층에서 데이터를 원래대로 복원
		String untranslateData = presentation.decrypt(translatedData);
		String terminateSessionData = session.terminateSession(untranslateData);
		String reassembledData = transport.reassemble(terminateSessionData);
		String unroutedData = network.unroute(reassembledData);
		String decapsulatedData = dataLink.decapsulate(unroutedData);

		// 결과 출력
		System.out.println("Original Data: " + originalData);
		System.out.println("Final Data after all layers: " + decapsulatedData);
	}
}
