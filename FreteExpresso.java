/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal1;

/**
 *
 * @author aluno
 */
public class FreteExpresso extends Frete implements Fretavel {
    private int nivelUrgencia;
    
    public FreteExpresso(double distancia, double valorPorKm, int nivelUrgencia) {
        super(distancia, valorPorKm);
        this.nivelUrgencia = nivelUrgencia;
    }
    
    @Override
    public double calcularFrete() {
        return (getDistancia() * getValorPorKm()) + (nivelUrgencia * 100);
    }
}
