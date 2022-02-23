package arvoregenealogica;

public class Filho extends Pessoa {

    public Filho() {
    }

    public void setNome(String nome) {
        this.nome = "Sr. " + nome;
    }

    public void cadastrarFilho(String nome, String sexo) throws Exception {
        Pessoa pessoa = null;
        if (this.descendentes.size() == 1) {
            pessoa = new FilhoNatimorto();
        } else {
            if (sexo.equalsIgnoreCase("masculino")) {
                pessoa = new Filho();
            } else {
                pessoa = new Filha();
            }
        }
        pessoa.setNome(nome);
        pessoa.setPai(this);
        this.descendentes.add(pessoa);
        
    }
}