public class Exercicio3 {
    public static void main(String[] args) {
        int[] idades = new int[] {10, 15, 20, 32};
        int [][] idadesCasal = new int[][] {{32,32},{22,20},{12,15},{59,60}};
        for (int idade: idades) {
            System.out.print(idade + " " );
        }
        System.out.println();
        System.out.println("Idades casal:");
        for (int []idadeCasal: idadesCasal) {
            for (int idadeCasal2: idadeCasal) {
                System.out.print(idadeCasal2 + " ");
            }
            System.out.println();
        }
    }
}
