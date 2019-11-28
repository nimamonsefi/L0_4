/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String answer;
        
        while(true){
            System.out.print("Do You Answer Me ?(Y or N) : ");
            answer=scanner.next();
            
            if(answer.equalsIgnoreCase("n")){
                continue;
            }
            
            System.out.print("\nWhats Your Name : ");
            answer=scanner.next();
            System.out.println("Your Name Is : "+answer);
            System.out.print("\nNext Person ?(Y or N) : ");
            answer=scanner.next();
            
            if(answer.equalsIgnoreCase("n")) {
                break;
            }
        }    
    }
    
}
