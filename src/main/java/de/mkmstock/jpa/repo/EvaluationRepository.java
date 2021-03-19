package de.mkmstock.jpa.repo;

import de.mkmstock.jpa.model.order.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long>{
}
