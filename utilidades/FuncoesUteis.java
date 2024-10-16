package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {
	
	// Método que exibe a soma entre dois valores
	public int soma(int a, int b) {
        return a + b;
    }

    // Método que exibe um triângulo com a altura especificada
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            // Constrói uma linha com a quantidade de 'x' correspondente ao número da linha
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            // Pula para a próxima linha
            System.out.println(); 
        }
    }

    public void printArquivo(String caminhoArquivo) {
        BufferedReader reader = null;
        try {
            // Abrir o arquivo para leitura
            reader = new BufferedReader(new FileReader(caminhoArquivo));
            String linha;

            // Lê e imprime cada linha do arquivo até encontrar o final
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            // Caso ocorra um erro ao ler o arquivo, imprime o erro
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Fecha o arquivo após a leitura
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
