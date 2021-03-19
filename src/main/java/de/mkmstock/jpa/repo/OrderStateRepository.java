package de.mkmstock.jpa.repo;

import de.mkmstock.jpa.model.order.OrderState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStateRepository extends JpaRepository<OrderState, Long>{
}
