package Q1;

public class Engine {
    private String material;
    public Engine(String material) {
        this.material = material;
    }
    public void displayEngineInfo(){
        System.out.printf("Engine Material: %s\n",material);
    }
}
