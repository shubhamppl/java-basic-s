class Main{
     
    public static void main(String[]args){
    
    
    int[] arr= {1,2,3,4,5,3,4,4,4,2,1};
    int i,j,count =0,element =0;
    
    for(i=0;i< arr.length;i++){
    int tempElement=arr[i];
    int tempCount=0;
    for( j=0;j<arr.length;j++)
     if (arr[j]==tempElement)
     tempCount++;
     if (tempCount>count){
      element=tempElement;
      count=tempCount;
    }
}
    System.out.println("element="+ element+ "frequency="+ count);
 }   
    }
