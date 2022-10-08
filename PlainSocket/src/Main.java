import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}