package com.example.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
	}
/**
 * @SpringBootApplication 是一个便利注释，添加了以下所有内容：

 @Configuration 标记该类作为应用程序上下文的bean定义的来源。

 @EnableAutoConfiguration 告诉Spring Boot开始根据类路径设置，其他bean和各种属性设置添加bean。

 通常你会添加@EnableWebMvc一个Spring MVC应用程序，但Spring Boot会在类路径上看到spring-webmvc时自动添加它。这会将应用程序标记为Web应用程序并激活关键行为，例如设置a DispatcherServlet。

 @ComponentScan告诉Spring在包中寻找其他组件，配置和服务hello，允许它找到控制器。

 该main()方法使用Spring Boot的SpringApplication.run()方法启动应用程序。您是否注意到没有一行XML？也没有web.xml文件。此Web应用程序是100％纯Java，您无需处理配置任何管道或基础结构。
 */
}
