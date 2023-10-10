package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Chavindu
 * created : 10/10/2023-4:21 PM
 **/

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig : Instantiated");
    }

}
