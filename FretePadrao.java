/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal1;

/**
 *
 * @author aluno
 */
public class FretePadrao extends Frete implements Fretavel {
    public FretePadrao(double distancia, double valorPorKm) {
        super(distancia, valorPorKm);
    }
    
    @Override
    public double calcularFrete() {
        return getDistancia() * getValorPorKm();
    }
}
