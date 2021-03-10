package patterns.behavioral.state.demo.extendFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ShareContext {
  private ShareState state;

  private Map<String, ShareState> stateMap = new HashMap<>();

  public ShareContext() {
    state = new ConcreteShareState1();
    stateMap.put("1", state);

    state = new ConcreteShareState2();
    stateMap.put("2", state);
  }

  public ShareState getState(String key) {
    return stateMap.get(key);
  }

  public void setState(ShareState state) {
    this.state = state;
  }

  public void handle(){
    state.handle(this);
  }
}
