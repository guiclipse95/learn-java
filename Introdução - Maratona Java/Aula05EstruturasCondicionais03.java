package com.guiclipse.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 1000;

        // variavel = (condição) ? verdadeiro : falso;

        String resultado = (salario > 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter";


        System.out.println(resultado);
    }
}
