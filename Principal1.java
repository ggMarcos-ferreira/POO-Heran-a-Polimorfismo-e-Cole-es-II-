/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package postgresql.principal1;

/**
 *
 * @author aluno
 */
public class Principal1 {

    public static void main(String[] args) {
        CadastroFrete cadastro = new CadastroFrete();
        
        FretePadrao fretePadrao = new FretePadrao(100, 2.5);
        cadastro.adicionarFrete(fretePadrao);
        
        FreteExpresso freteExpresso = new FreteExpresso(200, 3.0, 2);
        cadastro.adicionarFrete(freteExpresso);
        
        FreteSuperExpresso freteSuperExpresso = new FreteSuperExpresso(300, 4.0, 3, 100.0);
        cadastro.adicionarFrete(freteSuperExpresso);
        
        double valorTotal = cadastro.calcularValorTotal();
        System.out.println("Valor total dos fretes cadastrados: R$ " + valorTotal);
    }
}

