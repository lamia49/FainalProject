package org.example.finalproject.Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.finalproject.API.ApiResponse;
import org.example.finalproject.Model.Sport;
import org.example.finalproject.Service.SportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1/sports/")
@RestController
public class SportController {
    private SportService sportService;


    @PostMapping("/add")
    public ResponseEntity addSports(@RequestBody @Valid Sport sport) {
        sportService.addSport(sport);
        return ResponseEntity.status(200).body(new ApiResponse("Sports added successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateSports(@PathVariable Integer id, @RequestBody @Valid Sport sport) {
        sportService.updateSport(id, sport);
        return ResponseEntity.status(200).body(new ApiResponse("Sports updated successfully"));
    }

    @GetMapping("/get")
    public List<Sport> getAllSports() {
        return sportService.getSports();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteSports(@PathVariable Integer id){
        sportService.deleteSport(id);
        return ResponseEntity.status(200).body(new ApiResponse("Sports deleted successfully"));
    }

}
