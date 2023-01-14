package hello.itemservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ItemServiceApplicationTests {

	ApplicationContext ac = new AnnotationConfigApplicationContext(ItemServiceApplication.class);

	@Test
	void contextLoads() {
		System.out.println("Bean Name : " + ac);

	}

}
