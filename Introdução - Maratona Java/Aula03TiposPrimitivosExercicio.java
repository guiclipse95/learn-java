package com.guiclipse.maratonajava.introducao;

/*
 * Prática
 * 
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * 
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Guilherme Nascimento da Silva";
        String endereco = "Rua Quinto dos Infeno";
        double salario = 2500.09;
        String dataRecebimentoSalario = "08/04/2025";
        
        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+" na data "+dataRecebimentoSalario);

    }
}
