package brightstar.springdemo.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FreeTest {
	
	@Test
	public void testsplit() {
		String s = "sd/fs";
		String[] ss = s.split("\\/");
		System.out.println(ss.length);
	}

}
