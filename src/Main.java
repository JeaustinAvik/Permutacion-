public class Main {
    public static void main(String[] args) {
//permutacion de abecedario
        System.out.println("PERMUTACION DE ALFABETO");
        DataSet d = new DataSet();
        String[] ds = d.getX2();
        Marginal marginal = new Marginal();
        Joint joint= new Joint();
        Condicion c = new Condicion();
        Permutacion p = new Permutacion();
        p.permutar(ds, 0);
        System.out.println();
        System.out.println();
        System.out.println();

        //probabilidades
        System.out.println("PROBABILIDAD DE UN EVENTO");
        DataSetProbabilidad dsp = new DataSetProbabilidad();
        int [][] data = dsp.getX1();
        int total = 0;
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                total += data[i][j];


        int[] marginalX=marginal.getMarginalX(data, total);
        int[] marginalY=marginal.getMarginalY(data, total);
        int[] jointt= joint.getJoint(data,total);

        c.getCondicion(marginalX,marginalY,jointt);


    }
}