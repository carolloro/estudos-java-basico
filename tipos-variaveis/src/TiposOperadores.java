public class TiposOperadores {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Operadores de atribuição
        int x = 5;
        int y = 10;
        x += 3; // x = x + 3
        y -= 2; // y = y - 2
        System.out.println("Novo valor de x: " + x);
        System.out.println("Novo valor de y: " + y);
        // Operadores de comparação
        boolean comparacao = (a < b);
        System.out.println("A é menor que B? " + comparacao);
        comparacao = (a == b);
        System.out.println("A é igual a B? " + comparacao);
        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        boolean resultado = condicao1 && condicao2;
        System.out.println("Resultado da condição AND: " + resultado);

        resultado = condicao1 || condicao2;
        System.out.println("Resultado da condição OR: " + resultado);
        resultado = !condicao1;
        System.out.println("Resultado da negação de condicao1: " + resultado);
        // Operadores de incremento e decremento
        int contador = 0;

        contador++; // Incrementa 1
        System.out.println("Contador após incremento: " + contador);
        contador--; // Decrementa 1
        System.out.println("Contador após decremento: " + contador);
        // Operadores ternários
        int idade = 18;
        String resultadoIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado da verificação de idade: " + resultadoIdade);
        // Operadores de bits
        int bitA = 5; // 0101 em binário
        int bitB = 3; // 0011 em binário

        int resultadoBits = bitA & bitB; // AND bit a bit
        System.out.println("Resultado do AND bit a bit: " + resultadoBits); // 0001 em binário (1 em decimal)
        resultadoBits = bitA | bitB; // OR bit a bit
        System.out.println("Resultado do OR bit a bit: " + resultadoBits); // 0111 em binário (7 em decimal)
        resultadoBits = bitA ^ bitB; // XOR bit a bit
        System.out.println("Resultado do XOR bit a bit: " + resultadoBits); // 0110 em binário (6 em decimal)
        resultadoBits = ~bitA; // NOT bit a bit
        System.out.println("Resultado do NOT bit a bit: " + resultadoBits); // Inverte os bits de bitA
        resultadoBits = bitA << 1; // Deslocamento à esquerda
        System.out.println("Resultado do deslocamento à esquerda: " + resultadoBits); // Multiplica por 2
        resultadoBits = bitA >> 1; // Deslocamento à direita
        System.out.println("Resultado do deslocamento à direita: " + resultadoBits); // Divide por 2
        // Operadores de instanceof
        String texto = "Olá, mundo!";
        boolean ehString = texto instanceof String;
        System.out.println("Texto é uma instância de String? " + ehString);
        // Operadores de concatenação
        String parte1 = "Olá, ";
        String parte2 = "mundo!";
        String mensagemCompleta = parte1 + parte2;
        System.out.println("Mensagem completa: " + mensagemCompleta);
        // Operadores de atribuição compostos
        int valor = 10;
        valor *= 2; // Multiplica por 2
        System.out.println("Valor após multiplicação: " + valor);
        valor /= 2; // Divide por 2
        System.out.println("Valor após divisão: " + valor);
        valor %= 3; // Módulo por 3
        System.out.println("Valor após módulo por 3: " + valor);
        // Operadores de precedência
        int resultadoPrecedencia = 5 + 3 * 2; // Multiplicação tem precedência sobre adição
        System.out.println("Resultado com precedência: " + resultadoPrecedencia); // 11
        resultadoPrecedencia = (5 + 3) * 2; // Parênteses alteram a precedência
        System.out.println("Resultado com parênteses: " + resultadoPrecedencia); // 16
        // Operadores de atribuição com operadores lógicos
        boolean condicaoA = true;
        boolean condicaoB = false;
        boolean resultadoLogico = condicaoA && (condicaoB = true); // Atribui true a condicaoB
        System.out.println("Resultado lógico com atribuição: " + resultadoLogico); // true
        System.out.println("Valor de condicaoB após atribuição: " + condicaoB); // true
        // Operadores de atribuição com operadores de bits
        int bitX = 6; // 0110 em binário
        int bitY = 3; // 0011 em binário
        bitX &= bitY; // AND bit a bit e atribui o resultado a bitX
        System.out.println("Resultado do AND bit a bit: " + bitX); // 0010 em binário (2 em decimal)
        bitX |= bitY; // OR bit a bit e atribui o resultado a bitX
        System.out.println("Resultado do OR bit a bit: " + bitX); // 0111 em binário (7 em decimal)
        bitX ^= bitY; // XOR bit a bit e atribui o resultado a bitX
        System.out.println("Resultado do XOR bit a bit: " + bitX); // 0100 em binário (4 em decimal)
        bitX <<= 1; // Deslocamento à esquerda e atribui o resultado a bitX
        System.out.println("Resultado do deslocamento à esquerda: " + bitX); // Multiplica por 2
        bitX >>= 1; // Deslocamento à direita e atribui o resultado a bitX
        System.out.println("Resultado do deslocamento à direita: " + bitX); // Divide por 2
        // Operadores de atribuição com operadores de comparação
        int valor1 = 10;
        int valor2 = 20;
        boolean resultadoComparacao = (valor1 == valor2); // Verifica se valor1 é igual a valor2
        System.out.println("Valor1 é igual a Valor2? " + resultadoComparacao); // false
        resultadoComparacao = (valor1 != valor2); // Verifica se valor1 é diferente de valor2
        System.out.println("Valor1 é diferente de Valor2? " + resultadoComparacao); // true
        resultadoComparacao = (valor1 < valor2); // Verifica se valor1 é menor que valor2
        System.out.println("Valor1 é menor que Valor2? " + resultadoComparacao); // true
        resultadoComparacao = (valor1 > valor2); // Verifica se valor1 é maior que valor2
        System.out.println("Valor1 é maior que Valor2? " + resultadoComparacao); // false
        resultadoComparacao = (valor1 <= valor2); // Verifica se valor1 é menor ou igual a valor2
        System.out.println("Valor1 é menor ou igual a Valor2? " + resultadoComparacao); // true
        resultadoComparacao = (valor1 >= valor2); // Verifica se valor1 é maior ou igual a valor2
        System.out.println("Valor1 é maior ou igual a Valor2? " + resultadoComparacao); // false
        // Operadores de atribuição com operadores de concatenação
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome; // Concatena nome e sobrenome
        System.out.println("Nome completo: " + nomeCompleto); // João Silva
        nomeCompleto += " Jr."; // Adiciona " Jr." ao nome completo
        System.out.println("Nome completo atualizado: " + nomeCompleto); // João Silva Jr.
        // Operadores de atribuição com operadores de incremento e decremento
        int contadorIncremento = 0;
        contadorIncremento++; // Incrementa 1
        System.out.println("Contador após incremento: " + contadorIncremento); // 1
        contadorIncremento--; // Decrementa 1
        System.out.println("Contador após decremento: " + contadorIncremento); // 0

    }
}
