package com.github.huifer.start;

import com.github.huifer.configuration.AppVersionConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author huifer
 */
@SpringBootApplication(scanBasePackages = {"com.github.huifer.*"})
@EnableConfigurationProperties({AppVersionConfiguration.class})
public class TemplateApp {

  private static final Logger log = LoggerFactory.getLogger(TemplateApp.class);

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(TemplateApp.class, args);
    AppVersionConfiguration bean = run.getBean(AppVersionConfiguration.class);
    System.out.println();
  }

  @Bean
  public ApplicationRunner startRunner() {
    return args -> {
      if (log.isInfoEnabled()) {
        log.info("项目启动成功");
      }
    };
  }

}
