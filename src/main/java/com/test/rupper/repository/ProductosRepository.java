package com.test.rupper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.rupper.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
