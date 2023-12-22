import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Superheroe[] heroes = new Superheroe[5];
        String lista = "";
        int contadorheroe = 0;
        int descansar;
        int valor;
        int eleccion;
        int elegir;
        int borrar;

        // Comenzamos el programa/juego con una bienvenida 
        // Le damos al usuario a elegir entre estas 8 opciones
        // Todo este programa esta dentro de un bucle "do while"
        // Para que cuando el usuario decida dejar de jugar, al apretar el 0
        // Automaticamente el programa deja de ejecutarse y se despida de el
        System.out.println("--- BIENVENIDO AL JUEGO DE SUPERHEROES ---");
        
        do {
        System.out.println("1. Crear superhéroe");
        System.out.println("2. Agregar poder");
        System.out.println("3. Eliminar poder");
        System.out.println("4. Consultar lista de poderes");
        System.out.println("5. Consultar poder");
        System.out.println("6. Usar poder");
        System.out.println("7. Descansar");
        System.out.println("0. Salir del programa");
        eleccion = sc.nextInt();
        System.out.println("--------------------------------------------------------");
        // Realizamos un switch para cada opción que dese el usuario
        switch (eleccion) {

            // Para el primer caso colocamos un "if" por si se supera el limite de superheroes
            // Le preguntamos al usuario que nombre quiere ponerle a su superheroe
            // Y termina volviendo al menú
            case 1:
            int j = 0;
            if (contadorheroe > 4) System.out.println("Has alcanzado el máximo de superheroes creados");
            else {
                System.out.println("--- Creación de superheroe ---");
                System.out.println("Ponle un nombre a tu Superheroe:");
                heroes[contadorheroe] = new Superheroe(sc.next());
                System.out.println("Heroe creado correcramente... " + heroes[contadorheroe].getNombre());
                contadorheroe++;
                System.out.println("Volviendo al menú...");
                lista = "";
                do {
                if (heroes[j] != null) lista += " " + j + ". " + heroes[j].getNombre(); 
                    j++;
                } while (j < 4);
            }     
            System.out.println("--------------------------------------------------------");
            break;

            // Para el caso 2 le pedimos al usuario que elija el superheroe
            // Después de que el usuario elija el superheroe creado, le pedimos que agregue el superpoder que desee
            case 2:
                System.out.println("¿A que superheroe quieres agregarle un superpoder?");
                System.out.println(lista);
                int eleccionheroe = sc.nextInt();
                System.out.println("¿Que superpoder vas a agregar?");
                System.out.println("1. Vuelo");
                System.out.println("2. Fuerza");
                System.out.println("3. Magia");
                System.out.println("4. Telequinesis");
                System.out.println("0. Atrás");
                elegir = sc.nextInt();

                heroes[eleccionheroe].agregarPoder(elegir);

                switch (elegir) {
                    case 1:
                        System.out.println("Has agregado el superpoder de Vuelo");
                        break;
                    case 2:
                        System.out.println("Has agregado el superpoder de Fuerza");
                        break;
                    case 3:
                        System.out.println("Has agregado el superpoder de Magia");
                        break;
                    case 4:
                        System.out.println("Has agregado el superpoder de Telequinesis");
                        break;
                }
                System.out.println("--------------------------------------------------------");
                break;

                // Para el caso 3 le pedimos al usuario que elija el superheroe
                // Después de que el usuario elija el superheroe creado, le pedimos que elimine un superpoder que el heroe tenga
            case 3:
                System.out.println("¿A que superheroe quieres eliminarle un poder?");
                System.out.println(lista);
                eleccionheroe = sc.nextInt();
                System.out.println("¿Que superpoder quieres eliminar?");
                System.out.println(heroes[eleccionheroe].getPoderes()); 
                System.out.println("0. Atrás");
                borrar = sc.nextInt();

                heroes[eleccionheroe].eliminarPoder(borrar);

                switch (borrar) {
                    case 1:
                        System.out.println("Has eliminado el poder de vuelo");
                        break;
                    case 2:
                        System.out.println("Has eliminado el poder de Fuerza");
                        break;
                    case 3:
                        System.out.println("Has eliminado el poder de Magia");
                        break;
                    case 4:
                        System.out.println("Has eliminado el poder de Telequinesis");
                        break;
                    default:
                        break;
                }
                System.out.println("--------------------------------------------------------");
                break;
            
            // Para el caso 4 le mostramos al usuario la lista de superpoderes que hay
            case 4:
                    System.out.println("Elige un Superheroe");
                    System.out.println(lista);
                    System.out.println("¿A que Superheroe quieres verle los poderes?");
                    eleccionheroe = sc.nextInt();
                    System.out.println(heroes[eleccionheroe].getPoderes()); 
                    System.out.println("--------------------------------------------------------");
                break;

            // Para el caso 5 le pedimos al usuario de que seperpoderes quiere saber información
            // Primero le pedimos al usuario que superheroe quiere elegir
            // Y después que poder quiere consultar
            // En el caso de que no haya creado ningun superheroe, le salta un mensaje de que necesita crear un superheroe
            case 5:
            if (heroes[0] == null) {
                System.out.println("Primero debes crear un superheroe.");
            }   else {
                    System.out.println("¿De que superheroe quieres saber sus poderes?");
                    System.out.println(lista);
                    eleccionheroe = sc.nextInt();
                    System.out.println("¿Que poder quieres consultar?");
                    System.out.println(heroes[eleccionheroe].getPoderes()); 
                    eleccion = sc.nextInt();
                    System.out.println(heroes[eleccionheroe].getPoder(eleccion));
                    System.out.println("--------------------------------------------------------");
                }   
                break;

            // En el caso 6 la maquina le pregunta al usuario que superheroe desea usar
            // Después le pregunta que superoder quiere usar
            case 6:
                System.out.println("¿Que superheroe deseas usar?");
                System.out.println(lista);
                eleccionheroe = sc.nextInt();
                System.out.println("¿Que superpoder deseas usar?");
                System.out.println(heroes[eleccionheroe].getPoderes());
                eleccionheroe = sc.nextInt();
                System.out.println("¿Por cuanto tiempo deseas usar el superpoder?");
                valor = sc.nextInt();
                heroes[eleccionheroe].usarPoder(eleccion, valor);
                System.out.println("--------------------------------------------------------");
                break;
            
            // En el caso 7 el programa le pregunta al usuario que superheroe elige para que descanse
            case 7:
                System.out.println("¿Que superheroe deseas elegir?");
                System.out.println(lista);
                eleccionheroe = sc.nextInt();
                System.out.println("Por cuanto tiempo quieres descansar?");
                descansar = sc.nextInt();
                heroes[eleccionheroe].descansar(descansar);
                System.out.println("El Superheroe se ha regenerado entero");
                System.out.println("--------------------------------------------------------");
                break;
            
            // En el caso 0 el programa se despide del usuario
            case 0:
                System.out.println("Hasta la próxima");
                break;
            default:
                break;    
            }
        } while (eleccion != 0);
    } 
}