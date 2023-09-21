package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * Jogo de Adivinhação de Raiz Quadrada: Implemente um jogo em que o programa
		 * gera um número aleatório e pede ao jogador para adivinhar a raiz quadrada
		 * desse número. Forneça dicas de "maior" ou "menor" até que o jogador adivinhe
		 * corretamente.
		 */

		int[] numerosRaiz = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 1000 };

		int contador = 0;
		int numero = numerosRaiz[(int) (Math.random() * 11)];
		int inputUsuario;

		do {

			try {

				JOptionPane.showMessageDialog(null, " Forneça a raiz quadrada de = " + numero);

				inputUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,

						"Digite um número que corresponda a Raiz Quadrada do número fornecido anteriormente"));

				if (inputUsuario <= 0) {
					JOptionPane.showMessageDialog(null, "Você não pode inserir números negativos ou igual a 0 (zero) ");

				}

				else if (inputUsuario < Math.sqrt(numero) || inputUsuario > Math.sqrt(numero)) {
					JOptionPane.showMessageDialog(null, "O número fornecido é maior ou menor, tente adivinhar");
					contador++;

				}

				else {
					JOptionPane.showMessageDialog(null,
							"Parabéns, você acertou a raiz quadrada de " + numero + " = " + inputUsuario);

					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado ! \n tente novamente");
			}

		} while (contador < 3);

		JOptionPane.showMessageDialog(null, " Limite de tentativas excedido : " + contador + "\n A Raiz quadrada de : "
				+ numero + " é igual a =  " + Math.round(Math.sqrt(numero)));

	}

}