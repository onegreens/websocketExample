package com.example.websocket.entity;

/**
 * 在接收到消息并提取名称后，服务将通过创建问候语并在客户端订阅的单独队列上发布该问候语来处理它。问候语也将是一个JSON对象，可能看起来像这样：

 {
 "content": "Hello, Fred!"
 }
 要为问候语表示建模，可以使用content属性和相应的getContent()方法添加另一个普通的旧Java对象：
 */
public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
