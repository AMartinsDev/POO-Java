package Lab4;

import java.util.Scanner;

public class Temperatura {

    float quente, frio, atual;

    public Temperatura() {
        quente = 40;
        frio = 10;
    }

    public void recebeValor(){
        Scanner scanner = new Scanner(System.in);
        this.atual = scanner.nextFloat();
    }

    public void testeTemperatura(){
        if(atual == 10){
            System.out.println("Está frio");
        }
        else if(atual == 40){
            System.out.println("Está quente");
        }
        else if((atual < 40) && (atual > 10)){
            System.out.println("Está normal");
        }
        else if((atual > 40) || (atual < 10)){
            System.out.println("Extremo");
        }
    }
}
