package com.example.ejercicio1Examen;


@SpringBootApplication
public class Ejercicio1ExamenAplication {
    
    @Bean
	public RestTemplate getresttemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}

}
