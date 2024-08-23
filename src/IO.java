import java.util.Scanner;

public class IO {

    public static Scanner input(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int menu(){
        System.out.println("\n================================" +
                            "\nOPÇÕES:" +
                            "\n1 - Adicionar item" +
                            "\n2 - Listar itens" +
                            "\n3 - Buscar item por codigo" +
                            "\n4 - Sair" +
                            "\n================================");
        return input("").nextInt();
    }
}
