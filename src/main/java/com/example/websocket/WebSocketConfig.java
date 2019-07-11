package com.example.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * WebSocketConfig带有注释，@Configuration表示它是一个Spring配置类。
 * 它也有注释@EnableWebSocketMessageBroker。顾名思义，@EnableWebSocketMessageBroker支持WebSocket消息处理，由消息代理支持。

 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     *  该configureMessageBroker()方法实现默认方法WebSocketMessageBrokerConfigurer以配置消息代理。它首先调用enableSimpleBroker()以启用一个简单的基于内存的消息代理，以在前缀为“/ topic”的目标上将问候消息传回客户端。它还为绑定了@MessageMapping注释方法的消息指定“/ app”前缀。
     *  此前缀将用于定义所有消息映射; 例如，“/ app / hello”是GreetingController.greeting()方法映射到处理的端点。
     * @param config
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    /**
     *  该registerStompEndpoints()方法注册“/ gs-guide-websocket”端点，启用SockJS后备选项，以便在WebSocket不可用时可以使用备用传输。
     *  SockJS客户端将尝试连接到“/ gs-guide-websocket”并使用可用的最佳传输（websocket，xhr-streaming，xhr-polling等）。
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }

}
