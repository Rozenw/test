package chdir_fd;

import java.util.Scanner;

public class Chdir_fd {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int cdup_cnt = 0;
        boolean except = false;
        
        if (line.startsWith("cd ")) { 
            line = line.substring(3);
            String[] pathAr = line.split("/");
            
            int exCount = 0;
            while (!pathAr[exCount].equals("..")) {
                exCount++;
            }
            for (int p = exCount; p < pathAr.length; p++) {
                if (!pathAr[p].equals("..")) {
                except = true;
                }
            }
            
            if (!except) {
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
                System.out.println("Sorry. I don't understand you.");
            }
        }
        else {
            System.out.println("I don't understand you. Please enter the command..");
        }
    }    
}
