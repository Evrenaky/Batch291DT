package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year;

    //Instance Block
    {
        System.out.println("Herkese Selam🫡");
    }


    public InstanceBlock2() {
         //Buradaki sout'u silip instance block icine aldik
    }

    public InstanceBlock2(int year) {
        //Buradaki sout'u silip instance block icine aldik
        this.year = year;
    }
}
