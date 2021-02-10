package org.infotoast.datalabopenended;

import java.util.*;

public class BaseList {
    public static List<Base> list = new ArrayList();
    private List<Sort> sort = new ArrayList();
    private List<Organization> org = new ArrayList();
    public BaseList() {
        list.add(new Base("Doxx22", -1293, 1032));
        list.add(new Base("Stupidninja", -897, 455));
        list.add(new Base("HipsterGrandma", -801, 494));
        list.add(new Base("PoopooHeadPlayz", -513, 194));
        list.add(new Base("Patriots_Breeze", 126, 177));
        list.add(new Base("rj403", 129, -165));
        list.add(new Base("Doggoed", 2615, -2300));
    }

    private Sort getSort() {
        boolean t = true;
        Integer[] items = {0, 1, 2, 3, 4, 5, 6};
        Sort s = new Sort(items);
        while (t) {
            List<Integer> l = Arrays.asList(items);
            Collections.shuffle(l);
            items = l.toArray(items);
            s = new Sort(items);
            t = false;
            for (int i = 0; i < sort.size(); i++) {
                if (s.equals(sort.get(i))) t = true;
            }
            if (!t) sort.add(s);
        }
        return s;
    }

    private Organization getTotalLength() {
        Sort srt = getSort();
        Integer[] s = srt.getInfo();
        int l = 0;
        for (int i = 0; i < 6; i++) {
            Base b1 = list.get(s[i]);
            Base b2 = list.get(s[i+1]);
            int l1 = b1.getDistance(b2);
            l += l1;
        }
        Organization o = new Organization(srt, l);
        org.add(o);
        System.out.println(" -> " + o);
        return o;
    }

    public void iter() {
        Integer[] d = {1, 2, 3, 4, 5, 6, 7};
        Organization top = new Organization(new Sort(d), -1);
        int topInt = Integer.MAX_VALUE;
        for (int i = 0; i < 5040; i++) {
            Organization o = getTotalLength();
            if (o.getTotalLength() < topInt) {
                top = o;
                topInt = o.getTotalLength();
            }
        }
        System.out.println("Your final answer is:");
        System.out.println(top);
    }
}
