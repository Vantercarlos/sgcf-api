package br.com.vantercarlos.financeiro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(length = 8)
    private String cep;

    @Column(length = 50, nullable = false)
    private String estado;

    @Column(length = 50, nullable = false)
    private String cidade;

    @Column(length = 50)
    private String rua;

    @Column(length = 50)
    private String bairro;

    @Column(length = 90)
    private Integer numero;

}
