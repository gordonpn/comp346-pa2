package sync;

/** @author Kerly Titus */
public class Driver {

  /**
   * main class
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {

    Network objNetwork = new Network(); /* Activate the network */
    Server objServer1 = new Server("server1");
    Server objServer2 = new Server("server2");
    Client objClient1 = new Client("sending"); /* Start the sending client thread */
    Client objClient2 = new Client("receiving"); /* Start the receiving client thread */

    objNetwork.start();
    objServer1.start();
    objServer2.start();
    objClient1.start();
    objClient2.start();

    objNetwork.join();
    objServer1.join();
    objServer2.join();
    objClient1.join();
    objClient2.join();
  }
}
