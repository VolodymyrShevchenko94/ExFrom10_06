package Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

    public class Test {
        public static void main(String[] args) throws Exception{
            ArrayList<Worker> list = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            try {
            /*for (int i = 0; i < 5; i++) {
                System.out.print("Worker " + (i + 1) + ":");
                System.out.println();
                list.add(new Worker());

            }*/
                Worker worker1 = new Worker("Petrov I. I.", "Postman", 2000);
                Worker worker2 = new Worker("Ivanov S. I.", "Cleaner", 2010);
                Worker worker3 = new Worker("Sidorova T. N.", "Accountant", 2011);
                Worker worker4 = new Worker("Sokolov P. D.", "Director", 2001);
                Worker worker5 = new Worker("Pupkina A. A.", "Postman", 2015);

                list.add(worker1);
                list.add(worker2);
                list.add(worker3);
                list.add(worker4);
                list.add(worker5);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Collections.sort(list, new Comparator<Worker>() {
                @Override
                public int compare(Worker o1, Worker o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println(list);

            System.out.println("Проверка трудового стажа: " + Worker.checkWorkExperience(list, 14));

        }
    }
