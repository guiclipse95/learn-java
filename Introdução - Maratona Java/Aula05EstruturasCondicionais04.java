package com.guiclipse.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        
        double salarioAnual = 70000;
        double primeiraFx = 9.70 / 100;
        double segundaFx = 37.35 / 100;
        double terceiraFx = 49.50 / 100;
        double valorDoImposto;

        if (salarioAnual <= 34712) {
            valorDoImposto = salarioAnual * primeiraFx;
        } else if (salarioAnual >= 34723 && salarioAnual <= 68508) {
            valorDoImposto = salarioAnual * segundaFx;
        } else {
            valorDoImposto = salarioAnual * terceiraFx;
        }

        System.out.println(valorDoImposto);
    }
}  