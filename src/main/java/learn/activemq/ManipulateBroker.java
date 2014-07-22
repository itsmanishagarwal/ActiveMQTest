package learn.activemq;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * @author manish
 */
public class ManipulateBroker {

  public static void main(String args[]) throws Exception {
    JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
    JMXConnector jmxc = JMXConnectorFactory.connect(url);
    MBeanServerConnection conn = jmxc.getMBeanServerConnection();
    String operationName = "removeQueue";
    String parameter = "portal.topic";
    ObjectName activeMQ = new ObjectName("org.apache.activemq:brokerName=localhost,type=Broker");
    if (parameter != null) {
      System.out.println("found the param");
      Object[] params = {
        parameter
      };
      String[] sig = {
        "java.lang.String"
      };
      Object obj = conn.invoke(activeMQ, operationName, params, sig);
      System.out.println(obj);
    }
  }

}
