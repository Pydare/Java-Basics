package collections.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

    public static void main(String[] args){
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("Prison Break");

        //1. using java 8 with for each loop and lamda expression:
        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        System.out.println("----------------");
        //2. using iterator
        Iterator<String> it =  tvSeries.iterator();
        while(it.hasNext()){
            String temp = it.next();
            System.out.println(temp);
        }

        System.out.println("----------------");
        //3. using iterator and  java 8 lambda & forEachRemaining() method
        Iterator<String> it2 = tvSeries.iterator();
        it2.forEachRemaining(show -> {
            System.out.println(show);
        });

        System.out.println("----------------");
        //4. using for each loop
        for(String show: tvSeries){
            System.out.println(show);
        }

        System.out.println("----------------");
        //5. using for loop with index order
        for(int i=0; i<tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }

        System.out.println("----------------");
        //6. using a listIterator() to traverse in both directions
        ListIterator<String> tvSeriesListIterator =  tvSeries.listIterator(tvSeries.size());
        while(tvSeriesListIterator.hasPrevious()){
            String show = tvSeriesListIterator.previous();
            System.out.println(show);
        }
    }
}