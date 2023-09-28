package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @PostMapping("events")
    public String addMultipleEvents(@RequestBody List<Event> eventList){
        return eventService.addEvents(eventList);
    }

    @PutMapping("event")
    public String updateEvent(@PathVariable Long eventId, @RequestBody Event event){
        return eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("event/{eventId}")
    public String deleteEventById(@PathVariable Long eventId){
        return eventService.deleteEventById(eventId);
    }

    @GetMapping("/events")
    public List<Event> getEventsByDate(@RequestParam(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        try {
            return eventService.getEventsByDate(date);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
