import java.util.Scanner;
import java.security.SecureRandom;

public class CAI {

    private static double wrong;
    private static double right;
    private static double percent;

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for: single-digit problems");
        System.out.println("Press 2 for: two-digit problems");
        System.out.println("Press 3 for: three-digit problems");
        System.out.println("Press 4 for: four-digit problems");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if (user == 1){
            questionOne();
        }

        if(user == 2){
            questionTwo();
        }

        if(user == 3){
            questionThree();
        }

        if(user == 4){
            questionFour();
        }


        System.out.printf("\nRight: %.2f, Wrong: %.2f\n", right, wrong);
        percent = (right / 10) * 100;
        System.out.print("You scored a %");
        System.out.printf("%.2f\n", percent);
        System.out.println("");

        if(percent > 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println("Would you like to play again?");
        }

        else if(percent < 75){
            System.out.println("Please ask your teacher for extra help\n");

            for (int i = 0; i < 10; i++){
                questionOne();
            }

            System.out.printf("Right: %.2f, Wrong: %.2f\n", right, wrong);
            percent = (right / 10) * 100;
            System.out.print("You scored a %");
            System.out.printf("%.2f", percent);
        }
    }


    public static void questionOne ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for: addition");
        System.out.println("Press 2 for: multiplication");
        System.out.println("Press 3 for: subtraction");
        System.out.println("Press 4 for: division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10);
                int rand2 = rand.nextInt(10);

                System.out.printf("%d + %d?\n", rand1, rand2);

                int math = rand1 + rand2;
                int input = 0;

                input = scnr.nextInt();

                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10);
                int rand2 = rand.nextInt(10);

                System.out.printf("%d x %d?\n", rand1, rand2);

                int math = rand1 * rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10);
                int rand2 = rand.nextInt(10);

                System.out.printf("%d - %d?\n", rand1, rand2);

                int math = rand1 - rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10);
                int rand2 = rand.nextInt(10);

                System.out.printf("%d / %d?\n", rand1, rand2);

                int math = rand1 / rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }

    public static void questionTwo ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for: addition");
        System.out.println("Press 2 for: multiplication");
        System.out.println("Press 3 for: subtraction");
        System.out.println("Press 4 for: division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(100);
                int rand2 = rand.nextInt(100);

                System.out.printf("%d + %d?\n", rand1, rand2);

                int math = rand1 + rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(100);
                int rand2 = rand.nextInt(100);

                System.out.printf("%d x %d?\n", rand1, rand2);

                int math = rand1 * rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }

                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(100);
                int rand2 = rand.nextInt(100);

                System.out.printf("%d - %d?\n", rand1, rand2);

                int math = rand1 - rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(100);
                int rand2 = rand.nextInt(100);

                System.out.printf("%d / %d?\n", rand1, rand2);

                int math = rand1 / rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }


    public static void questionThree ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for: addition");
        System.out.println("Press 2 for: multiplication");
        System.out.println("Press 3 for: subtraction");
        System.out.println("Press 4 for: division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(1000);
                int rand2 = rand.nextInt(1000);

                System.out.printf("%d + %d?\n", rand1, rand2);

                int math = rand1 + rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(1000);
                int rand2 = rand.nextInt(1000);

                System.out.printf("%d x %d?\n", rand1, rand2);

                int math = rand1 * rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(1000);
                int rand2 = rand.nextInt(1000);

                System.out.printf("%d - %d?\n", rand1, rand2);

                int math = rand1 - rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(1000);
                int rand2 = rand.nextInt(1000);

                System.out.printf("%d / %d?\n", rand1, rand2);

                int math = rand1 / rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }

    public static void questionFour ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for: addition");
        System.out.println("Press 2 for: multiplication");
        System.out.println("Press 3 for: subtraction");
        System.out.println("Press 4 for: division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1){
            for (int i = 0; i < 10; i++) {
                int rand1 = rand.nextInt(10000);
                int rand2 = rand.nextInt(10000);

                System.out.printf("%d + %d?\n", rand1, rand2);

                int math = rand1 + rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10000);
                int rand2 = rand.nextInt(10000);

                System.out.printf("%d x %d?\n", rand1, rand2);

                int math = rand1 * rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10000);
                int rand2 = rand.nextInt(10000);

                System.out.printf("%d - %d?\n", rand1, rand2);

                int math = rand1 - rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4){
            for (int i = 0; i < 10; i++){
                int rand1 = rand.nextInt(10000);
                int rand2 = rand.nextInt(10000);

                System.out.printf("%d / %d?\n", rand1, rand2);

                int math = rand1 / rand2;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math){
                    CAI.right++;
                    int rand3 = rand.nextInt(4);
                    int positive = rand3;
                    String positiveResponse;

                    switch (positive){
                        case 1:
                            positiveResponse = "Great job!";
                            break;
                        case 2:
                            positiveResponse = "Wow!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Good job!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }

                else{
                    int rand4 = rand.nextInt(4);
                    int negative = rand4;
                    String negativeResponse;
                    CAI.wrong++;

                    switch (negative){
                        case 1:
                            negativeResponse = "Incorrect.";
                            break;
                        case 2:
                            negativeResponse = "Can do better.";
                            break;
                        case 3:
                            negativeResponse = "Nope.";
                            break;
                        default:
                            negativeResponse = "Try again.";
                            break;
                    }
                    System.out.println(negativeResponse);

                }
            }
        }
    }

}
