package com.guiclipse.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Aritimedicos: + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // Resto Divisão: %
        int resto = 21 % 2;
        System.out.println(resto);

        // Comparativos: <  >  <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // Operadores Logicos: && (and) , || (or) , ! (not)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        
        System.out.println("Resultado "+isDentroDaLei); 
        System.out.println("Resultado2 "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > 5000 || valorTotalContaPoupanca > valorPlayStation;
        System.out.println(isPlayStationCincoCompravel);

        // Atribuição: = += -= *= /= %=
        double bonus = 1800;
        bonus += 2000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ , --

        int contador = 0;
        contador += 1;
        contador++;
        contador--;

        int contador2 = 0;

        System.out.println(contador);
        System.out.println(++contador2);
    }
}
