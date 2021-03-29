package two;

import java.util.Scanner;

public class exceptiontypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Exception Types");
        System.out.println(
                "choose which Exception to see 1.ArithmeticException \n 2.ArrayIndexOutOfBoundsException \n 3.NullPointerException \n 4. NumberFormatException \n 5.Exit");
        boolean stop = true;
        for (int i = 0; stop; i++) {
            int exception = sc.nextInt();
            if (exception == 5) {
                stop = false;
            }
            try {

                switch (exception) {
                case 1:
                    int calc = 3 / 0;
                    System.out.println(calc);
                    break;
                case 2:
                    int[] p = new int[2];
                    for (int j = 0; j < p.length; j++) {
                        System.out.println(p[3]);
                    }
                    break;
                case 3:
                    String a1 = null; // null value
                    System.out.println(a1.charAt(6));
                    break;
                case 4:
                    int n = Integer.parseInt("Test");
                    System.out.println(n);
                    break;
                default:
                    System.out.println("No exception choosen please try again ");
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException Exception caught " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException Exception caught " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException Exception caught " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException Exception caught " + e.getMessage());
            }
            finally{
                System.out.println("This is Finally block \n It will always be executed \n can handel Exception using Exception e also");
            }
        }
        sc.close();
    }
}