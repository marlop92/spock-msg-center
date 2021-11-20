package pl.mlopatka.spockmsgcenter.message

import spock.lang.Specification
import spock.util.time.MutableClock

import java.time.Instant
import java.time.LocalDateTime

class MessageServiceTest extends Specification {

    def mutableClock = new MutableClock(Instant.now())
    def msgRepository = Mock(MessageRepository)
    def service = new MessageService(msgRepository)

    def "should return same messages"() {
        def expectedMessages = [new Message("1", "2", LocalDateTime.now(mutableClock), "Hello")]
        msgRepository.getAllMessages() >> expectedMessages

        when:
        def messages = service.getAllMessages();

        then:
        expectedMessages == messages
    }
}
