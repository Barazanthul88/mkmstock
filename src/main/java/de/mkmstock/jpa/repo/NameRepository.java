package de.mkmstock.jpa.repo;

import de.mkmstock.jpa.model.user.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long>{
}
