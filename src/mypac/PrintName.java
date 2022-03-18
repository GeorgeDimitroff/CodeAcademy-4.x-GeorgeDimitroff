package mypac;

/*
Напишете програма, която:
1. Извежда името ви в конзолата.
2. Сравнява го с име на приятел/ка, като използвате equals(),
equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
3. Долепя до името ви вашата фамилия, на нов ред.
4. Извежда вана нов ред.
5. Извежда името фамилията и годините ви на един ред.
6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.
 */

public class PrintName {
    public static void main(String[] args) {
        String myFirstName = "George";
        String myLastName = "Dimitrov";
        int myAge = 24;

        String friendFirstName = "Peter";
        String friendLastName = "Ivanov";
        int friendAge = 26;

        String myFullName = String.join(" ", myFirstName, myLastName);
        String friendFullName = String.join(" ", friendFirstName, friendLastName);

        // Извежда името ви в конзолата.
        System.out.println(myFirstName);

        // Сравнява го с име на приятел, като използвате equals(), equalsIgnoreCase(), compareTo().
        // Pезултатите да излизат на отделни редове.
        System.out.println("\n" + myFirstName.equals(friendFirstName));
        System.out.println(myFirstName.equalsIgnoreCase(friendFirstName));
        System.out.println(myFirstName.compareTo(friendFirstName));

        // Долепя до името ви вашата фамилия, на нов ред.
        System.out.println("\n" + myFullName);

        // Извежда вана нов ред. ???
        // Не ставя ясно, какво да изведа/принтирам на екрана.

        // Извежда името фамилията и годините ви на един ред.
        System.out.println("\n" + myFullName + " " + myAge);

        // Извежда името фамилията и годините на приятелят/ката ви на нов ред.
        System.out.println("\n" + friendFullName + " " + friendAge);
    }
}
