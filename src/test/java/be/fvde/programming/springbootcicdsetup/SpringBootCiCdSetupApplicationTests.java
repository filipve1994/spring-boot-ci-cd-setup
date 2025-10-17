package be.fvde.programming.springbootcicdsetup;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringBootCiCdSetupApplicationTests {

	@Test
	void contextLoads() {
	}

}
