package exercicios;

import java.sql.Array;

public class EexrcicioThree {

        public int[] plusOne(int[] digits) {
            // Percorre o array da direita para a esquerda.
            for (int i = digits.length - 1; i >= 0; i--) {
                // Se o dígito atual não for 9, adicione 1 e retorne.
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                // Se o dígito for 9, ele se torna 0 e o loop continua
                // para adicionar 1 ao próximo dígito à esquerda.
                digits[i] = 0;
            }

            // Este bloco é executado apenas se todos os dígitos eram 9.
            // Ex: [9,9] -> [1,0,0].
            // Crie um novo array com uma posição a mais.
            int[] newDigits = new int[digits.length + 1];
            // O primeiro dígito é 1 e o restante será 0 por padrão.
            newDigits[0] = 1;

            return newDigits;
        }
    }
    }
}
