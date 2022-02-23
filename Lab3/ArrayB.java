

public class ArrayB {
    int[] vetor;
    String[] pilha;
    int posicaoPilha;

    public ArrayB() {
        vetor = new int[]{5, 8, 32, 67, 99, 15, 12, 9, 1, 99};
        pilha = new String[4];
        this.posicaoPilha = -1;
    }

    public void ordena(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        imprimir();
    }

    public void imprimir() {
        for (int j : vetor) {
            System.out.println(j);
        }
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public String exibeUltimoValor(String[] pilha) {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public String pop() {
        if (posicaoPilha < 0) {
            System.out.println("Pilha Vazia!");
            return null;
        }
        else {
            return pilha[posicaoPilha--];
        }
    }

    public void empilhar(String valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
        mostrarpilha();
    }

    public void mostrarpilha() {
        for (int i = 0; i < pilha.length; i++) {
            System.out.println(pilha[i]);
        }

    }
}

