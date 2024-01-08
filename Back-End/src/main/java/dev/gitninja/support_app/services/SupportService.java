package dev.gitninja.support_app.services;

import java.util.List;
import org.springframework.stereotype.Service;

import dev.gitninja.support_app.exceptions.Support.SupportNotFoundException;
import dev.gitninja.support_app.models.Support;
import dev.gitninja.support_app.repositories.SupportRepository;

@Service
public class SupportService {

    SupportRepository repository;

    public SupportService(SupportRepository repository) {
        this.repository = repository;    
    }

    public List<Support> getAll(){
        List<Support> support = repository.findAll();
        return support;
    }
    public Support getById(Long id) throws Exception{
        Support support = repository.findById(id).orElseThrow(() -> new SupportNotFoundException("Request Not Found"));

        return support;
    }   
    public Support save(Support support){
        Support newSupport = repository.save(support);
        return newSupport;
    }
    
}
