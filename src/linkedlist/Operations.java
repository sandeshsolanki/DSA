package linkedlist;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Operations {
    public static Node head;
    public static Node tail;





    //for add a node at the start
    public static void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }




    //for add a node at the end
    public static void addEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {   // empty list
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }






    //for add at the given position
    public static void addPosition(int data, int k)
    {
        if(k == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode  = new Node(data);
        Node temp = head;

        for (int i=0; i<k-1; i++)
        {
            if(temp == null)
            {
                System.out.println("invalid....|");
                 return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null)
        {
            tail = newNode;
        }
    }




    // delete a node from beginning
    public static int removeFirst()
    {
        if (head == null)
        {
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }




    //delete a Node from end
    public static int removeEnd()
    {
        Node temp = head;

        while (temp.next != tail)
        {
            temp = temp.next;
        }
        int val = head.data;
        tail.next = null;
        tail = temp;
        return val;
    }




    //search a node in Linked List
    public static int searchInList(int target)
    {

        Node temp = head;
        int index = 0;

        while(temp != null)
        {
            if (temp.data == target)
            {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }






    //Find middle of a linked list
    public static Node middle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }




    //reverse a linked list
    public static void reverseLL()
    {
        Node prev = null;
        Node current = head;
        Node next;

        tail = head;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }




    //find Nth node from start
    public static Node nthNodeFromStart(int n)
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            if (count == n)
            {
                return temp;
            }

            temp = temp.next;
            count++;
        }
        return null;
    }





    //check if a linked list is a palindrome
    public static boolean isPalindrome()
    {
        //find middle
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        //reverse second half

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        //check data same or not

        while (right != null)
        {
            if (right.data != left.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }






    //detect loop in linked list
    public static boolean hasLoop()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }





    //find starting node in loop
    public static Node findStatingOfLoop()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                break;
            }

        }
        if (fast == null || fast.next==null)
        {
            return null;
        }

        slow = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }





    //remove loop in thi linked list
    public static void removeLoop()
    {
        if (head == null || head.next == null)
        {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;


            if (slow == fast)
            {
                break;
            }
        }

        slow = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        Node loopStart = slow;

        Node temp = loopStart;

        while (temp.next != loopStart)
        {
            temp = temp.next;
        }
        temp.next = null;
    }





    //remove duplicate from sorted list
    public static void removeDuplicate()
    {
        Node temp = head;
        while (temp != null && temp.next != null)
        {
            if (temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
    }


    // remove duplicate from unsorted list
    public static void removeUnsortedList()
    {
        Node current = head;

        while (current != null)
        {
            Node runner = current;

            while (runner.next != null)
            {
                if (runner.next.data == current.data)
                {
                    runner.next = runner.next.next;
                }
                else
                {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }





    //merge two sorted linked list
    public static Node mergeTwoSortedList(Node list1, Node list2)
    {
        if (list1 == null)
        {
            return list2;
        }
        if (list2 == null)
        {
            return list1;
        }

        if (list1.data < list2.data)
        {
            list1.next = mergeTwoSortedList(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoSortedList(list2.next, list1);
            return list2;
        }
    }
    public static void main(String[] args) {

    }
}
