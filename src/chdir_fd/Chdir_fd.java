package chdir_fd;

import java.util.Scanner;

public class Chdir_fd {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int cdup_cnt = 0;
        
        if (line.startsWith("cd ")) { 
            line = line.substring(3);
            String[] pathAr = line.split("/");
            for (int k = 0; k < pathAr.length; k++) {
                if (pathAr[k].equals("..")) {
                cdup_cnt++;
                }
            }
            for (int i = 0; i < (pathAr.length - (cdup_cnt * 2)); i++) {        
                System.out.print(pathAr[i] + "/");
            }
            System.out.println("");
        }
        else {
            System.out.println("I don't understand you. Please enter command..");
        }
    }    
}
