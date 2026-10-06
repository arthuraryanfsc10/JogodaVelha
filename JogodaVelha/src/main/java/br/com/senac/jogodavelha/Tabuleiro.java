/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.jogodavelha;

/**
 *
 * @author arthur62977636
 */
public class Tabuleiro {
    private int notaJ1;
   private int notaJ2;
   private String regras;
   public boolean houveGanhadorUltRodada;
   private int jogadordaVez;
   private char a1,a2,a3,b1,b2,b3,c1,c2,c3;
   
    public int getJogadordaVez() {
        return jogadordaVez;
    }

    public void setJogadordaVez(int jogadordaVez) {
        this.jogadordaVez = jogadordaVez;
    }

    public boolean isHouveGanhadorUltRodada() {
        return houveGanhadorUltRodada;
    }

    public void setHouveGanhadorUltRodada(boolean houveGanhadorUltRodada) {
        this.houveGanhadorUltRodada = houveGanhadorUltRodada;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public Tabuleiro(String regras) {
        this.regras = regras;
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.houveGanhadorUltRodada = false;
        this.jogadordaVez = 1;
       
    }
    public void verificarGanhador(){
   
}
    public void organizar(){
       
       
    }
    public void mostrarTabuleiro(){
    System.out.printf("""
                        A   |   B   |   C
                        %c  |   %c  |   %c  
                            |       |      
                     -------+-------+-------
                            |       |       
                        %c  |  %c   |   %c   
                            |       |      
                     -------+-------+-------
                            |       |     
                        %c  |   %c  |   %c   
                            |       |
                     """,a1,b1,c1,a2,b2,c2,a3,a2,a3);    
  }
    public void marcarJogada(char simbolo,String coordenada){
     switch(coordenada){
         case "A1":
          this.a1 = simbolo;
          break;
          case "A2" :
             this.a2 = simbolo;
             break;
          case "A3" :
             this.a3 = simbolo;
             break;
          case "B1" :
             this.b1 = simbolo;
             break;
           case "B2" :
             this.b2 = simbolo;
             break;
           case "B3" :
             this.b3 = simbolo;
             break;  
           case "C1" :
             this.c1 = simbolo;
             break;
           case "C2" :
             this.c2 = simbolo;
             break;
           case "C3" :
             this.c3 = simbolo;
             break;  
          }
     }
 }
    

