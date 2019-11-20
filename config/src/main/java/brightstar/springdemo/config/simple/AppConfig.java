package brightstar.springdemo.config.simple;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig implements InitializingBean{
	
	Logger logger = LoggerFactory.getLogger(AppConfig.class);
	
	@Value("${AppConfig.K1}")
	private String AppConfigK1;
	

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("AppConfigK1={}",AppConfigK1);
	}

	
}
