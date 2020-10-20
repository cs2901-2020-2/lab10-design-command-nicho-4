package command;

public class Stereo {
    private boolean isOn = false;
    public static final int CD = 3;
    public static final int DVD = 2;
    public static final int RADIO = 1;
    public static final int OFF = 0;
    private int mode;
    private int volume = 5;
    private String location;

    Stereo(String _location){
        location = _location;
    }

    public void  on(){
        isOn = true;
        System.out.println("Light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Light is "+isOn);
    }

    public void setCd(){
        if (isOn){
            mode = CD;
        }
    }

    public void setDvd(){
        if (isOn){
            mode = DVD;
        }
    }

    public void setRadio(){
        if (isOn){
            mode = RADIO;
        }
    }

    public void setVolume(int new_volume){
        if (isOn){
            volume = new_volume;
        }
    }



}
