package brightstar.springdemo.config.group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:inconfig.properties")
@ConfigurationProperties
public class InConfig implements InitializingBean{
	
	Logger logger = LoggerFactory.getLogger(InConfig.class);
	
	private String InConfigK1;
	private String InConfigK2;
	private String InConfigK3;
	
	private String OutConfigK1;

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("InConfigK1={}",InConfigK1);
		logger.info("InConfigK2={}",InConfigK2);
		logger.info("InConfigK3={}",InConfigK3);
		logger.info("OutConfigK1={}",OutConfigK1);
		
	}

	public void setInConfigK1(String inConfigK1) {
		InConfigK1 = inConfigK1;
	}

	public void setInConfigK3(String inConfigK3) {
		InConfigK3 = inConfigK3;
	}

	public void setOutConfigK1(String outConfigK1) {
		OutConfigK1 = outConfigK1;
	}




}
