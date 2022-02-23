
public class QuestaoSubstring {

    public void retornoSubstrings(String palavra){
    	
    	int aux = 0;
    	int y = 0, x = 0;
    	
        for(int i = 0; i < palavra.length(); i++) {
        	
        	for(int j = i+1; j < palavra.length(); j++){
        		
        		if(palavra.charAt(i) == palavra.charAt(j)){
        			aux++;
        			x = i;
        			y = j;
        		}
        		else if (y - x > 1) {
        			aux ++;
        			x = 0;
                	y = 0;
        		}
        	}	
        }
        
        System.out.println(aux);
    }

    public static void main(String[] args) {

        String palavra = "ovo";
        
        QuestaoSubstring x = new QuestaoSubstring();
        x.retornoSubstrings(palavra);

    }
}
