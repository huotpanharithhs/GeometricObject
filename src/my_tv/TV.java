package my_tv;

public class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;

    public int getChannel() {

        return channel;
    }

    public void setChannel(int channel) {
        if (on && channel > 0 && channel <= 120) {
            this.channel = channel;
            return;
        }
        System.out.println("ប៉ុស្ដិទូរទស្សន៍ត្រូវតែធំជាង 0 តូចជាឬស្មើ 120");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on && volumeLevel > 0 && volumeLevel <= 100) {
            this.volumeLevel = volumeLevel;
            return;
        }
        System.out.println("កម្រិតសម្លេងត្រូវតែធំជាង 0 តូចជាឬស្មើ 100");

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setChannelUp() {
        if (on && channel > 0 && channel < 120) {
            channel++;
            return;
        }
        System.out.println("ប៉ុស្ដិទូរទស្សន៍ត្រូវតែធំជាង 0 តូចជាឬស្មើ 120");
    }

    public void setChannelDown() {
        if (on && channel > 1 && channel <= 120) {
            channel--;
            return;
        }
        System.out.println("ប៉ុស្ដិទូរទស្សន៍ត្រូវតែធំជាង 0 តូចជាឬស្មើ 120");
    }

    public void setVolumeUp() {
        if (on && volumeLevel > 0 && volumeLevel < 100) {
            volumeLevel++;
            return;
        }
        System.out.println("កម្រិតសម្លេងត្រូវតែធំជាង 0 តូចជាឬស្មើ 100");

    }

    public void setVolumeDown() {
        if (on && volumeLevel > 1 && volumeLevel <= 100) {
            volumeLevel--;
            return;
        }
        System.out.println("កម្រិតសម្លេងត្រូវតែធំជាង 0 តូចជាឬស្មើ 100");

    }

    public void displayStatus(int numTv) {
        System.out.println("ទូរទស្សន៍: " + numTv + (on ? " បើក" : " បិទ") +
                " ប៉ុសិ៍លេខ: " + channel + " កម្រិតសម្លេង: " + volumeLevel);
    }
}
