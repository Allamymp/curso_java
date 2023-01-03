package exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio_23 {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());


		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();

		LocalDate d4 = LocalDate.parse("2023-01-01");
		LocalDateTime d5 = LocalDateTime.parse("2023-01-01T11:39:17");
		Instant d6 = Instant.parse("2023-01-01T11:39:17z");
		Instant d7 = Instant.parse("2023-01-01T11:39:17-03:00");

		LocalDate d8 = LocalDate.parse("01/01/2023", dtf);
		LocalDateTime d9 = LocalDateTime.parse("01/01/2023 12:23:30", dtf2);
		
		LocalDate d10 = LocalDate.of(2023, 1, 1);
		LocalDateTime d11 = LocalDateTime.of(2023,1,1,12,40,30);
		Instant d12 = Instant.parse("2023-01-01T12:40:30z");
		
		
		System.out.println("LocalDate = " + d1.toString());
		System.out.println("LocalDateTime = " + d2.toString());
		System.out.println("Instant = " + d3.toString());
		System.out.println("LocalDate.parse = " + d4.toString());
		System.out.println("LocalDateTime.parse = " + d5.toString());
		System.out.println("Instant.parse = " + d6.toString());
		System.out.println("Instant.parse = " + d7.toString());
		System.out.println("LocalDate DateTimeFormatter = " + d8.toString());
		System.out.println("LocalDateTime DateTimeFormatter= " + d9.toString().replace("T"," "));
		System.out.println("LocalDate.of = " + d10.toString());
		System.out.println("LocalDateTime.of = " + d11.toString());
		System.out.println("LocalDateTime.of with format = " + d11.format(dtf2));
		System.out.println("Instant with format = " + dtf3.format(d12));
	}

}
