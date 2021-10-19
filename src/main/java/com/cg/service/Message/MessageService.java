package com.cg.service.Message;

import com.cg.model.Message;
import com.cg.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MessageService implements IMessageService{

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteById(Long id) {
        messageRepository.deleteById(id);
    }
}
