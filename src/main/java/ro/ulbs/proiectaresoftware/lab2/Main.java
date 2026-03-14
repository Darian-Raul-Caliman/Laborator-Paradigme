package ro.ulbs.proiectaresoftware.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();


        for(int j = 0; j < 5; j++){
            x.add((int)(Math.random() * 11));
        }
        for(int j = 0; j < 7; j++){
            y.add((int)(Math.random() * 11));
        }

        System.out.println("Lista X: " + x);
        System.out.println("Lista Y: " + y);
        System.out.println("-------------------------");


        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println("a) X + Y: " + xPlusY);


        for(int j = 0; j < x.size(); j++){
            if(y.contains(x.get(j))){
                zSet.add(x.get(j));
            }
        }
        System.out.println("b) Intersectie (zSet): " + zSet);


        for(int j = 0; j < x.size(); j++){
            if(!y.contains(x.get(j))){
                xMinusY.add(x.get(j));
            }
        }
        System.out.println("c) Diferenta (X - Y): " + xMinusY);


        for(int j = 0; j < x.size(); j++){
            if(x.get(j) < p){
                xPlusYLimitedByP.add(x.get(j));
            }
        }
        for(int j = 0; j < y.size(); j++){
            if(y.get(j) < p){
                xPlusYLimitedByP.add(y.get(j));
            }
        }
        System.out.println("d) X + Y limitat de p=" + p + ": " + xPlusYLimitedByP);
    }
}