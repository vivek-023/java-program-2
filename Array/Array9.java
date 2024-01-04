//input 3,8,1,5,7 -----> Output 3,1,7,8,5
public class Array9 {
   public static void main(String[] args) {
    int[] a = {3,8,1,5,7};
    for(int i=0; i<a.length; i+=2){
       System.out.print(a[i]+" ");
    } 
    for(int i=1; i<a.length; i+=2){
        System.out.print(a[i]+" ");

    }
    } 
}
