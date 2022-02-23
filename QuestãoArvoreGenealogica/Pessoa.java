package arvoregenealogica;

import java.util.ArrayList;

public abstract class Pessoa {

    protected String nome;
    private Pessoa pai;
    protected ArrayList descendentes = new ArrayList(4);
    private ArrayList<String> arvoregenealogica = new ArrayList();

    public Pessoa() {
    }

    public abstract void cadastrarFilho(String nome, String sexo) throws Exception;

    public String getNome() {
        return this.nome;
    }

    public abstract void setNome(String nome);

    public Pessoa getPai() {
        return this.pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa localizaPessoa(String nome) {


        if (this.getNome().equalsIgnoreCase(nome)) {
            return this;
        }

        Pessoa retorno = null;
        int i = 0;
        while ((i < this.descendentes.size()) && (retorno == null)) {
            retorno = ((Pessoa) this.descendentes.get(i)).localizaPessoa(nome);
            i++;

        }

        return retorno;
    }

    private void arvoreGenealocica(Pessoa raiz, ArrayList<String> lista) {

            lista.add(raiz.getNome());
            Pessoa aux = null;
            int i = 0;
            while(i < raiz.descendentes.size()) {
                aux = (Pessoa) raiz.descendentes.get(i);
                this.arvoreGenealocica(aux,lista);
                i++;
            }
        }
    

    public ArrayList<String> getArvore() {
        this.arvoregenealogica.clear();
        this.arvoreGenealocica(this,this.arvoregenealogica);
        return this.arvoregenealogica;
    }

    public String getDescendencia() {
        String arvore = this.getNome();
        Pessoa aux = this.getPai();
        while (aux != null) {
            arvore += "\n" + aux.getNome();
            aux = aux.getPai();
        }

        return arvore;
    }
}