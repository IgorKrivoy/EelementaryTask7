package task.controller;

import task.service.Service;
import task.util.*;

public class Controller {

    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();
    Service service = new Service();

    public void run() {
        while (true) {
            outPut.startInfo();
            try {
                outPut.outNumbers(service.findMinimalPowToN(input.getInt()));
            } catch (Exception e) {
                outPut.printException(e);
            }
            outPut.getContinueInfo();
            if(!validator.requestContinue(input.getString())){
                break;
            }
        }
    }

}
