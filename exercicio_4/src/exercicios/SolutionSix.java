package exercicios;

public class SolutionSix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // --- 2. Lógica de Varredura Vertical ---

        // Usamos a primeira string como referência para a varredura.
        String primeiraString = strs[0];

        // Loop externo: itera sobre os caracteres da primeira string (referência).
        for (int i = 0; i < primeiraString.length(); i++) {
            // Obtém o caractere atual da string de referência.
            char caractereAtual = primeiraString.charAt(i);

            // Loop interno: compara o caractere atual com o mesmo caractere em todas as outras strings.
            for (int j = 1; j < strs.length; j++) {
                // Duas condições para parar a busca:
                // 1. O índice 'i' é igual ao tamanho da string atual (a string é muito curta).
                // 2. O caractere na posição 'i' da string atual é diferente do caractere de referência.
                if (i == strs[j].length() || strs[j].charAt(i) != caractereAtual) {
                    // Se qualquer uma das condições for verdadeira, significa que o prefixo comum terminou.
                    // Retorna a substring da primeira string, do início até o índice 'i'.
                    return primeiraString.substring(0, i);
                }
            }
        }

        // --- 3. Caso de Sucesso ---
        // Se o loop externo terminou, significa que todos os caracteres da primeira string
        // são comuns a todas as outras strings. A primeira string é o prefixo mais longo.
        return primeiraString;
    }
}
