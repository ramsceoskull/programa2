import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Pila stack = new Pila();
        Cola queue = new Cola();
        int option = 0;

        do {
            System.out.println("\nMENU PRINCIPAL:");    
            System.out.println("1. Pila.");    
            System.out.println("2. Cola.");    
            System.out.println("0. Salir.");    
            System.out.print("Escoge una opcion: ");
            option = Integer.parseInt(in.nextLine());
            switch (option) {
                case 1:
                    System.out.println("\nMENU PILA:");    
                    System.out.println("1. Insercion.");    
                    System.out.println("2. Eliminar.");    
                    System.out.println("3. Imprimir.");   
                    System.out.println("4. Regresar al menu principal.");
                    System.out.print("Escoge una opcion: ");
                    option = Integer.parseInt(in.nextLine());
                    switch (option) {
                        case 1:
                            System.out.print("\nIngrese un dato (numerico): ");
                            int data = Integer.parseInt(in.nextLine());
                            stack.push(data);
                            break;
                        case 2:
                            stack.pop();
                            break;
                        case 3:
                            stack.show();
                            break;
                        case 4:
                            System.out.println("\n\tATENCION: Regresando al menu principal...");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nMENU COLA:");    
                    System.out.println("1. Insercion.");    
                    System.out.println("2. Eliminar.");    
                    System.out.println("3. Imprimir.");   
                    System.out.println("4. Regresar al menu principal.");
                    System.out.print("Escoge una opcion: ");
                    option = Integer.parseInt(in.nextLine());
                    switch (option) {
                        case 1:
                            System.out.print("\nIngrese un dato (numerico): ");
                            int data = Integer.parseInt(in.nextLine());
                            queue.push(data);
                            break;
                        case 2:
                            queue.pop();
                            break;
                        case 3:
                            queue.show();
                            break;
                        case 4:
                            System.out.println("\n\tATENCION: Regresando al menu principal...");
                            break;
                        default:
                            break;
                    }
                    break;
                case 0:
                    System.out.println("\n\tAdios...");    
                    break;
                default:
                    System.out.println("\n\tERROR: Opcion invalida...");
                    break;
            }
        } while (option != 0);
        in.close();
    }
}
