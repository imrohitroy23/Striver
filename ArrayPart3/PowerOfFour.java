public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        double res=Math.log(n)/Math.log(4);
        return(res==(int) res);
    }
}
