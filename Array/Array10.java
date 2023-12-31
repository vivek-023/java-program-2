//ip 2,5,1,8,9
//op 5,2,8,1,9
public class Array10 {
    public static void main(String[] args) {
        int[] a = {2,5,1,8,9};
    //     int i=0,j=1,k=2,l=3,m=4;
    //    a[i] = 2;
    //    a[j] = 5;
    //    a[k] = 1;
    //    a[l] = 8;
    //    a[m] = 9;
    //    System.out.print("Unswapped elements of an array");
    //    System.out.print("\n"+a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[m]);

    //   int b,d;
    //   b = a[i];
    //   a[i] = a[j];
    //   a[j] = b;
   
    

    //   d = a[k];
    //   a[k] = a[l];
    //   a[l] = d;
    // System.out.print("\nSwapped elements of an array");
    // System.out.print("\n"+a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[m]);


    for(int c=0; c<a.length; c++){
        if(c%2==0){
        if(c+1>=a.length) break;
        int i = 1;
        a[c] = a[i+c];
        System.out.print(a[i+c]+" ");
    }else{
        int j = 1;
        a[c] = a[c-j];
        System.out.print(a[c-j]+" ");
    }
    }



    }
}
