package Pacote1;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    static ArrayList<Dish> availableDishes = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        loadMenuItems();

        int option = 0;

        while(true) {
            System.out.println("----- BEM VINDO AO RESTAURANTE BIROSCA -----\n");
            System.out.println("1. Fazer pedido.");
            System.out.println("2. Sair.\n");
            System.out.print("Digite a opção: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    System.out.println("\nAGRADECEMOS A PREFERENCIA! VOLTE SEMPRE!");
                    return;
            }
        }
    }


    public static void loadMenuItems() {
        Pizza p1 = new Pizza("Pizza 4 Queijos", "01/01/2023", 30f, 0.5f, "Massa Pan", "4 Queijos", "Recheada");
        availableDishes.add(p1);
        Pizza p2 = new Pizza("Pizza Portuguesa", "01/01/2023", 28f, 0.5f, "Convencional", "Portuguesa", "Normal");
        availableDishes.add(p2);
        Snack s1 = new Snack("Coxinha", "01/01/2023", 5f, 0.3f, "Massa de Batata", "Frango com Catupiri");
        availableDishes.add(s1);
        Snack s2 = new Snack("Hamburgão", "01/01/2023", 5f, 0.3f, "Massa de pão", "Hamburguer com Catupiri");
        availableDishes.add(s2);
        Sandwich sd1 = new Sandwich("X-Salada", "01/01/2023", 18.9f, 0.55f, "Francês", "Hamburguer e salada", "Maionese");
        availableDishes.add(sd1);
        Sandwich sd2 = new Sandwich("X-Bacon", "01/01/2023", 19.9f, 0.55f, "Francês", "Hamburguer, Bacon e salada", "Maionese");
        availableDishes.add(sd2);
    }

    public static void createOrder() {
        Order order = new Order();
        System.out.print("Nome do cliente: ");
        String name = input.nextLine();
        order.setClientName(name);

        int option = -1;
        while(true) {
            System.out.println("\n----------------- CARDÁPIO -----------------");
            for (int i = 0; i < availableDishes.size(); i++) {
                System.out.println((i + 1) + ". " + availableDishes.get(i).getName());
            }
            System.out.print("\nDigite o número do item para adicionar ou 0 para finalizar o pedido: ");
            option = input.nextInt();

            if(option == 0) {
                System.out.println("Pedido finalizado com sucesso!\n");
                break;
            }
            System.out.println("Item adicionado com sucesso!");
            order.addItem(availableDishes.get(option - 1));
        }

        order.printInvoice();
    }

}
