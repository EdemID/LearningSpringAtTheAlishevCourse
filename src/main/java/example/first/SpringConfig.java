package example.first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("example.first")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
