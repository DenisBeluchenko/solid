import java.util.HashMap;
import java.util.Scanner;

public class Main {
    protected static int COUNT;

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
        COUNT = products.size();
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        products.forEach((key, value) -> System.out.println(key + " за " + value + " руб./шт."));
        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum(products);
        System.out.println("ИТОГО: " + sum);
    }
}

