package org.example;

public class Main {
    static void main() {
        //region Varibales and Data Types
        //        int age = 21;
        //        double salary = 2000.0;
        //        char grade = 'A';
        //        boolean graduated = true;
        //        String name = "Ahmed";
        //        IO.println("""
        //Hello, my name is %s and I am %d.
        //I am currently %s.
        //I got %s in my last exam.
        //I hope I get a salary of %.2f.
        //""".formatted(
        //                name,
        //                age,
        //                graduated ? "graduated" : "not graduated",
        //                grade,
        //                salary
        //        ));
        //endregion

        //region Input
//        boolean isLoggedIn = true;
//        String name = IO.readln("Enter your name: ");
//        IO.println(
//                """
//                %s%s
//                """.formatted(isLoggedIn ? "Welcome Back , " : "Please Login first , " , name)
//        );
        //endregion

        //region If Statement
//        int grade = Integer.parseInt(IO.readln("Enter your grade : "));
//        if(grade >= 85 && grade <= 100) {
//            IO.println("Excellant");
//        } else if(grade >= 75 && grade < 85){
//            IO.println("Very Good");
//        } else if(grade >= 60 && grade < 75){
//            IO.println("Good");
//        }
//        else if(grade >= 50 && grade < 60){
//            IO.println("Need to be Better... study more");
//        } else if(grade >= 0 && grade < 50){
//            IO.println("You are fail... study more");
//        } else {
//            IO.println("Invalid Degree");
//        }

        //endregion

        //region Switch
//       double n1 = Double.parseDouble(IO.readln("Enter First Number: "));
//       char operator = IO.readln("Enter operator (+ - * /): ").charAt(0);
//       double n2 = Double.parseDouble(IO.readln("Enter Second Number: "));
//        switch (operator){
//            case '+':
//               IO.println(n1 + n2);
//                break;
//            case '-':
//                IO.println(n1 - n2);
//                break;
//            case '*':
//                IO.println(n1 * n2);
//                break;
//            case '/':
//                if(n2 == 0){
//                    IO.println("Cannot Divide by 0");
//                    return;
//                }
//                IO.println(n1 / n2);
//                break;
//            default:
//                IO.println("Invalid Option");
//        }
        //endregion

        //region For loops
//        for(int i = 1; i <= 10; i++){
//            IO.println("i = %s".formatted(i));
//        }
//        IO.println("------------------------");
//        for(int i = 10; i > 0; i--){
//            IO.println("i = %s".formatted(i));
//        }
//        IO.println("------------------------");
//        int i = 1;
//        for(; i <= 10; i++){
//            IO.println("i = %s".formatted(i));
//        }
//        IO.println("------------------------");
//        int j = 10;
//        for(;; j--){
//           if(j == 0) break;
//           IO.println("j = %s".formatted(j));
//        }
//        IO.println("------------------------");

        //endregion

        //region While Loop
        int i = 1;
        while (i <= 10){
            IO.println(i);
            i++;
        }
        IO.println("------------------------");
        int j = 10;
        while (j >= 1){
            IO.println(j);
            j--;
        }
        IO.println("------------------------");
        int k = 10;
        while (true){
            IO.println(k);
            k--;
            if(k == 0) break;
        }
        IO.println("------------------------");
        //endregion
    }
}
