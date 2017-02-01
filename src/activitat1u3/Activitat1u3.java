package activitat1u3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Activitat1u3 {

    public static void main(String[] args) throws UnknownHostException {
        //Recorremos un array de InetAddress para sacar todas las caracteristicas de las diferentes IP's que puedan tener el host.
        for (InetAddress inetAddress : InetAddress.getAllByName("www.twitter.com")) {
            System.out.println(inetAddress);
        }
    }
}
