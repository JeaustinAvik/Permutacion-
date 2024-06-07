
    public class Marginal extends Probabilidad{

        public Marginal() {
        }

        public int[] getMarginalX(int[][] n, int total){
            int p=0;
            int[] marginal= new int[n.length ];
            for(int i=0;i<n.length;i++){
                int sum=0;
                for(int j=0;j<2;j++){
                    sum=sum+n[i][j];
                    // System.out.println("Probabilidad Marginal "+p+") "+n[i][j]+"/"+total);
                }
                marginal[i]=sum;
            }

            System.out.println("Probablidad Marginal en X");
            for (int i: marginal){
                p++;
                System.out.print(p+") "+i+"/"+total+"\n");
            }

            return marginal;
        }





        public int[] getMarginalY(int[][] n, int total){
            int p=0;
            int[] marginal= new int[n.length ];
            for(int i=0;i<n.length;i++){
                int sum=0;
                for(int j=0;j<2;j++){
                    sum=sum+n[j][i];
                    // System.out.println("Probabilidad Marginal "+p+") "+n[i][j]+"/"+total);
                }
                marginal[i]=sum;
            }
            System.out.println("Probabilidad Marginal en Y");
            for (int i: marginal){
                p++;
                System.out.print(p+") "+i+"/"+total+"\n");
            }
            return marginal;
        }




    }

