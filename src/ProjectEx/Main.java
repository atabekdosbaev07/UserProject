package ProjectEx;


import ProjectEx.Model.Gender.Gender;
import ProjectEx.Model.User;
import ProjectEx.Service.Impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {



        User user1 = new User(1, "Bek", 25, Gender.MAN);
        User user2 = new User(2, "John", 28, Gender.MAN);
        User user3 = new User(3, "Malik", 32, Gender.MAN);


            try {
           UserServiceImpl impl = new UserServiceImpl();
           impl.userKoshuu(user1);
           impl.userKoshuu(user2);
           impl.userKoshuu(user3);

             System.out.println(impl.idMenenTabuu(1)+"\n");
                impl.baarynAluu();

                impl.idMenenOchuruu(0);

                System.out.println();
                impl.baarynAluu();


                 }catch (RuntimeException e){
                System.out.println("Мундай id жок");
            }



















}

}
