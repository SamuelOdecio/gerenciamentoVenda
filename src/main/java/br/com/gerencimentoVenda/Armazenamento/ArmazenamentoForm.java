/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Armazenamento;


import br.com.gerencimentoVenda.Local.LocalDto;
import br.com.gerencimentoVenda.Produto.ProdutoDto;
import br.com.gerencimentoVenda.arch.dto.AdapterBaseObjectForm;
import java.util.List;
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
public class ArmazenamentoForm extends AdapterBaseObjectForm {
    
    private String data;
    private List <LocalDto> idLocal;
    private List <ProdutoDto> produtos;
    private int qtdeProduto;
    
}
