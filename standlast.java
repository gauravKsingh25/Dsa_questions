public class standlast {
    public static int first=-1;
    public static int last=-1;
    public static void findoccurencce (String str,int idx ,char element){
        if (idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
        if(first==-1){
            first=idx;
        }
        else   {
            last=idx;
        }
    }
    findoccurencce(str,idx+1,element);
}
    public static void main(String[] args) {
        String str="abaaaadaaefhsdkjdbvsu";
        findoccurencce(str,0,'a');
    }
}
