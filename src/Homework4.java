import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework4 {
//        "* Реализовать консольное приложение, которое:"
//                "     * 1. Принимает от пользователя строку вида text~num"
//                "     * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.\"
//                "     * 2. Если введено print~num, выводит строку из позиции num в связном списке."
//                "     * 3. Если введено exit, завершаем программу"
//                "     * Пример:"
//                "     * string~4"
//                "     * num~3"
//                "     * print~3"
//                "     * num");

    public static void main(String[] args) {
        ArrayList<String> resultList = new ArrayList<>();
        menu(resultList);
    }
    public static void menu(List<String> source) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Input text in format 'text~num'. \n" +
                "2.Input 'print~(num)' for output to console. \n" +
                "3.Input 'exit' to stop the program.");
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                String[] split = text.split("~");
                Integer.parseInt(split[1]);
                addArray(text, list);
            } catch (Exception e) {
                System.out.println("Wrong command");
            }
        }
    }
    public static void addArray(String text, ArrayList<String> list) {
        String[] subArray = text.split("~");
        int num = Integer.parseInt(subArray[1]);
        int localSize = num - list.size();
        for (int i = 0; i <= localSize; i++) {
            list.add(null);
        }
        if (subArray[0].equals("print")) {
            System.out.println(list.get(num));
        } else {
            list.set(num, subArray[0]);
        }
    }
}








