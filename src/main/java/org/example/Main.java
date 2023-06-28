import gpus.amd;
import gpus.intel;

public class Main {
    public static void main(String[] args) {

        amd amdCPU = new amd();
        amdCPU.gpuInfo();

        intel intelGPU = new intel();
        intelGPU.gpuInfo();

        int[] newArray = new int[10];
        newArray[0] = 33;
        newArray[1] = 5;
        newArray[2] = 26;
        newArray[3] = 48;
        newArray[4] = 34;
        newArray[5] = 0;
        newArray[6] = 3;
        newArray[7] = 69;
        newArray[8] = 1;
        newArray[9] = 39;

        System.out.println("#1 " + newArray[0]);
        System.out.println("#2 " + newArray[0]);
        System.out.println("#3 " + newArray[0]);
        System.out.println("#4 " + newArray[0]);
        System.out.println("#5 " + newArray[0]);
        System.out.println("#6 " + newArray[0]);
        System.out.println("#7 " + newArray[0]);
        System.out.println("#8 " + newArray[0]);
        System.out.println("#9 " + newArray[0]);
        System.out.println("#10 " + newArray[0]);


        int[] numbers = new int[35];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;// Assigning values to the array elements
            System.out.print(numbers[i] + " ");

        }
    }
}


