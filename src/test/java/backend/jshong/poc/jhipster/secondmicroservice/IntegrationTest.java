package backend.jshong.poc.jhipster.secondmicroservice;

import backend.jshong.poc.jhipster.secondmicroservice.config.AsyncSyncConfiguration;
import backend.jshong.poc.jhipster.secondmicroservice.config.JacksonConfiguration;
import backend.jshong.poc.jhipster.secondmicroservice.config.TestSecurityConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { SecondMicroserviceApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
public @interface IntegrationTest {
}
