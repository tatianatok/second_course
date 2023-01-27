package Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
        private final Queue<Transport> transportQueue = new ArrayDeque<>();

        public void addTransport(Transport transport) {
            if (transport instanceof Bus) {
                System.out.println("Автобусы не проходят ТО");
            } else {
                transportQueue.add(transport);
            }
        }
        // провести техосмотр
        public void makeTO(Transport transport) {
            transport = transportQueue.poll();
            if (transport != null) {
                transport.makeTO();
            }
        }

        public static void service(Transport... transports) {
            for (Transport transport : transports) {
                serviceTransport(transport);
            }
        }

            //return false;
      //  }

    private static void serviceTransport(Transport transport){
        try {
            if (!transport.service()) {
                throw new RuntimeException("Транспортное средство " + transport.getBrand() + " " + transport.getModel()
                        + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

