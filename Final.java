package E_preprationSystem;
import java.util.Scanner;

public class Final {
   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
    
            while (!exit) {
                System.out.println("Welcome to the E-Preparation System");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                

                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (choice) {
                    case 1:
                        Register.registration();
                        break;

                        case 2:
                     if (L.loginUser()) {
                        System.out.println("1. Take a Quiz");
                        System.out.println("2. Admin Panel");
                        System.out.print("Choose an option: ");
                        int option = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        if (option == 1) {
                            System.out.print("Enter quiz ID: ");
                            int quizId = scanner.nextInt();
                            System.out.print("Enter your user ID: ");
                            int userId = scanner.nextInt();
                            QuizTaking.takeQuiz(quizId, userId);
                        } else if (option == 2) {
                            System.out.println("Admin Panel:");
                            System.out.println("1. Create Quiz");
                            System.out.println("2. Add Question to Quiz");
                            System.out.print("Choose an option: ");
                            int adminChoice = scanner.nextInt();
                            scanner.nextLine(); // consume newline

                            if (adminChoice == 1) {
                                Admin.createQuiz();
                            } else if (adminChoice == 2) {
                                System.out.print("Enter quiz ID to add a question to: ");
                                int quizId = scanner.nextInt();
                                Admin.addQuestion(quizId);
                            }
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
    }
            }}
