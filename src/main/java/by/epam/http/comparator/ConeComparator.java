package by.epam.http.comparator;

import by.epam.http.entity.Cone;

import java.util.Comparator;

public enum ConeComparator implements Comparator<Cone> {
    ID{
        @Override
        public int compare(Cone o1, Cone o2) {
//            return o1.getRadius() - o2.getHeight();
            return 0;
        }
    }


}
