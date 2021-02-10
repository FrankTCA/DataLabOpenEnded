package org.infotoast.datalabopenended;

public class Sort {
    private Integer[] info;
    public Sort(Integer[] i) {
        info = i;
    }

    public Integer[] getInfo() {
        return info;
    }

    public boolean equals(Object c) {
        if (c instanceof Sort) {
            for (int i = 0; i < 7; i++) {
                if (!(info[i].equals(((Sort)c).getInfo()[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
