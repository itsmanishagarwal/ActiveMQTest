package learn.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author manish
 */
public class ActiveMQPublisherTest {

  public static void main(String args[]) throws InterruptedException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-publisher.xml");
    long count = 1; 
    JmsTemplate jmsTemplateTopic = context.getBean(JmsTemplate.class);
    while (count < 1001) {
      Thread.sleep(1000L);
      jmsTemplateTopic.convertAndSend(count++ + " - Hello World!!");
    }
  }
}
