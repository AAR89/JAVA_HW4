import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println("* Реализовать консольное приложение, которое:\n" +
                "     * 1. Принимает от пользователя строку вида text~num\n" +
                "     * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.\n" +
                "     * 2. Если введено print~num, выводит строку из позиции num в связном списке.\n" +
                "     * 3. Если введено exit, завершаем программу\n" +
                "     * Пример:\n" +
                "     * string~4\n" +
                "     * num~3\n" +
                "     * print~3\n" +
                "     * num");
        ArrayList<String> list = new ArrayList<>();
        menu(list);
//        System.out.println(list);

    }

    public static void menu(List<String> source) {
        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text in format 'text~num': ");
        while (true) {
            String s = sc.nextLine();
            try {
                String[] split = s.split("~");
                Integer.parseInt(split[1]);
                System.out.println(Arrays.toString(split));
                stringList.add(split[0]);
                stringList.add(split[1]);
                System.out.println(stringList);
                menu(source);
            } catch (Exception e) {
                System.out.println("Wrong command");
                break;
            }
        }
    }
}








