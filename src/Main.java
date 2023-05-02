import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Animals animals = new Shark();
        Animals animals1 = new Eagle();
        Animals animals2 = new Turtle();
        Animals[] animals3 = new Animals[]{ animals,animals1,animals2};
        for (int i = 0; i < animals3.length; i++) {
            if (animals3[i] instanceof Shark){
                animals3[i].method();
            }else if(animals3[i] instanceof Eagle){
                animals3[i].method();
                } else if (animals3[i] instanceof Turtle) {
                animals3[i].method();

            }

        }

        }
    }










