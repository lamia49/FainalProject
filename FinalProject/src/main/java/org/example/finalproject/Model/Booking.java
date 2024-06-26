package org.example.finalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Booking {
          @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   private LocalDate bookingDate;

}
