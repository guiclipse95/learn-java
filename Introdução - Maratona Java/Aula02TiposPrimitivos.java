package com.guiclipse.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean;
        int idade = (int) 100000000000000l;
        long numeroGrande = 100000l;
        double salarioDouble = 2800;
        float salarioFloat = 2500.0f;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Guilherme Nascimento da Silva";

        System.out.println("a idade é "+idade+" anos!");
        System.out.println(salarioDouble);
        System.out.println("char "+caractere);
        System.out.println(nome);
    }
}
