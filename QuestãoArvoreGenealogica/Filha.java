

import java.util.Random;

public class Filha extends Pessoa{
    
    public Filha() {
    }
    
    public void setNome(String nome) {
        this.nome="Sra. "+ nome;
    }
    
    public void cadastrarFilho(String nome, String sexo) throws Exception {
        Pessoa  pessoa=null;
        if(sexo.equalsIgnoreCase("masculino")){
            Random r=new Random();
            int vida=r.nextInt(2);
            if(vida==1){
                pessoa=new FilhoNatimorto();
            }else{
                pessoa=new Filho();
            }
        }else{
            pessoa=new Filha();
        }
        
        pessoa.setNome(nome);
        pessoa.setPai(this);
        this.descendentes.add(pessoa);
        
    }
}
