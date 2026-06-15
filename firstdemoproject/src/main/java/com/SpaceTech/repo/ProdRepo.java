package com.SpaceTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.ProductQbe;
@Repository
public interface  ProdRepo extends JpaRepository<ProductQbe, Long> {

}
