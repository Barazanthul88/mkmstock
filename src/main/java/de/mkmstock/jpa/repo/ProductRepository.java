package de.mkmstock.jpa.repo;

import de.mkmstock.jpa.model.order.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
