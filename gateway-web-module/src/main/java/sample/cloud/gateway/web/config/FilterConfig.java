package sample.cloud.gateway.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sample.cloud.gateway.web.filter.SampleFilter;

@Configuration
public class FilterConfig {

    @Bean
    public SampleFilter sampleFilter() {
        return new SampleFilter();
    }

}
