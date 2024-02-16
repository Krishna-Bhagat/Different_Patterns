public class skip_substring {
    public static void main(String[] args) {
        String tem = "baccad";
        System.out.println(skip(tem));
    }

    private static String skip(String tem) {
        StringBuilder sb = new StringBuilder(tem);
        boolean flag = true;
        while(flag){
            if(sb.indexOf("a")==-1) flag =false;
            else{
                sb.deleteCharAt(sb.indexOf("a"));
            }
        }
        return sb.toString();
    }
}
