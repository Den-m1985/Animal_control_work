package org.example.menu;

import java.util.Scanner;


public class TerminalReader {
    private static TerminalReader terminalReader;


    public static TerminalReader terminalReader() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }


    public void endLess() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(PrintMenu.STARTMENU);
                System.out.println(PrintMenu.QUITE);
                String str = scanner.nextLine();
                if (str.equals(PrintMenu.Q)) break;
                if (isInteger(str)) {
                    int addOrDelete = Integer.parseInt(str);
                    Execute execute = new Execute();
                    execute.execute(addOrDelete);
                } else System.out.println(PrintMenu.ERROR);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
