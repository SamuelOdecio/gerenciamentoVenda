/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;

import br.com.gerencimentoVenda.Produto.ProdutoDto;
import br.com.gerencimentoVenda.Venda.VendaDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author suldine
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ItemVendaForm  {
    
    private VendaDto venda;
    private ProdutoDto produto;
   

}
