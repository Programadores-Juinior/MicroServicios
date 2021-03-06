package com.formacionbdi.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Permite crear objetos y registarlos en el contenedor con metodos (anotacion bean)
public class AppConfig {
	
	@Bean("ClienteRest")// cliente http para conectar con otros servicios // luego de este payo se inyecta
	public RestTemplate registarRestemplate() {
		return new RestTemplate();
	}

}
