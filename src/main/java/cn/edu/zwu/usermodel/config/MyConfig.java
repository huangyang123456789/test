package cn.edu.zwu.usermodel.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 19:26
 */
@Configuration
public class MyConfig {
        /**
            * @Description 解决postman测试参数问题
            * @Author yjf
            * @Parameters
            * @Return
            * @Date 2020/4/30 21:26
            */
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                connector.setProperty("relaxedQueryChars", "|{}[]");
            }
        });
        return factory;
    }
}
