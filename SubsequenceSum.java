import java.util.ArrayList;

class Subsequence {
  public Boolean sub(int index, int[] arr,int s,int sum, ArrayList<Integer> al, int n) {
    if (index == n) {
      if(s==sum){
        System.out.println(al);
        return true;
      }
      return false;
    }
    if (n == 0) {
      System.out.println(al);
      return true;
    }
    al.add(arr[index]);
    if(sub(index + 1, arr,s,sum, al, n)==true){
      return true;
    }
    al.remove(arr[index]);
    if(sub(index + 1, arr,s,sum ,al, n)==true){
      return true;
    }
    return false;
  }
}

public class SubsequenceSum {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 2 };
    Subsequence subs = new Subsequence();
    ArrayList<Integer> al = new ArrayList<>();
    int sum = 2;
    System.out.println("KK");
    subs.sub(0, arr,0,sum, al, 3);
  }
}