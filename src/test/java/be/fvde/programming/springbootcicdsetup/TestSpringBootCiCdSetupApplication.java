package be.fvde.programming.springbootcicdsetup;

import org.springframework.boot.SpringApplication;

public class TestSpringBootCiCdSetupApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootCiCdSetupApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
