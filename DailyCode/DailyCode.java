
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
  public static void main (String [] args) { 
    Tree training = new Tree("asdf");
    System.out.println(evaluate(training));
    int test=calcAngle(0, 14, 40);
    System.out.println(test);      
} 
}
