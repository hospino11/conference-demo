package com.pluralsight.conferencedemo.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.util.List;

@Value
@Builder(toBuilder = true)
@Entity(name = "speakers")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speaker_id")
    long speakerId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    String company;

    @Column(name = "speaker_bio")
    String speakerBio;

    @Lob
    @Column(name = "speaker_photo")
    byte[] speakerPhoto;

    @ManyToMany(mappedBy = "speakers")
    List<Session> sessions;
}
