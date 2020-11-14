package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.Client;

@SpringBootApplication
public class RESTApplication
{
	public static void main(String[] args)
	{
		new Client();
		SpringApplication.run(RESTApplication.class, args);
	}
}
