package pl.mlopatka.spockmsgcenter.message;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageService {

    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.getAllMessages();
    }
}
