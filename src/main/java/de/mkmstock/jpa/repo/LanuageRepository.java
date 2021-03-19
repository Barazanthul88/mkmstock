package de.mkmstock.jpa.repo;

import de.mkmstock.jpa.model.order.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanuageRepository extends JpaRepository<Language, Long>{
}
