public class Budynek {

    private int size;
    private String name;
    private boolean onOff;

    public Budynek(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize()
    {
        return size;
    }

    public String getName()
    {
        return name;
    }

    public void setOnOff(boolean a)
    {
        onOff = a;
    }

    public void getOnOff()
    {
        if (onOff == true)
        {
            System.out.println("Swiatlo jest wlaczone");
        }
        else
            System.out.println("Swiatlo jest wylaczone");
    }
}
