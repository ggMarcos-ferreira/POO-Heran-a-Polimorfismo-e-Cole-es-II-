/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal1;

/**
 *
 * @author aluno
 */
public abstract class Frete {
    private double distancia; // Distância em km
    private double valorPorKm; // Valor cobrado por quilômetro
    
    public Frete(double distancia, double valorPorKm) {
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }
    
    public abstract double calcularFrete();
    
    // Getters e Setters
    public double getDistancia() {
        return distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public double getValorPorKm() {
        return valorPorKm;
    }
    
    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
}


