package patterns.behavioral.templateMethod.practice.networks;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public abstract class Network {
  String userName;
  String password;

  Network() {
  }
  public boolean post(String message) {
    // Authenticate before posting. Every network uses a different
    // authentication method.
    if (logIn(this.userName, this.password)) {
      // Send the post data.
      boolean result =  sendData(message.getBytes());
      logOut();
      return result;
    }
    return false;
  }

  abstract boolean logIn(String userName, String password);
  abstract boolean sendData(byte[] data);
  abstract void logOut();
}
