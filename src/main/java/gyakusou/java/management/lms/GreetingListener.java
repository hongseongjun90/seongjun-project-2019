package gyakusou.java.management.lms;

import java.util.Map;
import gyakusou.java.management.lms.context.ApplicationContextListener;

public class GreetingListener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("[커뮤니티 시스템]에 오신걸 환영합니다.");
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("안녕히가세요.");
  }


}
