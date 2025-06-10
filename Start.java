
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack pilhaExemplo = new Stack();
		
		//verificando palindromo como PILHA
		String n1 = "RETER";
		char[] arrayChars = n1.toCharArray();
		
		Node node; 
        for (char c : arrayChars) {
            node = new Node(c + "");
            pilhaExemplo.push(node);
        }
        
        System.out.println(pilhaExemplo);
        int tamanho = pilhaExemplo.getSize(); 
        String invertida = "";
        for (int i = 0; i < tamanho; i++)
        	invertida = invertida + pilhaExemplo.pop();
        System.out.println(invertida);		
		
        if (n1.equals(invertida)) 
        	System.out.println("É palindromo");
        else 
        	System.out.println("Não é palindromo");
	
		
	}

}
