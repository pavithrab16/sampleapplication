package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>SampleApplication class.</p>
 *
 */
@SpringBootApplication
@ImportResource({"classpath:routes.xml"})
@EnableSwagger2
public class SampleApplication {
  /**
   * <p>main.</p>
   *
   * @param args an array of {@link String} objects.
   */
  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);
  }
}
