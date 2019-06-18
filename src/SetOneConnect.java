import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import Laba6.Ammunition;


public class SetOneConnect implements Set<Ammunition> {
    private int size = 0;
    private AmNode head;
    private AmNode tail;


    /**
     * Creating object of class SetOneConnect
     * (without elements)
     */
    public SetOneConnect(){//nya
    }

    /**
     * Creating object of class SetOneConnect
     * @param o Ammunition element
     */
    public SetOneConnect(Ammunition o){
        add(o);
    }

    /**
     * Creating object of class SetOneConnect
     * @param c Collection of Ammunition objects
     */
    public SetOneConnect(Collection c) { addAll(c);}

    /**
     * Getting size of set
     * @return int, size of set
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Checking if set is empty
     * @return boolean, true if empty, else false
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Cheking if set contains object
     * @param o object to check
     * @return boolean, true if contains object, else false
     */
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

    /**
     * Iterator of SetOneConnect
     * @return new iterator
     */
    @Override
    public Iterator iterator() {
        return new Iterator<Ammunition>() {
            int index = 0;
            AmNode node = head;

            /**
             * Checking if iterator has nest
             * @return boolean, true if has next, else false
             */
            @Override
            public boolean hasNext() {
                return index < size;
            }

            /**
             * Getting next Ammunition
             * @return Ammunition, next Ammunition
             */
            @Override
            public Ammunition next() {
                index++;
                try{
                    Ammunition res = node.getData();
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

    /**
     * Transforming SetOneConnest to array
     * @return array
     */
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

    /**
     * Adding Ammunition to set
     * @param o Ammunition to add
     * @return boolean, true if added, else false
     */
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

    /**
     * Removing object from set
     * @param o object to remove
     * @return boolean, true if removed, else false
     */
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

    /**
     * Adding all elements of collection to set
     * @param c collection to add
     * @return boolean, true if at least one element is added, else false
     */
    @Override
    public boolean addAll(Collection c) {
        Iterator iterator = c.iterator();
        boolean added = false;
        while (iterator.hasNext()){
            Object i = iterator.next();
            try{
                boolean success = add((Ammunition) i);
                if (!added && success){added = true;}
            }catch(Exception e) {
                System.err.println("Not Ammunition");
            };
        }
        return added;
    }

    /**
     * Clearing set
     */
    @Override
    public void clear() {
        this.size = 0;
        head = tail = null;
    }

    /**
     * Removing all elements of collection from set
     * @param c collection to remove
     * @return boolean, true if at least one element is removed, else false
     */
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

    /**
     * Removing all element from set EXCEPT elements from collection
     * @param c collection to keep
     * @return boolean, always true
     */
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

    /**
     * Checking if all elements of collection are in set
     * @param c collection to check
     * @return boolean, true if set contains at least one element, else false
     */
    @Override
    public boolean containsAll(Collection c) {
        Iterator citerator = c.iterator();
        boolean checked = false;
        while (citerator.hasNext()){
            Object i = citerator.next();
            try{
                if (contains((Ammunition) i)){
                    checked = true;
                }
            }catch(Exception e) {
                System.err.println("Error");
            };
        }
        return checked;
    }

    /**
     * Transforming SetOneConnest to array
     * @param a array
     * @return array
     */
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

}
