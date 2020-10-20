package command;

public class RemoteLoader {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");


        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);



        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
