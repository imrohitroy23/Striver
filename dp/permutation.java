class permutation{
    public int countVowelPermutation(int n) {
        final int mod=1000000007;
        long a=1,e=1,o=1,u=1,i=1;
        for(int j=1;j<n;j++){
            long ae=e;
            long ee=(a+i)%mod;
            long in=(a+e+o+u)%mod;
            long on=(i+u)%mod;
            long un=a;
            a=ae;
            e=ee;
            i=in;
            o=on;
            u=un;
        }
        return (int)((a+e+i+o+u)%mod);
    }
}