

public class Principal {
    public static void main(String[] args){

        JogoDaVelha x = new JogoDaVelha();
        x.tabuleiro = new String[3][3];
        x.inicializar();
        x.mostrar();
        System.out.println("\n\n");

        x.jogar("1", "X");
        x.jogadaValida("1");
        x.verificar(Integer.parseInt("1"));
        x.mostrar();
        System.out.println("\n\n");

        x.jogar("3", "O");
        x.jogadaValida("3");
        x.verificar(Integer.parseInt("2"));
        x.mostrar();
        System.out.println("\n\n");

        x.jogar("5", "X");
        x.jogadaValida("5");
        x.verificar(Integer.parseInt("3"));
        x.mostrar();
        System.out.println("\n\n");

        x.jogar("6", "O");
        x.jogadaValida("6");
        x.verificar(Integer.parseInt("4"));
        x.mostrar();
        System.out.println("\n\n");

        x.jogar("9", "X");
        x.jogadaValida("9");
        x.verificar(Integer.parseInt("5"));
        x.mostrar();

    }
}
