package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Chavindu
 * created : 10/10/2023-4:21 PM
 **/
@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig:Web App Instantiated");
    }
}
