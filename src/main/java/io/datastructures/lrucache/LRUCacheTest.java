package io.datastructures.lrucache;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class LRUCacheTest {

    public static void main(String[] args) throws IOException {

        LRUCache<Integer> cache = new LRUCache<>(3);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choice = 1;

        while (choice != 0) {
            System.out.println("1: Put\n2: Get\n0: Exit");
            choice =  Integer.parseInt(bufferedReader.readLine());
            String key;
            int value;
            switch (choice) {
                case 1:
                    System.out.println("Enter key");
                    key = bufferedReader.readLine();
                    System.out.println("Enter value");
                    value = Integer.parseInt(bufferedReader.readLine());
                    cache.put(key, value);
                    System.out.println("Inserted\n");
                    break;

                case 2:
                    System.out.println("Enter key");
                    key = bufferedReader.readLine();
                    System.out.println("Value is: " + cache.get(key).toString() + "\n");
                    break;

                default:
                    System.out.println("Adios amigo!\n");
            }
        }
    }
}
