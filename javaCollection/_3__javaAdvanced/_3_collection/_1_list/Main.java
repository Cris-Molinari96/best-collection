package _1_javaExerciseForGithub._3__javaAdvanced._3_collection._1_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

/** ! linkedList -->
 **  addFirst() --> aggiunge item all'inizio della lista
 **  subList() --> ci consente di ottenere una nuova lista
 * */
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<String> linkedListString = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            linkedList.add((i + 1) * 2);
        }
        for (int i = 0; i < 5; i++) {

//            System.out.println(linkedList.descendingIterator().next()); // mostra l'utlimo elemento
        }


//       List<Integer> subList = linkedList.subList(linkedList.size() - 5, linkedList.size()); // mostra gli ultimi 5 elementi inseriti
//        subList.forEach(i -> System.out.println(i));
        /**** Metodi di aggiunta*/
//        linkedListString.offerFirst("OfferFirst"); // viene prima di addFirst
//        linkedListString.addFirst("AddFirt");
//        linkedListString.addLast("AddLast");
//        linkedListString.offerLast("OfferLast"); // ha più poter di AddLast
//        linkedListString.add("add"); // si aggiunge alla coda, ha meno potere di offer
//        linkedListString.offer("offer"); // si aggiunge alla coda
//        linkedListString.push("Push"); // aggiunge l'elemento come primo item

//        linkedListString.forEach(s -> System.out.println(s));

        /**** Metodi di rimozione */
//        String r = linkedListString.remove();
//        String rf = linkedListString.removeFirst();
//        String rl = linkedListString.removeLast();
//
//        System.out.println(" \n Remove methodS: \n");
//        linkedListString.forEach(s -> System.out.println(s));
//        System.out.println("\n" + r + " item removed" + "\n" + rf + "first item removed" + "\n" + rl + "last item removed");
//
//        System.out.println(" \n Pool remove methodS: \n");
//        linkedListString.forEach(s -> System.out.println(s));
//
//        String p = linkedListString.poll();
//        String pf = linkedListString.pollFirst();
//        String pl = linkedListString.pollLast();
//
//        System.out.println("\n" + p + " item removed" + "\n" + pf + "first item removed" + "\n" + pl + "last item removed");
//        linkedListString.forEach(s -> System.out.println(s));

        /*! Iterator interfaccia */
        Iterator<String> iterator = linkedListString.iterator();
        ListIterator<String> listIterator = linkedListString.listIterator(linkedListString.size());

        while (iterator.hasNext()) {
//            System.out.println("Iteratre --> "+iterator.next());
        }
        System.out.println("\n");

        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if (s.equals("Push")) {
                listIterator.set("FuckingPush");
//                System.out.println( s + " " + listIterator.previous());
            }
        }

        while (listIterator.hasPrevious()) {
            System.out.println("Previous --> "+ listIterator.previous());
        }
        System.out.println("\n");

        while (listIterator.hasNext()) {
//            System.out.printl("Next --> "+ listIterator.next());
        }
    }

}