package br.senai.sp.jandira.model;

public class Output {

    public void exibirPlayer(Player player){
        System.out.println("Exibir Informaçoes     ");
        System.out.println("O nome do Player e: " + player.getNome());
        System.out.println("A skin do Player é: " + player.getSkin());
        System.out.println("A vida inicial do player e: " +player.getVida());
        System.out.println("/----------------------");


    }

    public void exibirEnemy(Enemy enemy){
        System.out.println("Exibir Informaçoes     ");
        System.out.println("O nome do Player e: " + enemy.getNome());
        System.out.println("A skin do Player é: " + enemy.getSkin());
        System.out.println("A vida inicial do player e: " +enemy.getVida());
        System.out.println("/----------------------");


    }

}
