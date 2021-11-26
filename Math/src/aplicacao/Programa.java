package aplicacao;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" =============== Classes Math =============\n");
		
		System.out.println("N�mero de Euler: " + Math.E);
		System.out.println("N�mero de PI: " + Math.PI);
		
		System.out.println("\nResultado da soma de dois numeros: " + Math.addExact(5, 5));
		System.out.println("Resultado da subtra��o de dois numeros: " + Math.subtractExact(10, 5));
		System.out.println("Resultado da multiplica��o de dois numeros: " + Math.multiplyExact(5, 5));
		System.out.println("Multiplica 'a'*'b' e soma com 'c': " + Math.fma(3, 3, 14));
		System.out.println("Retorna a raiz quadrada da soma de numeros ao quadrado (5� + 5�): " + Math.hypot(5, 5));
		
		
		System.out.println("\nIncrementa mais um no n�mero 5: " + Math.incrementExact(5));
		System.out.println("Decrementa menos um no n�mero 5: " + Math.decrementExact(5));
		System.out.println("Converte o numero positivo para negativo: " + Math.negateExact(9));
		
		
		System.out.println("Retorna 1.0 se o numero for maior que zero: " + Math.signum(5));
		System.out.println("Retorna -1.0 se o numero for menor que zero: " + Math.signum(-5));
		System.out.println("Retorna zero se o numero for igual a zero: " + Math.signum(0));
		
		
		System.out.println("\nRetorna o valor mais pr�ximo de 5.4: " + Math.rint(5.2));
		System.out.println("Retorna o valor mais pr�ximo de 5.6: " + Math.rint(5.6));
		System.out.println("Retorna o valor mais pr�ximo de 5.5: " + Math.rint(5.5));
		
		
		System.out.println("\nPotencia de 2 elevado a 3: " + Math.pow(2, 3));
		System.out.println("Raiz quadrada de 25: " + Math.sqrt(25));
		System.out.println("Raiz c�bica de 27: " + Math.cbrt(27));
		System.out.println("Expoente do numero de Euler '2.71828' por 5 : " + Math.exp(2));
		
		
		System.out.println("\nArrendonda o resultado da divis�o para baixo 5/2: " + Math.floorDiv(5, 2));
		System.out.println("Arrendonda o resto da divis�o para baixo 3/2: " + Math.floorMod(3, 2));
		System.out.println("Converte o numero negativo para positivo -5: " + Math.abs(-5));
		

		System.out.println("\nRetorna o maior n�mero : " + Math.max(5, 6));
		System.out.println("Retorna o menor n�mero : " + Math.min(5, 6));
		System.out.println("Pr�ximo n�mero depois de 'x' em dire��o ao 'y' : " + Math.ceil(Math.nextAfter(6, 8)));
		System.out.println("Pr�ximo numeros inteiro depois de 50 : " + Math.ceil(Math.nextUp(50)));
		System.out.println("Pr�ximo n�mero inteiro antes de 50 : " + Math.floor(Math.nextDown(50)));
		
		
		System.out.println("\nArredonda pra cima depois da metade de 4.5: " + Math.round(4.7));
		System.out.println("Arredonda pra baixo antes da metade de 4.5: " + Math.round(4.4));
		System.out.println("Arredonda sempre pra cima 4.4: " + Math.ceil(4.4));
		System.out.println("Arredonda sempre pra baixo 4.7: " + Math.floor(4.7));
		
		
		System.out.println("\nGera n�meros aleat�rios: " + Math.random());
		System.out.println("Gera n�meros aleat�rios aredondando: " + Math.round(Math.random()));
		System.out.println("Gera n�meros aleat�rios de 0 a 10: " + Math.round(Math.random() * 10));
		System.out.println("Gera n�meros aleat�rios de 0 a 100: " + Math.round(Math.random() * 100));
		
		
		System.out.println("\n================ Trigonometria ============");
		System.out.println("\nTrigonometria seno em radianos: " + Math.sin(Math.toRadians(30)));
		System.out.println("Trigonometria cos em radianos: " + Math.cos(Math.toRadians(30)));
		System.out.println("Trigonometria tangente em radianos: " + Math.tan(Math.toRadians(30)));
		System.out.println("\nRetorna o angulo em radianos de seno: " + Math.asin(Math.toRadians(1)));
		System.out.println("Retorna o angulo em radianos de cos: " + Math.acos(Math.toRadians(1)));
		System.out.println("Retorna o angulo em radianos de tan: " + Math.atan(Math.toRadians(1)));
	}
}
