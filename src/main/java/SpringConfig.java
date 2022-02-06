import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(initMethod = "", destroyMethod = "")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
