package com.example.clinicamedica;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 170)
    private String name;
    private String contato;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Especialidade> especialidades = new ArrayList<>();
}
