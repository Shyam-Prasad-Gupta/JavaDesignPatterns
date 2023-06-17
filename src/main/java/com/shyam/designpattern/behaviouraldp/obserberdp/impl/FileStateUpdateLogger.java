package com.shyam.designpattern.behaviouraldp.obserberdp.impl;

import com.shyam.designpattern.behaviouraldp.obserberdp.pojo.EventMessage;
import com.shyam.designpattern.behaviouraldp.obserberdp.ISubscriber;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FileStateUpdateLogger implements ISubscriber {
    @Override
    public void update(EventMessage message) {

        switch (message.getEventType()){
            case UPDATE -> System.out.println(message.getEventMessage());
            case CREATE -> System.out.println(message.getEventMessage());
            case DELETE -> System.out.println(message.getEventMessage());
            default -> System.out.println("Invalid event receiver from event manager.");
        }
    }
}
