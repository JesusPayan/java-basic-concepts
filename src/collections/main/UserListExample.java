package collections.main;

import collections.List.utilities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserListExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int num_users;
        while(flag){
            System.out.println("Por favor indique la cantidad de los usuarios a rellenar en tu array");
            num_users = scanner.nextInt();
            for (int i = 0; i<num_users; i++){
                System.out.println("Cual es el username del usuario ["+(i+1)+"]");
                user.setUsername(scanner.next());
                System.out.println("Cual es el password del usuario ["+(i+1)+"]");
                user.setPassword(scanner.next());
                users.add(user);
                user = new User();
            }

            System.out.println("Mostrando lista");
            for (int i = 0; i<num_users; i++){
                System.out.println(users.get(i).getUsername());
            }
            System.out.println("---------------");

            System.out.println("Indique el username a buscar");
            user.setUsername(scanner.next());
            System.out.println("Indique el password a buscar");
            user.setPassword(scanner.next());


            if(users.contains(user)){
                System.out.println("Se ha encontrado");
            }else{
                System.out.println("No se ha encontrado");
            }

            System.out.println("Desea seguir trabajando? (S) o (N)");
            String seguir = scanner.next();
            seguir = seguir.toUpperCase();

            if (!seguir.equals("S")){
                System.out.println("Ok");
                flag = false;
            }

        }
    }
}
