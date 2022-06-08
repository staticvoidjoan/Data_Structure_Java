import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> PlacesToVisit = new LinkedList<>();
        addInOrder("Elbasan", PlacesToVisit);
        addInOrder("Tirane", PlacesToVisit);
        addInOrder("Durres", PlacesToVisit);
        addInOrder("Kruje", PlacesToVisit);
        addInOrder("Alabama", PlacesToVisit);
        visit(PlacesToVisit);

    }

    private static void printlist(LinkedList<String> placestovisit) {
        Iterator<String> i = placestovisit.iterator();
        while (i.hasNext()) {
            System.out.println(". We are visiting " + i.next());
        }
        System.out.println("==============================");


    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedlist) {
        ListIterator<String> stringListIterator = linkedlist.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //0 means they are similar;
                System.out.println(newCity + " Is already a destination");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;

    }

    public static void visit(LinkedList cities) {
        Scanner console = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listiterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities");
            return;
        } else {
            System.out.println("Now visiting " + listiterator.next());
            printMenu();

        }

        while (!quit) {
            int action = console.nextInt();
            console.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listiterator.hasNext()){
                            listiterator.next();
                            goingForward = true;
                        }
                    }
                    if (listiterator.hasNext()) {
                        System.out.print("Now visiting =>" + listiterator.next() + " ");
                    } else{ System.out.println("Reached the end of the list");
                    goingForward = false;}
                    break;
                case 2:
                    if (goingForward){
                        if (listiterator.hasPrevious()){
                            listiterator.previous();
                            goingForward = false;
                        }
                    }
                    if (listiterator.hasPrevious()){
                        System.out.print("Now visiting =>" + listiterator.previous() + " ");
                    } else{ System.out.println("Currently haven't started visiting any cities");
                    goingForward = true;}
                    break;
                case 3:
                    printlist(cities);
                    break;
                case 4:
                    printMenu();
                    break;
            }


        }
    }


    private static void printMenu(){
        System.out.println("Avaliable actions:\n" +
                "0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - see the list of cities\n" +
                "4 - see avaliable actions again");
    }


}
