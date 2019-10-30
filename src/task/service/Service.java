package task.service;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Integer> findMinimalPowToN(int userNumber) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (double number = 0; Math.pow(number, 2) < userNumber; number++) {
            numbers.add((int) number);
        }
        return numbers;
    }

}
