package com.pluralsight.conferencedemo.controller;

import com.pluralsight.conferencedemo.model.Speaker;
import com.pluralsight.conferencedemo.repository.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
@RequiredArgsConstructor
public class SpeakerController {

    final SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    @GetMapping("{id}")
    public Speaker get(@PathVariable("id") Long id) {
        return speakerRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Speaker speaker) {
        speakerRepository.saveAndFlush(speaker);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        speakerRepository.deleteById(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Speaker speaker) {
        Speaker currentSpeaker = speakerRepository.getOne(id);
        Speaker speakerToUpdate = currentSpeaker.toBuilder()
                .company(speaker.getCompany())
                .firstName(speaker.getFirstName())
                .lastName(speaker.getLastName())
                .sessions(speaker.getSessions())
                .speakerBio(speaker.getSpeakerBio())
                .speakerPhoto(speaker.getSpeakerPhoto()).build();

        speakerRepository.saveAndFlush(speakerToUpdate);
    }
}
