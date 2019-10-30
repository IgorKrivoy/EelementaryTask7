package task.util;

import java.util.List;

public class OutPut {

    public void startInfo() {
        System.out.println("Введите число");
    }

    public void getContinueInfo() {
        System.out.println("Продолжаем? Yes or Y: ");
    }

    public void printException(Exception e){
        System.out.println(e.getMessage());
    }

    public void outNumbers(List<Integer> numbers) {
        System.out.println("Числа, квадрат которых меньше заданого n:");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
