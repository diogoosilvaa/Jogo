package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Scenario {
    Scanner scanner = new Scanner(System.in);

    public String selecionarScenario(){
        System.out.println("Escolha o Scenario:  ");
        System.out.println("1-Carapicuiba 2-Itapevi  3-rabia Junto com Ney");

        int optionScenario = scanner.nextInt();
        scanner.nextLine();

        String scenario = "Senai - Osasco";

        switch (optionScenario){
            case 1:
                scenario = "Carapicuiba";
                break;

            case 2:
                scenario = "Itapevi";

                break;

            case 3:
                scenario = "Arabia Junto Com o Ney";
                break;
        }
        return scenario;


    }
}
