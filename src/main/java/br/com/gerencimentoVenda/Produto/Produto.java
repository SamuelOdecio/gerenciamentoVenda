/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Produto;

import br.com.gerencimentoVenda.Armazenamento.Armazenamento;
import br.com.gerencimentoVenda.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Suldine
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "Produto_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Produto extends BaseObject {    
   
    @Column(columnDefinition = "Double not null")
    private Double preco;
    @Column(columnDefinition = "varchar(255) not null")
    private String marca;
    @Column(columnDefinition = "varchar(255) not null")
    private String descricao;
   @ManyToOne
    @JoinColumn(name = "armazenamento_id",
            insertable = false,
            updatable = false)
    private Armazenamento idArmazenamento;



}
