/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author arthur62977636
 */
public class JogodaVelha {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        Tabuleiro tabuleiro = new Tabuleiro ("1-Cada jogador deve escolher um simbolo;" + "2 - O jogador 1 inicia  a partida");
       
       Jogador jogador1 = new Jogador (1,"Arthur",'x');
       Jogador jogador2 = new Jogador (2,"Henry", 'o');
       
       tabuleiro.mostrarTabuleiro();
       
    do{
        tabuleiro.mostrarTabuleiro();
       
        if(tabuleiro.getJogadordaVez() == 1){
            System.out.println("Jogador 1, escolha onde jogar:");
            String local = entrada.nextLine();
            
            tabuleiro.marcarJogada(jogador1.getSimbolo(),local);
            tabuleiro.setJogadordaVez(2);
            tabuleiro.mostrarTabuleiro();
           
        }else{
            System.out.println("Jogador 2, escolhe onde jogar");
            String local = entrada.nextLine();
            
            tabuleiro.marcarJogada(jogador2.getSimbolo(),local);
            tabuleiro.setJogadordaVez(2);
            tabuleiro.mostrarTabuleiro();
        }
       
        
       
    }while (tabuleiro.isHouveGanhadorUltRodada() == false);
       
    }
}

    

    

    
