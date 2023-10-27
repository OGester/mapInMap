package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserStorage userStorage = new UserStorage();
        userStorage.readUserFile();

        User user1 = new User("Test", "test", "1");
        userStorage.addUser(user1);
        userStorage.saveUserFile();

        Income income1 = new Income("1", 2000, "26/10", EIncomeCategory.SALARY);
        Income income2 = new Income("2", 1000, "26/10", EIncomeCategory.SALARY);
        user1.addIncome(income1);
        user1.addIncome(income2);
        userStorage.saveUserFile();
    }
}