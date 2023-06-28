package gpus;


public class amd {
    String model = "rx6600";
    int ram = 8;
    public String getModel() {
        return model;
        }
    public int getRam() {
        return ram;
    }
    public void gpuInfo() {
        System.out.println("model" + model + "ram" + ram);
    }
}