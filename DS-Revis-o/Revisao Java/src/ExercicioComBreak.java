public class ExercicioComBreak {
    public static void main(String[] args) {
        int[] numeros= { 1,2,3,4,5,6,7, 8, 9, 10};

        for(int n: numeros){
            if(n == 7){
                System.out.println("Chegamos ao número 7. FIM!");
                break;
            }
            System.out.println("Numero " + n);
        }
    }
}
