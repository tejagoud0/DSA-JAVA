public class moveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,3,4,0,1,2,4,0};
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
    }
    for(int i=j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
    }
}