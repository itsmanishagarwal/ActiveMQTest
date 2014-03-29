package learn.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author manish
 *
 */
public class ActiveMQSubscriberTest {

  public static void main(String args[]) throws InterruptedException{
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-subscriber.xml");
    JmsTemplate jmsTemplateTopic = context.getBean(JmsTemplate.class);
    
    while (true) {
      Thread.sleep(500L);
      System.out.println(jmsTemplateTopic.receiveAndConvert().toString());
    }
  }
  
}
