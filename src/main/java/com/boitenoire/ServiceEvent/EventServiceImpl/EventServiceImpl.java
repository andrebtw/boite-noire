package com.boitenoire.ServiceEvent.EventServiceImpl;

import com.boitenoire.Model.Event;
import com.boitenoire.RepositoryEvent.RepositoryEvent;
import com.boitenoire.ServiceEvent.EventService;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public class EventServiceImpl implements EventService {

    private final RepositoryEvent repositoryEvent;
    public EventServiceImpl(RepositoryEvent repositoryEvent) {
        this.repositoryEvent = repositoryEvent;
    }


    @Override
    public List<Event> findAll() {
        return repositoryEvent.findAll();
    }

    @Override
    public Optional<Event> findById(Long id) {
        return repositoryEvent.findById(id);
    }

    @Override
    public Event create(Event event) {
        return repositoryEvent.save(event);
    }


}
