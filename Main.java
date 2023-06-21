public class Main{
    public static void main(String[] args) {

        Graph g = new Graph(31);


        /*
         * link_cost
         * band_width
         * link_late
         * link_charge
         */

        //Router - 0
        g.addEdge(0, "Router-1", 1, 8);

        //Router - 1
        g.addEdge(1, "Router-0", 0, 8);
        g.addEdge(1, "Router-2", 2, 5);
        g.addEdge(1, "Router-3", 3, 6);

        //Router - 2
        g.addEdge(2, "Router-1", 1, 5);
        g.addEdge(2, "Router-4", 4, 2);

        //Router - 3
        g.addEdge(3, "Router-1", 1, 6);
        g.addEdge(3, "Router-5", 5, 4);
        g.addEdge(3, "Router-6", 6, 3);
        g.addEdge(3, "Router-7", 7, 5);

        //Router - 4
        g.addEdge(4, "Router-2", 2, 2);
        g.addEdge(4, "Router-8", 8, 4);

        //Router - 5
        g.addEdge(5, "Router-3", 3, 4);
        g.addEdge(5, "Router-9", 9, 5);

        //Router - 6
        g.addEdge(6, "Router-3", 3, 3);
        g.addEdge(6, "Router-10", 10, 4);
        g.addEdge(6, "Router-11", 11, 5);

        //Router - 7
        g.addEdge(7, "Router-3", 3, 3);
        g.addEdge(7, "Router-12", 12, 5);
        g.addEdge(7, "Router-13", 13, 6);
        
        //Router - 8
        g.addEdge(8, "Router-4", 4, 4);
        g.addEdge(8, "Router-14", 14, 6);

        //Router - 9
        g.addEdge(9, "Router-5", 5, 5);
        g.addEdge(9, "Router-15", 15, 6);
        g.addEdge(9, "Router-16", 16, 7);

        //Router - 10
        g.addEdge(10, "Router-6", 6, 4);
        g.addEdge(10, "Router-21", 21, 1);

        //Router - 11
        g.addEdge(11, "Router-6", 6, 5);
        g.addEdge(11, "Router-20", 10, 9);

        //Router - 12
        g.addEdge(12, "Router-7", 7, 5);
        g.addEdge(12, "Router-19", 19, 7);

        //Router - 13
        g.addEdge(13, "Router-7", 7, 6);
        g.addEdge(13, "Router-17", 17, 4);
        g.addEdge(13, "Router-18", 18, 5);

        //Router - 14
        g.addEdge(14, "Router-8", 8, 6);
        g.addEdge(14, "Router-15", 15, 1);
        g.addEdge(14, "Router-22", 22, 12);

        //Router - 15
        g.addEdge(15, "Router-9", 9, 6);
        g.addEdge(15, "Router-14", 14, 1);
        g.addEdge(15, "Router-16", 16, 2);
        g.addEdge(15, "Router-24", 24, 11);

        //Router - 16
        g.addEdge(16, "Router-9", 9, 7);
        g.addEdge(16, "Router-15", 15, 2);
        g.addEdge(16, "Router-21", 21, 5);
        g.addEdge(16, "Router-25", 25, 9);

        //Router - 17
        g.addEdge(17, "Router-13", 13, 4);

        //Router - 18
        g.addEdge(18, "Router-13", 13, 5);
        g.addEdge(18, "Router-29", 29, 9);

        //Router - 19
        g.addEdge(19, "Router-12", 12, 7);
        g.addEdge(19, "Router-20", 20, 1);

        //Router - 20
        g.addEdge(20, "Router-11", 11, 9);
        g.addEdge(20, "Router-19", 19, 1);
        g.addEdge(20, "Router-21", 21, 2);
        g.addEdge(20, "Router-27", 27, 7);

        //Router - 21
        g.addEdge(21, "Router-10", 10, 1);
        g.addEdge(21, "Router-16", 16, 5);
        g.addEdge(21, "Router-20", 20, 2);
        g.addEdge(21, "Router-28", 28, 7);

        //Router - 22
        g.addEdge(22, "Router-14", 14, 12);
        g.addEdge(22, "Router-23", 23, 1);

        
        //Router - 23
        g.addEdge(23, "Router-22", 22, 1);
        g.addEdge(23, "Router-26", 26, 3);

        
        //Router - 24
        g.addEdge(24, "Router-15", 15, 24);

        
        //Router - 25
        g.addEdge(25, "Router-16", 16, 9);
        g.addEdge(25, "Router-26", 26, 4);
        
        //Router - 26
        g.addEdge(26, "Router-23", 23, 3);
        g.addEdge(26, "Router-25", 25, 4);
        
        //Router - 27
        g.addEdge(27, "Router-20", 20, 7);
        g.addEdge(27, "Router-28", 28, 1);
        
        //Router - 28
        g.addEdge(28, "Router-21", 21, 7);
        g.addEdge(28, "Router-27", 27, 1);
        
        //Router - 29
        g.addEdge(29, "Router-18", 18, 9);
        g.addEdge(29, "Router-30", 30, 1);

        
        //Neamt - 30
        g.addEdge(30, "Router-29", 29, 1);

        String start =args[0];
        String end = args[1];
        // System.out.println(start + " - "+ end);
        try{
            if(g.findEdge(start) == 0 || g.findEdge(end) == 0){
                System.out.println("Rota não encontrada");
            }
            else{
                g.Dikstra(start, end);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        

        
             
    }

}