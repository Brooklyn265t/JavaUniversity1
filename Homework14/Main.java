package Mirea.Homework14;

public class Main {
    public static void main(String[] args) {
        var afs = new UnfairWaitList<Integer>();
        afs.add(4);
        afs.add(4);
        afs.add(2);
        afs.add(1);
        afs.remove(4);
//        afs.moveToBack();
        System.out.println(afs);
        var bwl = new BoundedWaitList<Integer>(10);
        bwl.add(4);
        bwl.add(4);
        bwl.add(2);
        bwl.add(1);
        System.out.println(afs);
    }
}