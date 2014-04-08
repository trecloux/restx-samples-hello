package hello.domain;

import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Message {
    private String message;
    private LocalDate localDate = LocalDate.now();
    private Duration duration = Duration.of(3600, SECONDS);

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(final String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
