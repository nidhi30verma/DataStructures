package dsa.stack;

/**
 * push, pop, top, empty
 */
public class StackExample {

    public void stackDemo() {
        Stack st = new Stack();
        st.push(3);
        st.push(5);
        st.push(12);
        st.push(9);

        System.out.println(st.pop());
    }






}

class Node
{
    int val;
    Node next;
    Node( int val)
    {
        this.val = val;
    }
}


class Stack
{

    Node head = null;
   /*Push method to insert element in stack*/
    public void push(int val)
    {
        if(head == null)
        {
            head = new Node(val);
        }
        else
        {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
    }

    /*Pop method to remove element from the stack*/
    public int pop()
    {

        if(head != null)
        {
            int popedElement = head.val;
            head = head.next;
            return popedElement;
        }
        else
        {
            System.out.println("Stack is Empty!");
            return -1;
        }
    }

    /*Top method to fetch the top of stack*/
    public int top()
    {
        if (head != null) {
            return head.val;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    /* Empty: tells if stack is empty or not*/
    public boolean empty()
    {
        if (head != null) {
            return false;
        }
        else
        {
            return true;
        }
    }
}
