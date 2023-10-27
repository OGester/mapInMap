package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class UserStorage {
    private Map<String, User> allUsers;
    //Sträng som representerar platsen/filen jag vill använda
    private String fileName = "src/main/Users.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void saveUserFile() throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(allUsers, fw);
        fw.close();
        System.out.println("--Changes has been saved--\n");
    }

    public void readUserFile() throws IOException {
        Type type = new TypeToken<Map<String, Income>>() {
        }.getType();
        Reader reader = new FileReader(new File(fileName));
        allUsers = gson.fromJson(reader, type);

        System.out.println("User list is retrieved.");

    }
    public void printIncomes() {
        System.out.println("These are all saved users" +
                ": ");
        allUsers.forEach((key, value) -> System.out.println("Key: " +key + " -> " + value));
    }

    public void addUser(User user) {
        allUsers.put(user.getId(), user);
    }

}