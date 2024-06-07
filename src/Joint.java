
    public class Joint extends Probabilidad{

        public Joint() {
        }

        public int[] getJoint(int[][] n, int total){
            int p=0;
            int[] joint = new int[n.length*n[0].length];
            System.out.println("Probabilidad Conjunto");
            for (int i = 0; i < n.length; i++){
                for (int j = 0; j < n[i].length; j++){

                    joint[p]=n[i][j];
                    p++;
                    System.out.print(p+") "+n[i][j]+"/"+total+"\n");
                }

            }

            return joint;
        }
}
