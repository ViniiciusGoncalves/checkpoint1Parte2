package com.example.checkpoint1parte2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="table_exercicio4")
public class Exercicio4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String input;
    private String result;
}
