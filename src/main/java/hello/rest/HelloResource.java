package hello.rest;

import hello.domain.Message;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

import java.time.Clock;
import java.time.LocalDateTime;

import static java.time.format.DateTimeFormatter.ofPattern;

@Component @RestxResource
public class HelloResource {

    private Clock clock;

    public HelloResource(Clock clock) {
        this.clock = clock;
    }

    @PermitAll
    @GET("/message")
    public Message sayHello(String who) {
        return new Message().setMessage(String.format(
                "hello %s, it's %s",
                who, LocalDateTime.now(clock).format(ofPattern(("HH:mm:ss")))));
    }
}
