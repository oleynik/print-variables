package ua.infinity.experiments.environment.printvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

@SpringBootApplication
public class PrintVariablesApplication {

	private static Function<Map.Entry<Object, Object>, String> mapper =
			entry -> String.join(" -> ", String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));

	public static void main(String[] args) {
		SpringApplication.run(PrintVariablesApplication.class, args);

		System.out.println("Print Environment Variable:");
		printVariables(System.getenv().entrySet().stream().map(Map.Entry::copyOf));
		System.out.println(System.lineSeparator());
		System.out.println("Print System Properties:");
		printVariables(System.getProperties().entrySet().stream());
	}

	private static void printVariables(Stream<Map.Entry<Object, Object>> stream) {
		stream.map(mapper).forEach(System.out::println);
	}
}
