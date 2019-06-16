import org.w3c.dom.*;
import Laba6.*;


public class AmNode{
    private AmNode next;
    private Ammunition data;

    public Ammunition getData() {
        return data;
    }

    public void setData(Ammunition data) {
        this.data = data;
    }
    public AmNode getNext() {
        return next;
    }

    public void setNext(AmNode next) {
        this.next = next;
    }
}
