public class City {

    public static void main (String args[])
    {
        Budynek A1 = new Budynek(100,"A1");
        Budynek B1 = new Budynek(50,"B1");

        System.out.println(A1.getName() + " " + A1.getSize());
        System.out.println(B1.getName() + " " + B1.getSize());

        B1.getOnOff();
        B1.setOnOff(true);
        B1.getOnOff();
    }
}
