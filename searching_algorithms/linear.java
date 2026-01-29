
public class linear {

  public static int linearSearch(int arr[],int key){

    for (int i=0;i<arr.length;i++){

      if (arr[i]==key){
        return i;
      }
    }
      return -1;
    }

  public static void main(String args[]){

    int num[]={10,20,35,0,45}; 
    int key= 0; 

   int index=linearSearch(num,key);

   if(num[index]==key){
    System.out.println("key is found at "+index);
   }
   else{ 
    System.out.println("key is NOT found");
   }
  }
}
//canteen menu at linear2

