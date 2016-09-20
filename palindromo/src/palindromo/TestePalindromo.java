package palindromo;

public class TestePalindromo {

	public static void main(String[] args) {
		
		Palindromo p = new Palindromo();
		
		//boolean pal = p.isPalindromoUtilizandoClasseExternaUtilChamadaStringBuilderParaReverter("reviver");
		boolean pal = p.isPalindromoJeitoGauderioNoBracoGuerreiro("ana");
		System.out.println(pal);
	}

}
