package dev.gitninja.support_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gitninja.support_app.models.Support;

public interface SupportRepository extends JpaRepository<Support, Long> {
    
}
