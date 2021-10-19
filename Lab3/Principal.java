package Lab3;

public class Principal {

    public static void main(String[] args) {
        ArrayB vet = new ArrayB();
        vet.ordena(vet.vetor);
        vet.empilhar("Ola");
        vet.empilhar("Tudo Bem");
        vet.empilhar("Como vai");
        vet.empilhar("Jhow");
        while (!vet.pilhaVazia()) {
            System.out.println(vet.pop());
        }
    }
}