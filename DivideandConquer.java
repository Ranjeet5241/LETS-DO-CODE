public class DivideandConquer {
    public static void PrintArr(int arr[]){
        for(int i=0 ; i <= arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void MergSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //kaam
        // int mid = si+(ei-si)/2;koi bhi use kar sakte hai
        int mid = (si + ei)/2; 
        MergSort(arr, si, mid);//left part
        MergSort(arr, mid+1, ei);//right part
        Merge(arr,si,ei); 
    }
    public static void Merge(int arr[], int si,int ei){
        //left(0,3)=4 3-0+1=4  right(4,6)=3 6-4+1=3
        int mid = si+(ei-si)/2;
        int temp[]= new int [ei-si +1];
        int i=si;//iterator for left
        int j=mid+1;// iterator for right 
        int k=0;//iterator for temperary array
        while(i<=si && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                // k++;

            }
            else{
                temp[k]=arr[j];
                j++;
                // k++;
            }
            k++;
        }
        //left part
        while(i<= mid){
            temp[k++] =arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        //copy too orignal arr
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String args[]){
        int arr[]={6,3,8,5,9,4,2,7};
        MergSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
    
}
