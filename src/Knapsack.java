public class Knapsack {

    static final int[] weights = {3, 1, 6, 10, 1, 4, 9, 1, 7, 2, 6, 1, 6, 2, 2, 4, 8, 1, 7, 3, 6, 2, 9, 5, 3, 3, 4, 7, 3, 5};
    static final int[] costs = {7, 4, 9, 18, 9, 15, 4, 2, 6, 13, 18, 12, 12, 16, 19, 19, 10, 16, 14, 3, 14, 4, 15, 7, 5, 10, 10, 13, 19, 9};
    static final int wmax = 165;

    public static void main(String[] args) {
        int maxbin=0;
        int kaspsack = 0,maxKaspsack=0;
        int kaspsackW=0,maxKaspsackW=0;
        int kaspsackC=0,maxKaspsackC=0;
        String tmp = "";
        for(int i=0;i<weights.length;i++) {
            tmp+='1';
        }
        maxbin=Integer.parseInt(tmp,2);


        while(kaspsack<maxbin){
            kaspsackW=0;
            kaspsackC=0;
            String binary= Integer.toBinaryString(kaspsack);
            int tmplenth=weights.length-binary.length();
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i)=='1'){
                   kaspsackW+= weights[tmplenth+i];
                   kaspsackC+= costs[tmplenth+i];
                }
            }
            if(kaspsackW<=wmax &&kaspsackC>maxKaspsackC) {
                maxKaspsack = kaspsack;
                maxKaspsackC=kaspsackC;
                maxKaspsackW=kaspsackW;
            }

            kaspsack++;
        }
        System.out.println(maxKaspsackC);
        System.out.println(maxKaspsackW);
        System.out.println(Integer.toBinaryString(maxKaspsack));

    }
}
