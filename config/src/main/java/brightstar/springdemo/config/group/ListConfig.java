package brightstar.springdemo.config.group;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:./config/group/listConfig.properties")
@ConfigurationProperties
public class ListConfig implements InitializingBean{
	
	Logger logger = LoggerFactory.getLogger(ListConfig.class);
	
	public List<String> ListConfig = new ArrayList<String>();

	public void setListConfig(List<String> listConfig) {
		ListConfig = listConfig;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("ListConfig={}",ListConfig);
	}

}
