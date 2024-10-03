import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) { // Capturando a exceção personalizada
            System.out.println(exception.getMessage()); // Imprimindo a mensagem de erro
        } finally {
            terminal.close(); // Fechando o scanner
        }
    }
		
	
	//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
//realizar o for para imprimir os números com base na variável contagem
		for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println(i);
        }
		
}
}