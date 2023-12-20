package Mirea.Homework2324;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws OrderAlreadyProcessedException {
    ArrayList<String> dish = new ArrayList<>();
    dish.add("Пицаа: Маргаритта: 450");
    dish.add("Торт: Сказка: 580");
    ArrayList<String> drink = new ArrayList<>();
    drink.add("Вода: Байкал, Шишкин лес: 90");
    drink.add("Сок: Вишня, Яблоко: 100");
    System.out.println("Меню: ");
    for (String s : dish)
      System.out.println(s);
    for (String s : drink)
      System.out.println(s);

    RestaurantOrder restaurantOrder = new RestaurantOrder();
    restaurantOrder.addPosition(new Dish("Пицца", "Маргаритта", 450));
    restaurantOrder.addPosition(new Drink("Сок", "Вишня", 100));
    System.out.println("\npositions in the order: " + restaurantOrder.count());
    System.out.println(Arrays.toString(restaurantOrder.getDishes()));

    RestaurantOrder restaurantOrder1 = new RestaurantOrder();
    restaurantOrder1.addPosition(new Dish("Торт", "Сказка", 580));
    restaurantOrder1.addPosition(new Drink("Вода", "Байкал, Шишкин лес", 90));
    System.out.println("Positions in the order: " + restaurantOrder1.count());
    System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

    System.out.println("\n" + "Заказ в ресторане: ");
    OrderManager orderManager = new OrderManager();
    orderManager.add(restaurantOrder, 1);
    orderManager.add(restaurantOrder1, 2);
    System.out.println(orderManager.orders());

    InternetOrder internetOrder = new InternetOrder();
    internetOrder.addPosition(new Dish("Торт", "Сказка", 580));
    internetOrder.addPosition(new Drink("Вода", "Байкал, Шишкин лес", 90));

    System.out.println("Интернет заказ: ");

    // Создание экземпляра класса ImmutablePerson
    ImmutablePerson person = new ImmutablePerson("Вася", "Алексеев", "Москва, Проспект Вернадского 78", "+70001234567", true);

    // Создание экземпляра класса ImmutableAddress
    ImmutableAddress address = new ImmutableAddress("Москва", "Проспект Вернадского", "78", "1", "52");

    // Теперь вы можете использовать эти объекты в своем коде
    System.out.println("Имя: " + person.getName());
    System.out.println("Фамилия: " + person.getSurname());
    System.out.println("Адрес: " + person.getAddress());

    System.out.println("Город: " + address.getCity());
    System.out.println("Улица: " + address.getStreet());
    System.out.println("Дом: " + address.getHouse());
    System.out.println("Подъезд: " + address.getEntrance());
    System.out.println("Квартира: " + address.getApartment());
  }
}