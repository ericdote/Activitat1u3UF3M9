package activitat1u3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Activitat1u3 {

    public static void main(String[] args) throws UnknownHostException {

        for (InetAddress inetAddress : InetAddress.getAllByName("www.twitter.com")) {
            System.out.println(inetAddress);
        }
    }
}
