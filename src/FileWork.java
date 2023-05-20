import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) throws FileNotFoundException {
        /*--------------- Filedagi ma'lumotni o'qish ------------------ */
        File file = new File("test2.txt");  // Project ichidagi fayl bilan ishlash
        String separator = File.separator;
        String path = separator+"C:Users"+separator+"sssgl"+separator+ "OneDrive"+separator+"Рабочий стол"+separator+"text.txt";
//        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

//        for (String number: numbers) { // int tipiga aylantirish uchun
//            Integer.parseInt(number);
//        }
        System.out.println((Arrays.toString(numbers)));
        scanner.close();

        /*--------------------------- Filega ma'lumot yozish ---------------------------- */
        PrintWriter pw = new PrintWriter(file);

        pw.println("Text 1 ");
        pw.println("Text 2");
        pw.close();
    }

}
