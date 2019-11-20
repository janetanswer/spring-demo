package brightstar.springdemo.config.group;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@PropertySource("file:./config/group/mapConfig.properties")
@RequiredArgsConstructor
@ConfigurationProperties
public class MapConfig implements InitializingBean{
	
	Logger logger = LoggerFactory.getLogger(MapConfig.class);
	
	public Map<String, StarLocalDate> MapConfig = new HashMap<String, StarLocalDate>(); 
	
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("MapConfig={}",MapConfig);
	}

	public void setMapConfig(Map<String, StarLocalDate> mapConfig) {
		MapConfig = mapConfig;
	}

}
