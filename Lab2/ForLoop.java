

public class ForLoop {

    public static void main (String args[]) {

        for (int i = 0; i < 5; i++) {
            System.out.println("OI");
        }

        int soma = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                soma++;
            }
        }
        System.out.println(soma);
    }
}
