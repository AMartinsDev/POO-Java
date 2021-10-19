package Lab3;

public class Array {

    public static void main(String[] args) {

        int[] vetor = new int[5];
        int i = 0;
        int j = 0;

        while (i < vetor.length) {
            vetor[j] = 10 + j;
            j++;
            i++;
        }

        for (i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        String[] vetor2 = {"Zé", "João", "Tonho"};

        for (i = 0; i < vetor2.length; i++){
            System.out.println(vetor2[i]);
        }

        vetor2[0] = "Maria";

        System.out.println("O vetor foi transformado, agora é:");

        for (i = 0; i < vetor2.length; i++){
            System.out.println( vetor2[i]);
        }
    }
}