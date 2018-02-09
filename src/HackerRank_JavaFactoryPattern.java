import java.security.Permission;
import java.util.Scanner;

public class HackerRank_JavaFactoryPattern {

    interface Food {
        public String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {
            if(order.equals("pizza")) {
                return new Pizza();
            } else {
                return new Cake();
            }
        }
    }

    public static void main(String args[]){
        Do_Not_Terminate.forbidExit();

        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned "+food.getClass().getSimpleName());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
