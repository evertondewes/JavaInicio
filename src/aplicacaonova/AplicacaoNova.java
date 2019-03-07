package aplicacaonova;

import casa.Casa;
import rh.*;

public class AplicacaoNova {

    public static void main(String[] args) {

        Computador notebookEverton = new Computador();
        notebookEverton.processador = "Core i5";
        notebookEverton.ligar();
        
        Computador desktopJoao = new Computador();
        desktopJoao.processador = "Core i7";
        desktopJoao.ligar();
        
        
        System.out.println("Fim...");
    }

}
