package Grades;

import java.util.Scanner;

public class input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return this.scan.next;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scan.next();
    }

}

