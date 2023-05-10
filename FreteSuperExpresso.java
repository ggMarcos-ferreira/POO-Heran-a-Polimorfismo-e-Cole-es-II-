/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal1;

/**
 *
 * @author aluno
 */
public class FreteSuperExpresso extends Frete implements Fretavel {
    private int nivelUrgencia;
    private double valorDoSeguro;
    
    public FreteSuperExpresso(double distancia, double valorPorKm, int nivelUrgencia, double valorDoSeguro) {
        super(distancia, valorPorKm);
        this.nivelUrgencia = nivelUrgencia;
        this.valorDoSeguro = valorDoSeguro;
    }
    
    @Override
    public double calcularFrete() {
        return (getDistancia() * getValorPorKm()) + (nivelUrgencia * 100) + valorDoSeguro;
    }
}
