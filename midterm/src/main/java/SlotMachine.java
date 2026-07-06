import java.util.Random;
import java.util.Scanner;

//class holds all slot machine display/logic
public class SlotMachine {
    Scanner scanner = new Scanner(System.in);

    //wheel array to hold icons and use index for score calc
    static String[] wheel = {
        //notice: the -1 and +1 indexing is for an older display
        //in which I wanted the user to see how "close" they were
        //to winning by showing the current icon and the previous/future
        //this was padding in case display tried to index out of bounds
            "💰", //0 just for -1 indexing
            "🍒", //1
            "🍊", //2
            "🔔", //3
            "🍋", //4
            "🥭", //5
            "💰", //6
            "🍒"  //7 just for +1 indexing
        };
    
    //spin wheel returns random index of wheel array to be used
    public static int spinWheel(){
        Random random = new Random();
        return random.nextInt(1,7);
    }
        
    //play method prints out header and then displays game
    //method starts with wallet at 20 and ends when wallet reaches 0
    public void play(){
        System.out.println("\n-- Welcome To The Slot Machine! --");
        System.out.println("\n          $1 Per Play\n       You Begin With $20\n           Good Luck!");
        int wallet = 20;
        int prize = 0;
        int spins = 0;
        System.out.println("\nPress Enter to Spin...");
        scanner.nextLine();
        do{
        spins++;
        int wheel1 = spinWheel();
        int wheel2 = spinWheel();
        int wheel3 = spinWheel();
        prize = getPrize(wheel1, wheel2, wheel3);
        wallet = wallet + prize;
        wallet = wallet - 1;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("                 The Slot Machine");
        System.out.println("                   $1 Per Play\n");
        System.out.println("               ⠀⠀⠀⠀⢀⣤⣶⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              Prizes\n" + //
                        "               ⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀\n" + //
                        "               ⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀           💰💰💰 = $100\n" + //
                        "               ⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⣴⣶⣄⠀           🥭🥭🥭 = $50\n" + //
                        "               ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⣿⣿⣿⣿⡇           🍋🍋🍋 = $25\n" + //
                        "               ⢸⣿⣿⡏⠀⠀⣿⣿⠀⠀⠀⢸⣿⠀⠀⢹⣿⣿⡇⠀⠈⣿⣿⠋⠀           🔔🔔🔔 = $15\n" + //
                        "               ⢸⣿⣿⡇"+wheel[wheel1]+"⣿⣿ "+wheel[wheel2]+"⢸⣿"+wheel[wheel3]+"⢸⣿⣿⡇⠀⣀⣿⣿⠀⠀           🍊🍊🍊 = $10\n" + //
                        "               ⢸⣿⣿⣿⣦⣤⣿⣿⣦⣤⣤⣾⣿⣤⣴⣾⣿⣿⡇⠀⠿⠛⠁⠀⠀           🍒🍒🍒 = $5\n" + //
                        "               ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀           🍒🍒❓ = $2\n" + //
                        "               ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀           🍒❓❓ = $1\n" + //
                        "               ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" + //
                        "               ⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀         Spin Counter: " + spins +  
            "\n\n                    Prize: $" + prize);
        System.out.println("\n                   Wallet: $"+ wallet + " \n              Press Enter to Spin...\n\n\n\n\n\n\n\n");
        scanner.nextLine();
    }while(wallet > 0);
    System.out.println("\n\n               💸💸 Bankrupt! 💸💸\n");
    System.out.println("               You Survived " + spins + " spins!\n\n\n\n");
    }

    //method getPrize checks all 3 columns to score current spin
    //according to prize payout then returns prize 
    public static int getPrize(int col1, int col2, int col3){
        int prize = 0;
        if(col1 == 6 && col1 == col2 && col2 == col3){
            prize = 100;
        } else if(col1 == 5 && col1 == col2 && col2 == col3){
            prize = 50;
        } else if(col1 == 4 && col1 == col2 && col2 == col3){
            prize = 25;
        } else if(col1 == 3 && col1 == col2 && col2 == col3){
            prize = 15;
        } else if(col1 == 2 && col1 == col2 && col2 == col3){
            prize = 10;
        } else if(col1 == 1 && col1 == col2 && col2 == col3){
            prize = 5;
        } else if(col1 == 1 || col2 == 1 || col3 == 1){
            if(col1 == 1){
                prize += 1;
            }
            if(col2 == 1){
                prize += 1;
            }
            if(col3 == 1){
                prize +=1;
            }
        }
            return prize;
    }
}
