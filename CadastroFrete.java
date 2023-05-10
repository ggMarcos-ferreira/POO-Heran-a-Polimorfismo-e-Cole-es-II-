/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class CadastroFrete {
    private List<Frete> fretes;
    
    public CadastroFrete() {
        fretes = new ArrayList<>();
    }
    
    public void adicionarFrete(Frete frete) {
        fretes.add(frete);
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        
        for (Frete frete : fretes) {
            valorTotal += frete.calcularFrete();
        }
        
        return valorTotal;
    }
}
