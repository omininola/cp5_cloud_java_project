package br.com.fiap.safehub.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "T_SAFEHUB_ESTOQUE_ABRIGO")
public class EstoqueAbrigo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTOQUE")
    private Long idEstoque;

    @Column(name = "alimento", length = 100)
    private String alimento;

    @Column(name = "qtd_alimento", length = 100)
    private float quantidadeAlimento;

    @Column(name = "roupa", length = 100)
    private String roupa;

    @Column(name = "qtd_roupa", length = 100)
    private float quantidadeRoupa;

    @Column(name = "medicamento", length = 100)
    private String medicamento;

    @Column(name = "qtd_medicamento", length = 100)
    private float quantidadeMedicamento;

    @Column(name = "litros_agua", length = 100)
    private float litrosAgua;

    @Column(name = "nr_pessoa", length = 200)
    private int numeroPessoa;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "fk_id_abrigo")
    private CadastroAbrigo chaveAbrigo;

}
