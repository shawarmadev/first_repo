
class Tree{
    String val;
    Tree left, right;

    public Tree(String val, Tree left, Tree right) {
        this.val = "";
        this.left = left;
        this.right = right;
    }

    public Tree(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class DailyCode {
  
  static boolean isNumeric(String str) { 
    try {  
      Double.parseDouble(str);  
      return true;
    } catch(NumberFormatException e){  
      return false;  
    }  
  }

  static int evaluate(Tree root){
    int res=0;
    if (isNumeric(root.val)==true) {
      res=Integer.parseInt(root.val);
    }
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
  
} 
class Solution {
  int pos, neg = 0;

  public int maximumCount(int[] nums) {

      for (int i = 0; i == nums.length - 1; i++) {
          if (nums[i] > 0) {
              pos++;
          } else {
              neg++;
          }
      }
      return pos >= neg ? pos : neg;
  }


  public void main(String[] args) {
      int[] nums = { -2, -1, -1, 1, 2, 3 };
      int res = maximumCount(nums);
      System.out.println(res);
    }
  
  }


