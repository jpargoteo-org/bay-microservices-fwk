package es.jpargoteo.bay.fwk.security.config;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@PropertySource("classpath:bay-security.properties")
@AutoConfigureBefore(SecurityAutoConfiguration.class)
@EnableWebSecurity
public class HydraSecurityAutoConfiguration {

}