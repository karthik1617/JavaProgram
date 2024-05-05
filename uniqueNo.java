
class uniqueNo
{
    static void printUnique(int a[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<i;j++){
                if(a[i]==a[j])
                    break;
            }
            if(i==j)
                    System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={12,10,9,45,2,10,10,45};
        int n=arr.length;
        printUnique(arr,n);
    }
}