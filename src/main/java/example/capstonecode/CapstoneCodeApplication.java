package example.capstonecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapstoneCodeApplication {

@RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }

	public static void main(String[] args) {
		SpringApplication.run(CapstoneCodeApplication.class, args);
	}

}
