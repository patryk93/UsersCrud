package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }

    }

}
