package com.spring.comferencedemo.Controllers;
import com.spring.comferencedemo.Models.Session;
import com.spring.comferencedemo.Models.Speaker;
import com.spring.comferencedemo.Repository.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SpeakerController {
    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list(){
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getOne(id);
    }


//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Speaker create(@RequestBody final Speaker speaker) {
//        return speakerRepository.saveAndFlush(speaker);
//    }

//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Long id) {
//        //Also need to check for children records before deleting
//        speakerRepository.deleteById(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public void update(@PathVariable Long id, @RequestBody Speaker speaker) {
//        //Because this is a PUt we expect all attributes to be passed in. A paTCH would only need what
//        //TODO: Add validation that all attributes are passed in, otherwise return 400 bad payload
//        //Speaker existingSession = speakerRepository.getReferenceById(id)
//        Speaker existingSpeaker = speakerRepository.getOne(id);
//        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
//        speakerRepository.saveAndFlush(existingSpeaker);
//    }
}

