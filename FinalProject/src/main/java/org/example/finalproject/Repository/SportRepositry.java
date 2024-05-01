package org.example.finalproject.Repository;

import org.example.finalproject.Model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepositry extends JpaRepository<Sport, Integer> {
    Sport findSportById(Integer id);
}
