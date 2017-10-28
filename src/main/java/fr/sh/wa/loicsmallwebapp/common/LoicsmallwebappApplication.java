package fr.sh.wa.loicsmallwebapp.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"fr.sh.wa.loicsmallwebapp.common.running",
		"fr.sh.wa.loicsmallwebapp.hello"} )
public class LoicsmallwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoicsmallwebappApplication.class, args);
	}
}
