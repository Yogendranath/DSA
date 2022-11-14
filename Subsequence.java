import java.util.ArrayList;

class Subsequences{
  public void sub(int index,int[] arr,ArrayList<Integer> al,int n){
    if(index==n){
      System.out.println(al);
      return;
    }
    if(n==0){
      System.out.println(al);
      return;
    }
    al.add(arr[index]);
    sub(index+1,arr,al,n);
    al.remove(arr[index]);
    sub(index+1,arr,al,n);
  }
}
class Main {
  public static void main(String[] args) {
    int[] arr = {3,1,2};
    Subsequences subs = new Subsequences();
    ArrayList<Integer> al = new ArrayList<>();
    subs.sub(0,arr,al,3);
  }
}