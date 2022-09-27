package com.spring.comferencedemo.Controllers;

import com.spring.comferencedemo.Models.Session;
import com.spring.comferencedemo.Repository.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {
    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> List() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

//    @PostMapping
//     @ResponseStatus(HttpStatus.CREATED)
//    public Session create(@RequestBody final Session session) {
//        return sessionRepository.saveAndFlush(session);
//    }

//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Long id) {
//        //Also need to check for children records before deleting
//        sessionRepository.deleteById(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public void update(@PathVariable Long id, @RequestBody Session session){
//       //Because this is a PUt we expect all attributes to be passed in. A paTCH would only need what
//        //TODO: Add validation that all attributes are passed in, otherwise return 400 bad payload
//       // Session existingSession = sessionRepository.getReferenceById(id);
//        Session existingSession = sessionRepository.getOne(id);
//        BeanUtils.copyProperties(session, existingSession, "session_id");
//        sessionRepository.saveAndFlush(existingSession);
//    }
}

