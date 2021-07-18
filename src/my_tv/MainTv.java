package my_tv;

public class MainTv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.setOn(true);
        tv1.setChannel(80);
        tv1.setVolumeLevel(20);

        TV tv2 = new TV();
        tv2.setOn(true);
        tv2.setChannel(70);
        tv2.setVolumeLevel(50);

        tv1.displayStatus(1);
        tv2.displayStatus(2);
    }
}
