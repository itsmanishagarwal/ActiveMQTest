package learn.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author manish
 *
 */
public class ActiveMQSubscriber {

  public static void main(String args[]) throws InterruptedException{
    new ClassPathXmlApplicationContext("applicationContext-subscriber.xml");
    
    while (true) {
      Thread.sleep(1000L);
    }
  }
  
}
