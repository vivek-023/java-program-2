class generic_stack<t>{
    private int top,size;
    private t arr[];
    generic_stack(int size){
        top=-1;
        this.size=size;
        arr=(t[])new Object[size];
    }

    boolean isfull(){
        return top==size-1;
    }

    boolean isempty(){
        return top==-1;
    }

    void push(t data){
        if(isfull()){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=data;
    }
    t pop(){
        if(isempty())
            return null;
        t ans=arr[top];
        arr[top]=null;
        top--;
        return ans;
    }

    void show(){
        for(int i=top;i>=0;i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
public class ReversingStringUsingStack {
    public static void main(String[] args) {
        String x="vivek";
        char xx[]=x.toCharArray();
        generic_stack<Character> s1=new generic_stack<Character>(x.length());
        System.out.println(xx);
        for(int i=0;i<xx.length;i++){
            s1.push(xx[i]);
        }
        for(int i=0;i<xx.length;i++){
            xx[i]=s1.pop();
        }
        System.out.println(xx);
    }
}
