package dsa.recursion;

public class RemoveDuplicateString {
    public static void main(String[] args) {

     removeDuplicateString("ashis",new boolean[26],0,new StringBuilder());
     removeDuplicateString("bikash",new boolean[26],0,new StringBuilder());
     removeDuplicateString("aaaaa",new boolean[26],0,new StringBuilder());
     removeDuplicateString("akash",new boolean[26],0,new StringBuilder());


    }

    public static void removeDuplicateString(String s, boolean[] arr, int idx, StringBuilder sb){
        if(idx == s.length()){
            System.out.println(sb);
            return;
        }

        if(arr[s.charAt(idx)-'a']){
            removeDuplicateString(s,arr,idx+1,sb);

        }else {
            arr[s.charAt(idx)-'a']=true;
            removeDuplicateString(s,arr,idx,sb.append(s.charAt(idx)));
        }



    }
}
