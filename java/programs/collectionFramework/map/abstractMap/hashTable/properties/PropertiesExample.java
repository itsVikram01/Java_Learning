package programs.collectionFramework.map.abstractMap.hashTable.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // Create a Properties object
        Properties properties = new Properties();

        // Set key-value pairs
        properties.setProperty("database", "mydb");
        properties.setProperty("username", "admin");
        properties.setProperty("password", "12345");

        // Save properties to a file
        try (FileOutputStream output = new FileOutputStream("config.properties")) {
            properties.store(output, "Database Configuration");
            System.out.println("Properties saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load properties from a file
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties loadedProperties = new Properties();
            loadedProperties.load(input);

            // Display loaded properties
            System.out.println("Loaded Properties:");
            loadedProperties.forEach((key, value) ->
                    System.out.println(key + " = " + value)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Access a specific property
        String database = properties.getProperty("database");
        System.out.println("Database: " + database);

        // Get a property with a default value
        String port = properties.getProperty("port", "3306");
        System.out.println("Port: " + port);
    }
}