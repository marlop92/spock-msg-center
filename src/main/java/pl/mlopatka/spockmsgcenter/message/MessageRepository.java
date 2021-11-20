package pl.mlopatka.spockmsgcenter.message;

import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MessageRepository {

    private Clock messagesClock = Clock.fixed(Instant.parse("2018-11-30T18:35:24.00Z"), ZoneId.of("Poland"));
    private Map<String, Message> messagesBySenders;

    public MessageRepository() {
        this.messagesBySenders = Map.of(
                "1", new Message("1", "2", LocalDateTime.now(messagesClock), "Hey"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<>(messagesBySenders.values());
    }
}
