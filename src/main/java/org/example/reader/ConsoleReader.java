package org.example.reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    @Autowired
    private Scanner scanner;

    public String scannerString1() {

        return scanner.next();
    }

    public double scannerNum1() {
        System.out.println("Enter your num1: ");
        return scanner.nextDouble();
    }

    public double scannerNum2() {
        System.out.println("Enter your num2: ");
        return scanner.nextDouble();
    }

    public int scannerOperation1() {
        System.out.println("Enter operation number:\n  if you choose addition, enter - 1\n  if you choose subtraction, enter - 2 \n  if you choose multiplication, enter - 3 \n  if you choose division, enter - 4");
        return scanner.nextInt();
    }

    public int scannerOperation2() {
        System.out.println("Do you want to use the calculator again?\n if you choose YES, enter - 1 \n if you choose NO, enter - 2");
        return scanner.nextInt();
    }
}

