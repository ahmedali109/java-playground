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
        boolean isLoggedIn = true;
        String name = IO.readln("Enter your name: ");
        IO.println(
                """
                %s%s
                """.formatted(isLoggedIn ? "Welcome Back , " : "Please Login first , " , name)
        );
        //endregion
    }
}
