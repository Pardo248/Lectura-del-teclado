
//Castillo Pardo Diego
import java.util.Scanner ;

public class Main {
    //Las clases se nombran con UperCammelCase
    //Los metodos y variables , se nombran com LowerCammelCase
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            String operation ;//args[operationIndex];
            int parameter1 ;//Integer.parseInt(args[operationIndex + 1]);
            int parameter2 ;//Integer.parseInt(args[operationIndex + 2]);

            System.out.println("Captura operación:");
            operation = input.nextLine();

            System.out.println("Operando 1:");
            parameter1 = input.nextInt();

            System.out.println("Operando 2:");
            parameter2 = input.nextInt();

            int result;

            switch (operation) {
                case "SUMA":
                    result = parameter1 + parameter2;
                    System.out.println(parameter1 + "+" + parameter2 + "=" + result);
                    break;
                case "MULTIPLICACION":
                    result = parameter1 * parameter2;
                    System.out.println(parameter1 + "*" + parameter2 + "=" + result);
                    break;
                case "RESTA":
                    result = parameter1 - parameter2;
                    System.out.println(parameter1 + "-" + parameter2 + "=" + result);
                    break;
                case "DIVISION":
                    result = parameter1 / parameter2;
                    System.out.println(parameter1 + "/" + parameter2 + "=" + result);
                    break;
                default:
                    System.out.println("Operación no soportada");
            }

    }
}