package exercicios;





public class ExercicioFour {
    public class Solution {
        // A classe ListNode já é fornecida na maioria das plataformas.
        // É uma boa prática incluí-la para o código ser executável localmente.
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public ListNode deleteDuplicates(ListNode head) {
            // Se a lista estiver vazia, retorne-a imediatamente.
            if (head == null) {
                return head;
            }

            // Crie um ponteiro 'current' para percorrer a lista, começando pela cabeça.
            ListNode current = head;

            // O loop continua enquanto 'current' não for nulo e 'current.next' não for nulo,
            // garantindo que não tentemos acessar um nó que não existe.
            while (current.next != null) {
                // Se o valor do nó atual for igual ao valor do próximo nó...
                if (current.val == current.next.val) {
                    // ...significa que encontramos uma duplicata.
                    // Re-ligue o ponteiro 'next' do nó atual para pular o nó duplicado.
                    // Ex: 1 -> 1 -> 2
                    //     current.next (o segundo 1) agora aponta para current.next.next (o 2).
                    //     A lista se torna 1 -> 2.
                    current.next = current.next.next;
                } else {
                    // Se os valores não forem iguais, não há duplicata.
                    // Avance o ponteiro 'current' para o próximo nó.
                    current = current.next;
                }
            }

            // Retorne a cabeça da lista. A cabeça não muda, a menos que a lista esteja vazia.
            return head;
        }
    }

}
