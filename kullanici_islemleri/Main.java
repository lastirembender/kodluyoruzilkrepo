import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "user",userpass="user1234";
        String enterusername,enteruserpass,controller;

        System.out.println("Enter the username : ");
        enterusername = input.next();

        System.out.println("Enter the user password :");
        enteruserpass = input.next();

        if(enterusername.equals(username)) {
            if (enteruserpass.equals(userpass)) {
                System.out.println("Succesfull!!");
            }
            else {
                System.out.println("Your password is wrong. Do you want to change? (1- Yes / 2 - No) : ");
                controller = input.next();

                if(controller.equals("1")){
                    System.out.println("Enter your new password :");
                    enteruserpass = input.next();
                    if (enteruserpass.equals(userpass)) {
                        System.out.println("New password can't be same with old password. :");
                    } else {
                        System.out.println("New password created.");
                    }
                }
                else
                {
                    System.out.println("You choose No.");
                }
            }
        
        else{
          System.out.println("Your password or username wrong.");
        }
  }
        
