package nl.novi.jp.methods.junior;


/**
 * Deze klasse bevat al de methode met de naam doubleIt. Deze methode ontvangt een integer, verdubbelt deze en print
 * deze vervolgens uit.
 *
 * Maak deze klasse af door de methode squareTheNumber af te maken. Deze methode ontvangt een integer en moet deze
 * kwadrateren en uitprinten.
 */
public class JuniorTwo {

    public static void main(String[] args) { // main methode
        doubleIt(33); // een methode wordt hier aangeroepen
        squareTheNumber(33); // een methode wordt hier aangeroepen
    }
// Note to self: in principe is zijn de onderstaande methodes zo geschreven dat ze een input nodig hebben om output te geven,
// In de main methode wordt er een input meegegeven aan de methodes, zie op hun beurt daar dan iets mee uitvoeren.


    public static void doubleIt(int number) { // methode
        int doubledNumber = number + number;
        System.out.println("Het getal " + number + " is verdubbeld: " + doubledNumber);
    }

    public static void squareTheNumber(int number) { // methode
        int squaredNumber = number * number;
        System.out.println("Het getal " + number + " is gekwadrateerd: " + squaredNumber);
    }
}
