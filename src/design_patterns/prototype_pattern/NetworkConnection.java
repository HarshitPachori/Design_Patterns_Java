package design_patterns.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/*
 * now to make this class clonable we use interface clonable with it and thus implement/override a method of that interface 
 */
public class NetworkConnection implements Cloneable {

  private String ip;
  private String importantData;
  private List<String> domains = new ArrayList<>();

  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getImportantData() {
    return importantData;
  }

  public void setImportantData(String importantData) {
    this.importantData = importantData;
  }

  public void loadImportantData() throws InterruptedException {
    this.importantData = "This is very important data and will take time";
    Thread.sleep(2000);
  }

  @Override
  public String toString() {
    return "NetworkConnection   =>   ip : " + ip + "  ,  importantData : " + importantData + "  ,  domains : "
        + domains;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    // before modification
    // return super.clone();

    // after modification
    // logic for cloning
    NetworkConnection networkConnection = new NetworkConnection();
    networkConnection.setIp(getIp());
    networkConnection.setImportantData(getImportantData());
    for (String domain : getDomains()) {
      networkConnection.getDomains().add(domain);
    }
    return networkConnection;
  }

}
