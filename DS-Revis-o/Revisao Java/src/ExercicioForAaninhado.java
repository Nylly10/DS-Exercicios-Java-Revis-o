public class ExercicioForAaninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d + %d = %d ", i, j, i+j);
            }
            System.out.println();
        }
    }
}

