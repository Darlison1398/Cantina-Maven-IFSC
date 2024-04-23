/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.drsilvacompany.gerenciadorcantinaifsc;

import java.util.List;
import model.bo.Caixa;
import service.CaixaService;

/**
 *
 * @author Drsil
 */
public class GerenciadorCantinaIFSC {

    public static void main(String[] args) {
        // Carrega todos os dados do banco
        List<Caixa> caixas = CaixaService.carregar();
        
        // Verifica se a lista não está vazia
        if (caixas != null && !caixas.isEmpty()) {
            // Percorre a lista e imprime os dados de cada objeto Caixa
            for (Caixa caixa : caixas) {
                System.out.println("ID: " + caixa.getId());
                System.out.println("Data de Abertura: " + caixa.getDataHoraAbertura());
                System.out.println("Data de Fechamento: " + caixa.getDataHoraFechamento());
                System.out.println("Valor de Abertura: " + caixa.getValorAbertura());
                System.out.println("Valor de fechamento: " + caixa.getValorFechamento());
                System.out.println("Funcionario: " + caixa.getFuncionario().getNome());
                // Adicione mais linhas de código para imprimir outros atributos, se necessário
                System.out.println("-----------------------------------------");
            }
        } else {
            System.out.println("Não há dados de caixa no banco.");
        }
        
    }
}
