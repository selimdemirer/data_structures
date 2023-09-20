import java.util.NoSuchElementException;

public class MyStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom==null;
    }

    public void push(T item){

        SNode<T> node=new SNode<>(item);

        if (isEmpty()) bottom=top=node;
        else {
            top.nextAddress=node;
            top=node;
        }
        size++;

    }

    public T peek(){
        return (T) top.value;
    }

    public T pop(){

        SNode peekNode;

        if (isEmpty()) throw new NoSuchElementException();

        if (top==bottom) { // stack has one element
            peekNode=top;
            top=bottom=null;
        } else{ // more than one element
            peekNode=top;
            SNode prev=bottom;
            while(prev.nextAddress!=top){
                prev=prev.nextAddress;
            }
            prev.nextAddress=null;
            top=prev;
        }
        size--;
        return (T) peekNode.value;
    }

}