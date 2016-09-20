package palindromo;

public class Palindromo {
	
	private boolean palindrome;
	

	public boolean isPalindromoUtilizandoClasseExternaUtilChamadaStringBuilderParaReverter(String palavra) { //ANA   //JOSE
		if(palavra.equals(new StringBuilder(palavra).reverse().toString())) {
			palindrome = true;
		} else{
			palindrome = false;
		}
		return palindrome;
	}
	
	public boolean isPalindromoJeitoGauderioNoBracoGuerreiro(String palavra) { //ANA   //JOSE
		String novaPalavraReversa = ""; // string é uma palavra ou seja um conjunto de letras
		
		char[] letras = palavra.toCharArray(); // CHAR É UMA LETRA, uma string possui um array vetor de Char
		
		for(int i = letras.length-1; i >= 0 ; i--){
			novaPalavraReversa += letras[i];
		}
		
		if(palavra.equals(novaPalavraReversa)) {
			palindrome = true;
		} else{
			palindrome = false;
		}
		
		return palindrome;
	}
}
