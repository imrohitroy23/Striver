package Maths;

public class PigsRequired {
    public int poorPigs(int b, int md, int mt) {
        int max=mt/md+1;
        int pigs=0;
        while(Math.pow(max,pigs)<b) ++pigs;
        return pigs;
    }
}
