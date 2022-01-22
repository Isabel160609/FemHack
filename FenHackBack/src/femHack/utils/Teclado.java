package femHack.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.gson.Gson;

import femHack.Bullet.Bullet;

/*Class to handle keyboard input*/
public class Teclado {

    private static final Scanner read = new Scanner(System.in);

    /** 
     * This method is responsible for reading a keyboard String
     * @param message
     * @return String
     */
    public static String readString(String message) { 
        String chain = "";
        boolean right = false;

        do {
            System.out.print(message);
            try {
                chain = read.nextLine();
                right = true;
            } catch (Exception ex) {
                System.out.println("Error in the introduction of the string.");
            }
        } while (!right);
        return chain;
    }
    /** 
     * This method is responsible for reading a Json
     * @param message
     * @return String
     */
    public static Bullet readjson(String message) {
    	String chain = "";
    	Bullet bullet = new Bullet();
        boolean right = false;

        do {
            System.out.print(message);
            try {
            	chain = read.nextLine();
            	bullet = new Gson().fromJson(chain, Bullet.class);
            	bullet.setId(bullet.incrementId());
            	bullet.setH_max(bullet.calculateH_max());
        		bullet.setX_max(bullet.calculateX_max());
        		
                right = true;
            } catch (Exception ex) {
                System.out.println("Error in the introduction of the json.");
            }
        } while (!right);
        return bullet;
    }

     /** 
      * This method handles reading an integer from keyboard
      * @param message
      * @return int
      */
    public static int readInt(String message) {
        int number = 0;
        boolean right = false;

        do {
            System.out.print(message);
            try {
                number = read.nextInt();
                right = true;
            } catch (InputMismatchException ex) {
                System.out.println("Format error.");
            }
            read.nextLine();
        } while (!right);
        return number;
    }
    
    /** 
     * This method takes care of reading a keyboard integer that is between 0 and 360
     * @param message
     * @return int
     */
    public static int readAngle(String message) {
        int number = 0;
        boolean right = false;

        do {
            System.out.print(message);
            try {
                number = read.nextInt();
                if(number<=360 && number>=0) right = true;
                else System.out.println("The number must be between 0 and 360" );
            } catch (InputMismatchException ex) {
                System.out.println("Format error.");
            }
            read.nextLine();
        } while (!right);
        return number;
    }
    

    /** 
     * This method handles reading a keyboard boolean Y or N
     * @param message
     * @return boolean
     */
    public static boolean readyesNo(String message) {
        boolean retorno = false;
        boolean right = false;
        String chain = "";

        do {
            System.out.print(message);
            try {
                chain = read.nextLine().toUpperCase();
                right = true;
                if (chain.charAt(0) == 'Y') {
                    retorno = true;
                } else if (chain.charAt(0) == 'N') {
                    retorno = false;
                } else {
                    System.out.println("Invalid input.");
                    right = false;
                }
            } catch (Exception ex) {
                System.out.println("Error in the introduction of the string.");
            }
        } while (!right);
        return retorno;
    }
    /** 
     * This method handles reading a keyboard boolean J or M
     * @param message
     * @return boolean
     */
    public static boolean readJsonManual(String message) {
        boolean retorno = false;
        boolean right = false;
        String chain = "";

        do {
            System.out.print(message);
            try {
                chain = read.nextLine().toUpperCase();
                right = true;
                if (chain.charAt(0) == 'J') {
                    retorno = true;
                } else if (chain.charAt(0) == 'M') {
                    retorno = false;
                } else {
                    System.out.println("Invalid input.");
                    right = false;
                }
            } catch (Exception ex) {
                System.out.println("Error in the introduction of the string.");
            }
        } while (!right);
        return retorno;
    }
}
