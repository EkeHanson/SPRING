package com.spring.comferencedemo.Models;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.*;
import java.util.List;

@Entity(name="speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String speaker_bio;
    private String title;
    private String company;
//    @Lob
//    @JsonSubTypes.Type(value=Speaker.class  ,name="org.hibernate.type.BinaryType")
//    private  byte[]  speaker_photo;

    Speaker(){}

//    public byte[] getSpeaker_photo() {
//        return speaker_photo;
//    }
//
//    public void setSpeaker_photo(byte[] speaker_photo) {
//        this.speaker_photo = speaker_photo;
//    }

    private List<Session> sessions;




    @ManyToMany(mappedBy = "speakers")
    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
