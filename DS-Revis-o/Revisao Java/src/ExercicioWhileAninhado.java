public class ExercicioWhileAninhado {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%d x %d = %d ", i,j, i * j );
                System.out.println(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

