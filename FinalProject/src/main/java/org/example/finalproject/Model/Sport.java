package org.example.finalproject.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Sport {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  @NotEmpty(message = "name must be not empty")
  @Column(columnDefinition = "varchar(30) not null")
    private String name;
}
