import java.util.Arrays;
class uniqueNo1
{
    static void printUnique(int a[],int n){
       Arrays.sort(a);
       for(int i=0;i<n;i++){
         if(i==0||a[i]!=a[i-1])
            System.out.print(a[i]+" ");
       }
        
    }
    public static void main(String args[]){
        int arr[]={12,10,9,45,2,10,10,45};
        int n=arr.length;
        printUnique(arr,n);
    }
}