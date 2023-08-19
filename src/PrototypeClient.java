
import design_patterns.prototype_pattern.NetworkConnection;

public class PrototypeClient {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Creating object using prototype design pattern");
    NetworkConnection networkConnection = new NetworkConnection();
    networkConnection.setIp("192.168.4.5");
    networkConnection.getDomains().add("www.google.com");
    networkConnection.getDomains().add("www.facebook.com");
    networkConnection.getDomains().add("www.instagram.com");
    networkConnection.loadImportantData();
    System.out.println(networkConnection);

    try {
      NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
      NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
      networkConnection.getDomains().remove(0);
      // now we have seen here that when we remove the index 0 from networkconnection
      // then it delete from all objects (clones) so to resolve this issue we have to
      // modify our clone method in networkconnection class
      System.out.println(networkConnection);
      System.out.println(networkConnection2);
      System.out.println(networkConnection3);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
