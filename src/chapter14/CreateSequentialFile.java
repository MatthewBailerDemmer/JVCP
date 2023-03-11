package chapter14;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateSequentialFile {
    private static ObjectOutputStream output;

    public static void main(String[] args){
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile(){
        try{
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.ser")));
        }catch(IOException ioException){
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }

    public static void addRecords(){
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n?",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input");
        Boolean flagZ = true;

        while(flagZ){
            if(input.nextInt() == 1) //Only because InteliJ does not reconize end-of-file-indicator
                // the right input will be, as an example 0 100 Bob Blue 24,98
                break;
            try{
                Account record = new Account(input.nextInt(),
                        input.next(), input.next(), input.nextDouble());

                output.writeObject(record);
            }catch (NoSuchElementException elementException){
                System.err.println("Invalid input. Please try again. ");
                input.nextLine(); // descarta entrada para o usuário tentar de novo
            }catch (IOException ioException){
                System.err.println("Erro writing to file. Terminating");
                break;
            }
            System.out.print("?");
        }
    }

    public static void closeFile(){
        try{
            if(output != null)
                output.close();
        }catch(IOException ioException){
            System.err.println("Error closing file. Terminating");
        }
    }
}
