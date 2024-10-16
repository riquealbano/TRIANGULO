package Main;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        // Criei um objeto da classe FuncoesUteis para poder usar os métodos dela
        FuncoesUteis util = new FuncoesUteis();

        // Agora vou testar o método de soma
        System.out.println("Soma de 5 e 3: " + util.soma(5, 3));

        // Testando o método para gerar o triângulo
        System.out.println("\nTriângulo com altura 4:");
        util.triangulo(4);

        // Testando o método que imprime o conteúdo de um arquivo de texto
        System.out.println("\nConteúdo do arquivo de texto:");
        util.printArquivo("C:\\Users\\henri\\OneDrive\\Documentos\\Facens\\Diversos\\Testes\\Heranca.txt"); // Aqui é o caminho do arquivo no meu PC
    }
}
