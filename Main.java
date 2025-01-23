import java.util.Scanner;




public class Main{
    private static Scanner sc = new Scanner(System.in); 
    private static int n;
    private static byte l;
    private static String userInput = "";

    


    public static void main(String[] args){
        Menu.welcome();
        userInput = sc.nextLine();
        while(!(userInput.equalsIgnoreCase("stop") || userInput.equalsIgnoreCase("no"))){    
            Menu.option1();
            l = sc.nextByte();
            sc.nextLine();
            Menu.option2();
            userInput = sc.nextLine();
            Menu.option3();
            n = sc.nextInt();
            sc.nextLine();
            System.out.println("\033c");
            Loading.processLoading();
            System.out.println("\033c");
            PasswordGenerator.generate(n, l, userInput);
        }
        sc.close();
    }
}