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
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 170)
    private String name;
    private String telefone;
    @Column(name = "numero_beneficiario")
    private int numeroBeneficiario;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Medico> medicos = new ArrayList<>();
    @OneToMany
    private List<Endereco> enederecos = new ArrayList<>();
}
