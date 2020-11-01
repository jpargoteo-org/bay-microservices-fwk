package es.jpargoteo.bay.fwk.openapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BayOpenApiAutoConfiguration {

    public OpenAPI baseOpenAPI(@Value("${application-version}") String version, @Value("${application-name}") String name) {
        return new OpenAPI().components(new Components())
                .info(new Info().title(name + "-api").description(
                        "This is the version " + version + " of the " + name + " API REST."
                ).version(version))
    }

}
