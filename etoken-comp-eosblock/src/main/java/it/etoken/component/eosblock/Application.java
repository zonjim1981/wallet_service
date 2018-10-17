package it.etoken.component.eosblock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@ServletComponentScan
@ComponentScan(basePackages={"it.etoken.component.eosblock","it.etoken.base.cache","it.etoken.base.common.dao","it.etoken.base.common.jpush"})
@PropertySource({"classpath:config_database.properties","classpath:config_mongodb.properties","classpath:config_redis.properties","classpath:config_jpush.properties", "classpath:config_http.properties", "classpath:config_payment.properties"}) 
public class Application {

	private final static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("=========== start news component over ===========");
    }
	
	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
		taskScheduler.setPoolSize(20);
		taskScheduler.setThreadNamePrefix("springboot-task");
		
		return taskScheduler;
	}
}