package brightstar.springdemo.config.group;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class SelfOutConfig {
	
	static Logger logger = LoggerFactory.getLogger(SelfOutConfig.class);
	
//	@Value("${SelfOutConfigDir}")
	static String configDir="group";

	public static void main(String[] args) {
		String config = System.getProperty("user.dir") + "/" + "config"+"/"+configDir + "/SelfOutConfig.properties";
		File configF = new File(config);
		if(!configF.exists()) {	
			logger.error("config file is not exist");
		}
		try {
			Properties prop = new Properties();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(configF.getAbsolutePath()));
			prop.load(bufferedReader);
			bufferedReader.close();
			System.out.println(prop.getProperty("SelfOutConfigK1"));
		}catch(Exception e) {
			logger.error("",e);
		}		
	}



}
