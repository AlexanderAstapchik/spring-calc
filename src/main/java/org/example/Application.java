package org.example;

import org.example.reader.ConsoleReader;
import org.example.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {
    @Autowired
    private ConsoleReader consoleReader;

    public Application(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }


    public void start() {
        boolean inWork = true;
        while (inWork) {
            double num1 = consoleReader.scannerNum1();
            double num2 = consoleReader.scannerNum2();
            int operation1 = consoleReader.scannerOperation1();
            switch (operation1) {
                case 1:
                    System.out.println("Result: " + CalcService.Addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + CalcService.Subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + CalcService.Multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + CalcService.Division(num1, num2));
                    break;
                default:
                    System.out.println("This number is invalid!");
            }
            int operation2 = consoleReader.scannerOperation2();
            switch (operation2) {
                case 1:
                    break;
                case 2:
                    System.out.println("Work is over");
                    inWork = false;
                    break;
                default:
                    System.out.println("This number is invalid!");
            }

        }

    }
}


