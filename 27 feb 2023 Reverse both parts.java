class Solution {

    public static Node reverse(Node head, int k) {

        int i;

        Node temp=head;

        ArrayList<Integer> list=new ArrayList<>();

        while(temp!=null) {

            list.add(temp.data);

            temp=temp.next;

        }

        i=k-1;

        temp=head;

        while(i>=0) {

            temp.data=list.get(i);

            i--;

            temp=temp.next;

        }

        i=list.size()-1;

        while(i>=k) {

            temp.data=list.get(i);

            i--;

            temp=temp.next;

        }

        return head;

        

    }

}
