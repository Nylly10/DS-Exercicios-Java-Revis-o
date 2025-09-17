public class ExercicioSwitchAninhado {
    public static void main(String[] args) {
        int categoria = 1;
        int opcao= 2;
        switch (categoria) {
            case 1 ->{
                System.out.println("Categoria: Esporte");
                switch (opcao){
                    case 1-> System.out.println("Basquete");
                    case 2 -> System.out.println("Futebol");
                }
            }
            case 2 -> {
                System.out.println("Categoria: dança");
                switch (opcao) {
                    case 1 -> System.out.println("Salao");
                    case 2 -> System.out.println("funk");
                }
            }
        }
    }
}