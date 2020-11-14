package core.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RESTApplication
{
	public static void main(String[] args)
	{
		new Client();
		SpringApplication.run(RESTApplication.class, args);
	}
}
