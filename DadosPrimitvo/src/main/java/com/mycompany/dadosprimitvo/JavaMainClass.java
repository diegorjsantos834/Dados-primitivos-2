/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dadosprimitvo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class JavaMainClass {
    public static void main(String[] args) {
        // Variavéis primitivas
        byte ActionFigures = 99; // Suporta dois números, número pequenos (-128 1270
    short GanhosSemanais = 1000; // Suporta 5 casas ou mais, Guarda valores maiores, número pouco maiores(-32.768 a 32.767)
    int Fabricacao = 500000; // Número inteiros,
    long Atomos = 1000000000L; // precisa 'L' para valores longos
    
    float CM = 30.80f; //Número com casa decimal sem virgula precisa ter ponto e o é 'f' é para entender que é float, precisa do 'f'
    double Gramas = 100.5; // Número com casa decimal sem virgula precisa ter ponto

        
    char InicialDaEmpresa = 'V'; // Guarda um único caractere precisa do aspas entre o caractere
    boolean Vende = true; // Armazena verdadeiro ou falso
    
    //valores exibidos
    System.out.println("Action Figures: " + ActionFigures);
    System.out.println("Ganhos Semanais: " + GanhosSemanais);
    System.out.println("Fabricação: " + Fabricacao);
    System.out.println("Atomos: " + Atomos);
    System.out.println("CM: " + CM + "cm");
    System.out.println("Gramas: " + Gramas + "g");
    System.out.println("Incial da empresa: " + InicialDaEmpresa);
    System.out.println("Vende?" + Vende);
        
    }
    
}
