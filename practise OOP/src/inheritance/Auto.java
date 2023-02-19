package inheritance;

public class Auto {

    private String producer = "Mersedes";
    private String model = "A180";
    private EngineType engineType;
    private int currentSpeed;
    private boolean isRunning;

    public String getProducer(){
        return producer;
    }

    public String getModel(){
        return model;
    }
    public EngineType getEngineType(){
        return engineType;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public boolean isRunning(){
        return isRunning;
    }



}
