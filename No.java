
import java.util.Comparator;

public class No implements Comparator<No> {

            /*
         * link_cost
         * band_width
         * link_late
         * link_charge
         */

        String gearName;
        int pos;
        double weight;

        public No(int pos, String gearName, double weight) {
            this.pos = pos;
            this.gearName = gearName;
            this.weight = 100000000/weight;
        }

        @Override public int compare(No node1, No node2)
        {
      
            if (node1.pos < node2.pos)
                return -1;
      
            if (node1.pos > node2.pos)
                return 1;
      
            return 0;
        }
    }