package es.jpargoteo.bay.fwk.data.mongodb.config;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:hydra-data-mongodb.properties")
@AutoConfigureBefore(value= {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class BayDataMongoDBAutoConfiguration {
}
