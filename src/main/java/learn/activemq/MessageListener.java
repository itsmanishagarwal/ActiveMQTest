package learn.activemq;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Message Listener
 * 
 * @author Manish
 */
@Component
public class MessageListener  {

  /**
   * Logger.
   */
  private static Logger logger = Logger.getLogger(MessageListener.class);

  public void receive(String msg) {
    logger.debug(msg.toString());
  }
}
