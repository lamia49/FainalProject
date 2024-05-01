package org.example.finalproject.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Ticket {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
      @NotEmpty(message = "name must be not empty")
      @Column(columnDefinition = "varchar(30) not null")
    private String name;
      @Column(columnDefinition = "varchar(30) not null")
      @NotEmpty(message = "SportType must be not empty")
      @Pattern(regexp = "^(Karate |Swimming|Archery)")
     private String sportType;
      @Column(columnDefinition = "varchar(30) not null")
      @NotEmpty(message = "Statue must be not empty")
      @Pattern(regexp = "^(Purchaed |Avalibal|Holde)")
  private String Statue;
     @NotNull(message = "Seat must be not empty")
     @Column(columnDefinition = "int not null")
   private Integer seats;
     @Column(columnDefinition = "varchar(30) not null")
     @NotEmpty(message = "Seat Class must be not empty")
     @Pattern(regexp = "^(Bronze |Silver|Gold)")
   private String SeatClass;
     @NotNull(message = "Price must be not empty")
     @Column(columnDefinition = "int not null")
     private Integer Price;
}
