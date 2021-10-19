package Lab5;

public class Metodoclass {

    public void welcome(){
        System.out.println("Seja Bem Vindo");
    }

    public int addTwo(int valor){
        valor = valor + 2;
        return valor;
    }

    public static void main(String[] args) {

        int valor = 3;

        Metodoclass x = new Metodoclass();
        x.welcome();
        x.addTwo(valor);
        System.out.println("addtwo com 3 é: " + x.addTwo(valor));
        x.addTwo(valor=19);
        System.out.println("addtwo com 19 é: " + x.addTwo(valor));

    }
}
