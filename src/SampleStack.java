import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack <String> students = new Stack<String>();
        students.push("Arwa");
        students.push("Maryam");
        students.push("Yusuf");
        students.push("Joseph");
        students.push("Neva");

        System.out.print(students.pop()); //get the data from the top and remove it
        System.out.print(students.size()); //Length of array list
        System.out.print(students.peek()); //Check the last data

        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.remove(3); //remove joseph, and Neva will replace his index
        for (String name:students) { //foreach in JAVAs
            System.out.println(name);
        }

        students.set(2,"Dalia");
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }
    }
}

