package br.com.vantercarlos.financeiro.entity;

import br.com.vantercarlos.financeiro.entity.enums.EstadoCivilEnum;
import br.com.vantercarlos.financeiro.entity.enums.TipoPessoaEnum;
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
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_ENDERECO", nullable = false)
    private Endereco endereco;

    @Column(length = 150, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "EN_TIPO", nullable = false)
    private TipoPessoaEnum tipo;

    @Column(length = 255, unique = true, nullable = false)
    private String documento;

    @Column(name = "TX_PROFISSAO",length = 50, nullable = false)
    private String profissao;

    @Enumerated(EnumType.STRING)
    @Column(name = "EN_ESTADO_CIVIL", nullable = false)
    private EstadoCivilEnum estadoCivil;
}
