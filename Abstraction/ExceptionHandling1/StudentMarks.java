package ExceptionHandling1;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter Marks " + j + ":");

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new NegativeMarksException("Negative Marks are not allowed");

                    if (mark > 100)
                        throw new OutOfRangeException("Marks should be between 0 and 100");

                    total += mark;
                }

                double avg = total / 3.0;

                System.out.println(name + " Average = " + avg);
            }

        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
        }

    }
}