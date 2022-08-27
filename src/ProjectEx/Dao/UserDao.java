package ProjectEx.Dao;

import ProjectEx.Model.User;

import java.util.ArrayList;

public class UserDao  {

    private ArrayList<User> users = new ArrayList<>();


    public UserDao() {

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
