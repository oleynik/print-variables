package ua.infinity.experiments.environment.printvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintVariablesApplication.class, args);
		System.getenv()
				.entrySet()
				.stream().map(entry -> String.join(" -> ", entry.getKey(), entry.getValue()))
				.forEach(System.out::println);
	}
}
