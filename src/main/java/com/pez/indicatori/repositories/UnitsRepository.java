package com.pez.indicatori.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pez.indicatori.entities.Unit;

@Repository
@Transactional
public interface UnitsRepository  extends JpaRepository<Unit, Long>{

    List<Unit> findAll();
}
