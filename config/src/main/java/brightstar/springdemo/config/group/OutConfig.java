package brightstar.springdemo.config.group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:./config/group/OutConfig.properties")
@ConfigurationProperties
public class OutConfig implements InitializingBean{
	
	Logger logger = LoggerFactory.getLogger(OutConfig.class);
	
	String OutConfigK1;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("OutConfigK1={}",OutConfigK1);
		
	}

	public void setOutConfigK1(String outConfigK1) {
		OutConfigK1 = outConfigK1;
	}

}
