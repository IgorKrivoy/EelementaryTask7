package task.util;

import java.util.Scanner;

public class Input {
    Scanner scanner;

    public String getString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int getInt() throws Exception{
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
