import java.io.*;

public class task_1_bin {
    public static void main(String[] args) throws IOException {

        double[] ar = {4.5, 6.5};
        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/test2in.txt"));
        for(double d: ar){
            out.writeDouble(d);
        }

        DataInputStream in = new DataInputStream(new FileInputStream("src/test2in.txt"));
        double sum = 0.0;
        while(in.available() > 0) {
            sum += in.readDouble();
        }
        DataOutputStream out1 = new DataOutputStream(new FileOutputStream("src/test2out.txt"));
        out1.writeDouble(sum);
        System.out.println(sum);
    }
}