package com.example.websocket.entity;

/**
 * 该服务将接受包含STOMP消息中名称的消息，该消息的主体是JSON对象。如果给出的名称是“Fred”，那么消息可能如下所示：

 {
 "name": "Fred"
 }
 要为带有名称的消息建模，可以使用name属性和相应的getName()方法创建一个普通的旧Java对象：
 */
public class HelloMessage {

    private String name;
    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
