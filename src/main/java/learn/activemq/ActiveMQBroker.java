package learn.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author manish
 *
 */
public class ActiveMQBroker {

  public static void main(String args[]) throws InterruptedException{
    new ClassPathXmlApplicationContext("applicationContext-broker.xml");
    
    while (true) {
      Thread.sleep(1000L);
    }
  }
  
}
