package org.infotoast.datalabopenended;

public class Organization {
    private Sort sort;
    private int totalLength;
    public Organization(Sort s, int t) {
        sort = s;
        totalLength = t;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public String toString() {
        String names = "";
        Integer[] info = sort.getInfo();
        for (int i = 0; i < 7; i++) {
            names += BaseList.list.get(info[i]).getOwner();
            if (i != 7) {
                names += " / ";
            }
        }
        return "Names: " + names + ", with a total distance of " + totalLength;
    }
}
