import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,800,900,1200}; // elements should be in sorted order for binary search..!
        int lr=0,up=7,mid;
        System.out.print("Enter element of which you want to find location:");
        int b = sc.nextInt();
        while(b!=-1){
        while(lr<=up){
            mid = (lr+up)/2;
            if(a[mid] == b){
                System.out.print("Item found at location = "+mid);
                break;
            }else{
                if(a[mid] < b){
                    lr = mid+1;
                }else{
                    up = mid-1;
                }
            }
            
        }
        if(lr>up){
                System.out.print(b+" Not found..!");
            }
            System.out.print("\nEnter element of which you want to find location:");
            b = sc.nextInt();
        }
        sc.close();
    }
    
}
