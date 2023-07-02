import java.util.Scanner;
public class ATM_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String person1="Vamika Virat";
        int p1_key=2000;
        String person2="Darwin Varma";
        int p2_key=2510;
        String person3="Klin Kara";
        int p3_key=1513;
        int balance_p1=55000;
        int balance_p2=77000;
        int balance_p3=150000;
        int pin;
        while(true){
            System.out.println("Hello User, Welcome to ATM Machine ");
            System.out.println("please select your name from below to continue: ");
            System.out.println("1) Vamika Virat");
            System.out.println("2) Darwin Varma");
            System.out.println("3) Klin Kara");
            int select_name=sc.nextInt();
            switch(select_name){
                case 1:
                    System.out.println("Hello Vamika Virat");
                    System.out.println("please enter your PIN to continue: ");
                    pin=sc.nextInt();
                    if(pin==p1_key){
                        System.out.println("Do you want to withdraw or deposit cash: ");
                        System.out.println("1) Withdraw");
                        System.out.println("2) Deposit");
                        System.out.println("3) Balance Enquiry");
                        int key_to_enter=sc.nextInt();
                        switch(key_to_enter){
                            case 1:
                                System.out.println("Enter amount to withdraw: ");
                                int withdraw=sc.nextInt();
                                if(withdraw<balance_p1){
                                    balance_p1-=withdraw;
                                    System.out.println("Please collect your money and take your card ");
                                }
                                else{
                                    System.out.println("Sorry Vamika, Insufficient Balance");
                                }
                                break;
                            case 2:
                                System.out.println("please enter amount to deposit: ");
                                int deposit=sc.nextInt();
                                balance_p1+=deposit;
                                System.out.println("Your amount deposited successfully ");
                                break;
                            case 3:
                                System.out.println("Your account balance is: "+balance_p1);
                                break;
                        }
                    }
                    else{
                        System.out.println("Sorry you have entered incorrect pin, Try again");
                    }
                    break;
                case 2:
                    System.out.println("Hello Darwin Varma");
                    System.out.println("please enter your PIN to continue: ");
                    pin=sc.nextInt();
                    if(pin==p2_key){
                        System.out.println("Do you want to withdraw or deposit cash: ");
                        System.out.println("1) Withdraw");
                        System.out.println("2) Deposit");
                        System.out.println("3) Balance Enquiry");
                        int key_to_enter=sc.nextInt();
                        switch(key_to_enter){
                            case 1:
                                System.out.println("Enter amount to withdraw: ");
                                int withdraw=sc.nextInt();
                                if(withdraw<balance_p2){
                                    balance_p2-=withdraw;
                                    System.out.println("Please collect your money and take your card ");
                                }
                                else{
                                    System.out.println("Sorry Darwin, Insufficient Balance");
                                }
                                break;
                            case 2:
                                System.out.println("please enter amount to deposit: ");
                                int deposit=sc.nextInt();
                                balance_p2+=deposit;
                                System.out.println("Your amount deposited successfully ");
                                break;
                            case 3:
                                System.out.println("Your account balance is: "+balance_p2);
                                break;
                        }
                    }
                    else{
                        System.out.println("Sorry you have entered incorrect pin, Try again");
                    }
                    break;
                case 3:
                    System.out.println("Hello Klin Kara");
                    System.out.println("please enter your PIN to continue: ");
                    pin=sc.nextInt();
                    if(pin==p3_key){
                        System.out.println("Do you want to withdraw or deposit cash: ");
                        System.out.println("1) Withdraw");
                        System.out.println("2) Deposit");
                        System.out.println("3) Balance Enquiry");
                        int key_to_enter=sc.nextInt();
                        switch(key_to_enter){
                            case 1:
                                System.out.println("Enter amount to withdraw: ");
                                int withdraw=sc.nextInt();
                                if(withdraw<balance_p3){
                                    balance_p3-=withdraw;
                                    System.out.println("Please collect your money and take your card ");
                                }
                                else{
                                    System.out.println("Sorry Klin Kara, Insufficient Balance");
                                }
                                break;
                            case 2:
                                System.out.println("please enter amount to deposit: ");
                                int deposit=sc.nextInt();
                                balance_p3+=deposit;
                                System.out.println("Your amount deposited successfully ");
                                break;
                            case 3:
                                System.out.println("Your account balance is: "+balance_p3);
                                break;
                        }
                    }
                    else{
                        System.out.println("Sorry you have entered incorrect pin, Try again");
                    }
                    break;
            }
            System.out.println("");
        }
    }

}
