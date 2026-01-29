
//binary search. 
public class array3 {
  
public static int binarySearch(int num[],int key){
 int start=0; 
 int end=num.length-1;
while(start<=end){
  int mid=(start+end)/2;
 if(key==num[mid]){
  return mid; 
 }
else if(num[mid]<key){
  start=mid+1;
}
else{
  end=mid-1;
}
}
return -1;
}

  public static void main(String args[]){

    int arr[]={10,12,14,15,16,18,20};
    int key=10;
    int result=binarySearch(arr, key);
    System.out.println("the key is found at "+result);
  }
}
