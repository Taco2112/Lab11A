public class Example{
  public static void main(String args[]){

    int[] nums = new int[100];
    //there are a 100 integers and they are being displayed
    //they are all equal to 0
    displayArray(nums);

//*THE LEFT SIDE THE NUMBERS



    for(int k=2; k< nums.length; k = 2*k){
      nums[k] = 1;
    }

//then they display nums a second time once this has happend
// set them all to 1
//they start at 2
//*THE RIGHT SIDE THE VALUES
    displayArray(nums);
  }



  public static void displayArray(int[] arr){
    for(int k=0; k<arr.length; k++){
    System.out.println(k + " " + arr[k]);

//*COMBINED  
    }





  }
}
