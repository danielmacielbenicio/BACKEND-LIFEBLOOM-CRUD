package br.com.danielmaciel.lifebloom.repository;

import br.com.danielmaciel.lifebloom.entity.Lifebloom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifebloomRepository extends JpaRepository<Lifebloom, Long> {

}