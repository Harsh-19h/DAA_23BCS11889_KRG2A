// [*IMP] ARRAY IMPLEMENTATION OF STACK 

public class stacks{
    public static class Stack{
         int idx=0; // important variable
         int arr[]=new int[5];
        void push(int x){
            if(isFull()) {
                System.out.println("stack is full");
                return;
            }
        arr[idx]=x;
        idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
    }
    public static void main(String args[]){
        Stack st = new Stack ();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(6);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(23);
        System.out.println(st.isFull());
        st.push(34);
    }
}
