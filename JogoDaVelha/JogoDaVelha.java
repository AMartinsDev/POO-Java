

public class JogoDaVelha {

    String[][] tabuleiro;
    String jogador1, jogador2;
    int jogadas, valida;
    String vencedor;

    public JogoDaVelha() {
        jogador1 = "X";
        jogador2 = "O";
        tabuleiro = new String[3][3];
    }
    
    public void inicializar(){

        int aux = Integer.parseInt("1");
        for (int l = 0; l < tabuleiro.length; l++){
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = Integer.toString(aux++);
            }
        }
    }

    public void mostrar(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" " + tabuleiro[i][j]);
            }
            System.out.println("\n");
        }
    }

    public boolean jogadaValida(String valor){

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(tabuleiro[i][j].equals(valor));
                return true;
            }
        }
        return false;
    }

    public void jogar(String posicao, String jogador){

        if(posicao.equals("1")){
            tabuleiro[0][0] = jogador;
        }
        else if(posicao.equals("2")){
            tabuleiro[0][1] = jogador;
        }
        else if(posicao.equals("3")){
            tabuleiro[0][2] = jogador;
        }
        else if(posicao.equals("4")){
            tabuleiro[1][0] = jogador;
        }
        else if(posicao.equals("5")){
            tabuleiro[1][1] = jogador;
        }
        else if(posicao.equals("6")){
            tabuleiro[1][2] = jogador;
        }
        else if(posicao.equals("7")){
            tabuleiro[2][0] = jogador;
        }
        else if(posicao.equals("8")){
            tabuleiro[2][1] = jogador;
        }
        else if(posicao.equals("9")){
            tabuleiro[2][2] = jogador;
        }
    }

    public String verificar(int qtdjogadas){

        this.vencedor = "";

        if((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2]).equalsIgnoreCase("XXX")){
            this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]).equalsIgnoreCase("XXX")){
        	this.vencedor = "O vencedor é o Jogador 1";
        }
        else if((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]).equalsIgnoreCase("OOO")){
        	this.vencedor = "O vencedor é o Jogador 2";
        }
        else if ((qtdjogadas == 9) && (!this.vencedor.equals("O vencedor é o Jogador 1") && (!this.vencedor.equals("O vencedor é o Jogador 2")))){
            this.vencedor = "Deu Velha!";
        }
        return this.vencedor;
    }

    
	public String getVencedor() {
		return vencedor;
	}
    
    

}
