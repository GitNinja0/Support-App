package dev.gitninja.support_app.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gitninja.support_app.models.Support;
import dev.gitninja.support_app.services.SupportService;

@RestController
@RequestMapping(path = "${api-endpoint}/support")
public class SupportController {
    
    SupportService service;

    public SupportController(SupportService service) {
        this.service = service;
    }
    
    @GetMapping(path = "")
    public List<Support> index(){
        List<Support> Support = service.getAll();

        return Support;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Support> show(@PathVariable("id") Long id) throws Exception{
        Support support = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(support);
    }

    @PostMapping(path = "")
    public ResponseEntity<Support> create(@RequestBody Support support){

        Support newSupport = service.save(support);

        return ResponseEntity.status(201).body(newSupport);
    }
}
