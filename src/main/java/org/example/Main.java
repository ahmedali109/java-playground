package org.example;

import SOLID.*;
import java.util.*;

public class Main {
    //region Methods
//    static int Square(int x){
//        return x*x;
//    }
//
//    static int Cube(int x){
//        return x*x*x;
//    }
//
//    static int Factorial(int x){
//        if(x == 1 || x == 0) return 1;
//        return x * Factorial(x - 1);
//    }
    //endregion

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
//        int i = 1;
//        while (i <= 10){
//            IO.println(i);
//            i++;
//        }
//        IO.println("------------------------");
//        int j = 10;
//        while (j >= 1){
//            IO.println(j);
//            j--;
//        }
//        IO.println("------------------------");
//        int k = 10;
//        while (true){
//            IO.println(k);
//            k--;
//            if(k == 0) break;
//        }
//        IO.println("------------------------");
        //endregion

        //region Methods
//        int number = Integer.parseInt(IO.readln("Enter number : "));
//        IO.println("number after square %s".formatted(Square(number)));
//        IO.println("number after cube %s".formatted(Cube(number)));
//        IO.println("factorial of the number %s".formatted(Factorial(number)));
        //endregion

        //region Array
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int size = arr.length;
//        for(int i = 0; i < size; i++){
//            IO.println("------------------------");
//            IO.println("%s after square = %s".formatted(arr[i] , Square(arr[i])));
//            IO.println("%s after cube = %s".formatted(arr[i] , Cube(arr[i])));
//            IO.println("%s after Factorial = %s".formatted(arr[i] , Factorial(arr[i])));
//            IO.println("------------------------");
//        }
        //endregion

        //region Collections

        //region ArrayList
//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("Ahmed");
//        arrayList.add("Aly");
//        arrayList.set(0 , "Mohamed");
//        IO.println(arrayList.get(0));
//        IO.println("------------------------");
//        for(String name : arrayList){
//            IO.println("%s".formatted(name));
//        }
//        IO.println("------------------------");
//        int size = arrayList.size();
//        IO.println(size);
//        IO.println("------------------------");
//        arrayList.remove("Mohamed");
//        arrayList.remove(0);
//        size = arrayList.size();
//        IO.println(size);
//        IO.println("------------------------");
//        IO.println(arrayList.contains("Mohamed"));
//        IO.println("------------------------");
//        arrayList.clear();
//        IO.println(arrayList.isEmpty());
//        IO.println("------------------------");
        //endregion

        //region LinkedList
//        List<String> names = new LinkedList<>();
//        names.add("Ali");
//        names.add("Ahmed");
//        names.add("Sara");
//        names.addFirst("Omar");
//        names.addLast("Mona");
//        for(String name : names){
//            IO.println("%s".formatted(name));
//        }
//        IO.println("------------------------");
//        names.removeFirst();
//        names.removeLast();
//        for(String name : names){
//            IO.println("%s".formatted(name));
//        }
//        IO.println("------------------------");
        //endregion

        //region Set
//        Set<Integer> numbers = new HashSet<Integer>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(10);
//        for(int num : numbers){
//            IO.println("%d".formatted(num));
//        }
//        IO.println("------------------------");
//        Iterator it = numbers.iterator();
//        while (it.hasNext()){
//            IO.println("%d".formatted(it.next()));
//        }
//        IO.println("------------------------");
//        Set<Integer> linkedNumbers = new LinkedHashSet<Integer>();
//        linkedNumbers.add(10);
//        linkedNumbers.add(20);
//        linkedNumbers.add(10);
//        for(int num : linkedNumbers){
//            IO.println("%d".formatted(num));
//        }
//        IO.println("------------------------");
//        Iterator it2 = linkedNumbers.iterator();
//        while (it2.hasNext()){
//            IO.println("%d".formatted(it2.next()));
//        }
//        IO.println("------------------------");
//
//        Set<Integer> tree = new TreeSet<Integer>();
//        tree.add(50);
//        tree.add(10);
//        tree.add(30);
//        tree.add(20);
//        for(int num : tree){
//            IO.println("%d".formatted(num));
//        }
//        IO.println("------------------------");
//        Iterator it3 = tree.iterator();
//        while (it3.hasNext()){
//            IO.println("%d".formatted(it3.next()));
//        }
//        IO.println("------------------------");
        //endregion

        //region Map
//        Map<Integer , String> students = new HashMap<>();
//        students.put(100 , "Ahmed");
//        students.put(101 , "Mohamed");
//        students.put(102 , "Hassan");
//        IO.println(students.containsKey(100));
//        IO.println(students.containsValue("Mohamed"));
//        IO.println("------------------------");
//        students.remove(102);
//        IO.println(students.keySet());
//        IO.println(students.values());
//        IO.println("------------------------");
//        for(Map.Entry<Integer , String> entry : students.entrySet()){
//            IO.println("%d -> %s".formatted(entry.getKey(),entry.getValue()));
//        }
//        IO.println("------------------------");
        //endregion

        //endregion

        //region OOP
//        Car c1 = new Car();
//        c1.start();
//        c1.stop();
//        IO.println("------------------------");
//        Dog d1 = new Dog();
//        d1.name = "Rock";
//        d1.eat();
//        IO.println("------------------------");
//        Rectangle r1 = new Rectangle();
//        r1.draw();
//        IO.println("------------------------");
//        Trinagle t1 = new Trinagle();
//        t1.draw();
//        IO.println("------------------------");
//        Calculator calc = new Calculator();
//        int result = calc.add(5 , 4);
//        int total = calc.add(5 , 4 , 3);
//        IO.println("%s %s".formatted(result  , total));
//        IO.println("------------------------");
//        Developer dev = new Developer();
//        dev.calculateSalary();
//        IO.println("------------------------");
//        Manager m1 = new Manager();
//        m1.calculateSalary();
//        IO.println("------------------------");
//        VodafoneCash vc = new VodafoneCash();
//        vc.pay();
//        IO.println("------------------------");
//        Visa visa = new Visa();
//        visa.pay();
//        IO.println("------------------------");
        //endregion

        //region SOLID

        //region SRP
        IO.println("------------------------");
        new SingleResponsibilityPrinciple();
        IO.println("------------------------");
        //endregion

        //region OCP
        IO.println("------------------------");
        new OpenClosedPrinciple();
        IO.println("------------------------");
        //endregion

        //region LSP
        IO.println("------------------------");
        new LiskovSubstitutionPrinciple();
        IO.println("------------------------");
        //endregion

        //region ISP
        IO.println("------------------------");
        new InterfaceSegregationPrinciple();
        IO.println("------------------------");
        //endregion

        //region DIP
        IO.println("------------------------");
        new DependencyInversionPrinciple();
        IO.println("------------------------");
        //endregion

        //endregion
    }
}
