package pl.mlopatka.spockmsgcenter.message;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Message {

    private String senderId;
    private String receiverId;
    private LocalDateTime creationDate;
    private String content;
}
