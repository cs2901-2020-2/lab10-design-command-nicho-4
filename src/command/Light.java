package command;

public class Light {
    private boolean isOn = false;
    private String location;

    Light(String _location){
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

}
