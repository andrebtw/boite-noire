package com.boitenoire.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Document(collection = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long userId;

    @Column
    private LocalDateTime timeStamp;

    @Column
    private int ipAdress;


    public Event(){
        
    }
}
