import java.lang.Math;

class Node{
    int val;
    Node left, right;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class DailyCode {
  
  static int evaluate(Node root){
    int res=0;
    return res;
  }

  static int calcAngle(int res, int h, int min){
    res=0;
    if(h >= 12) h = h - 12;
    int ah = 30 * h + min/2; 
    int amin = 6 * min;
    res = Math.abs(ah-amin);
    return res;
  }
  public static void main (String [] args) { 
    int test=calcAngle(0, 14, 40);
    System.out.println(test);      
} 
}
