package ge.tbc.testautomation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(2), new Circle(3), new Circle(4)}; //heap

        // wrapper - Collection (სია)
        List<Oval> circleList = new ArrayList<>() {
            {
                add(new Oval(10));
                add(new Oval(99));
                add(new Oval(12));
                add(new Oval(10));
                add(new Oval(13));
                add(new Oval(167));
                add(new Oval(257));
                add(new Oval(178));
                add(new Oval(196));

            }
        };

        List<Circle> circleList2 = new ArrayList<>() {
            {
                add(new Circle(10));
            }
        };
//        circleList.add(new Circle(5));
//        circleList.addAll(circleList2);
        circleList.get(2);

        int number = 0; // primitive
        Integer number2 = 0; // wrapper
        boolean b1 = true;
        Boolean b2 = false;

        // LAMBDA
        circleList.forEach(element -> {
//            element.setRadius(12);
            System.out.println(element);
        });

        // hashset -> uses identity
        Set<Circle> circleSet = new HashSet<>();
        Circle circle = new Circle(144);
        Circle circle2 = new Circle(144);
        circleSet.add(circle);
        circleSet.add(circle2);
        circleSet.add(circle);
        System.out.println(circleSet);

        // treeset -> uses info
        Set<Circle> circleSet1 = new TreeSet<>();
        circleSet1.add(circle);
        circleSet1.add(circle2);
        circleSet1.add(circle2);
        System.out.println(circleSet1);

//        Iterator<Circle>

        // experiment: comparable gets passed down in inheritance
//        Set<Oval> ovalSet = new TreeSet<>();
//        Oval ov1 = new Oval(144);
//        Oval ov2 = new Oval(144);
//        ovalSet.add(ov1);
//        ovalSet.add(ov2);
//        System.out.println(circleSet);

        // iterator
        Iterator<Circle> iter = circleSet.iterator();
        while (iter.hasNext()) {
            Circle iteration = iter.next();
            System.out.println(iteration);
        }

        System.out.println(circle.equals(circle2));

        // sort
        circleList.sort(new OrderingComparator());
        System.out.println(circleList);

        // hashmap
        HashMap<String, String> hashMap = new HashMap<>() {
            {
                put("cizitzen1", "saburtalo");
                put("cizitzen2", "africa");

            }
        };

        for (String key :
                hashMap.keySet()) {
            System.out.println(key + "=" + hashMap.get(key));
        }
    }
}