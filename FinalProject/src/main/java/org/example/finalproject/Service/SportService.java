package org.example.finalproject.Service;

import lombok.AllArgsConstructor;
import org.example.finalproject.Model.Sport;
import org.example.finalproject.Repository.SportRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SportService {
    private final SportRepositry sportRepositry;

    public void addSport(Sport sport) {
        sportRepositry.save(sport);
    }

    public List<Sport> getSports() {
        return sportRepositry.findAll();
    }
    public void updateSport(Integer id,Sport sport) {
        Sport sport1 = sportRepositry.findSportById(id);
        sport1.setName(sport.getName());
        sportRepositry.save(sport1);
    }

    public void deleteSport(Integer id) {
        Sport sport=sportRepositry.findSportById(id);
        sportRepositry.delete(sport);
    }
}
