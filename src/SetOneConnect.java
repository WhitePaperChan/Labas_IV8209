import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import Laba6.Ammunition;
import com.sun.corba.se.spi.ior.ObjectKey;


public class SetOneConnect implements Set<Ammunition> {
    private int size = 0;
    private AmNode head;
    private AmNode tail;
    public SetOneConnect(){//nya
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator iterator = iterator();
        while (iterator.hasNext()){
            if (iterator.next() == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<Ammunition>() {
            int index = 0;
            AmNode node = head;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Ammunition next() {
                index++;
                try{Ammunition res = node.getData();
                    node = node.getNext();
                    return res;
                }
                catch (Exception e){
                    //null
                }
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] obj = new Object[size];
        Iterator iterator = iterator();
        int i = 0;
        while (iterator.hasNext()){
            obj[i] = iterator.next();
            i++;
        }
        return obj;
    }

    public boolean add(Ammunition o) {
        Iterator iterator = iterator();
        boolean adding = true;
        while (iterator.hasNext()){
            if (iterator.next() == o){
                adding = false;
                break;
            }
        }
        if (adding) {
            size++;
            AmNode node = new AmNode();
            node.setData(o);
            if (head == null) {
                head = tail = node;
            } else {
                if (head == tail){
                    head.setNext(node);
                    tail = node;
                } else {
                    tail.setNext(node);
                    tail = node;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        Iterator iterator = iterator();
        AmNode node = head;
        if (node != null && node == tail && iterator.next() == o) {
            head = tail = null;
            size --;
            return true;
        }
        while (iterator.hasNext()){
            if (iterator.next() == o){
                if (head == node){
                    head = node.getNext();
                }
                node = node.getNext();
                    size--;
                    while (iterator.hasNext()) {
                        try{
                            node = node.getNext();
                        }
                        catch (Exception e){
                            //null
                            };
                        iterator.next();

                    }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Iterator iterator = c.iterator();
        boolean added = false;
        while (iterator.hasNext()){
            Object i = iterator.next();
            try{
                add((Ammunition) i);
                added = true;
            }catch(Exception e) {
                System.err.println("Not Ammunition");
            };
        }
        return added;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public boolean removeAll(Collection c) {
        Iterator citerator = c.iterator();
        boolean removed = false;
        while (citerator.hasNext()){
            Object i = citerator.next();
            try{
                if (remove((Ammunition) i)){
                    removed = true;
                }
            }catch(Exception e) {
                System.err.println("Error");
            };
        }
        return removed;
    }

    @Override
    public boolean retainAll(Collection c) {
        Iterator citerator = c.iterator();
        Iterator iterator = iterator();
        boolean keep = false;
        while(iterator.hasNext()){
            Object i = iterator.next();
            while (citerator.hasNext()){
                Object ci = citerator.next();
                if (i == ci){
                    keep = true;
                    break;
                }
            }
            if (!keep){
                remove(i);
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] obj = new Object[size];
        Iterator iterator = iterator();
        int i = 0;
        while (iterator.hasNext()){
            obj[i] = iterator.next();
            i++;
        }
        return obj;
    }

    public AmNode headNode(){
        return head;
    }
}
