public class StringDemo5 {
    public static void main(String[] args) {
        String talk = "你玩的真好,下次别玩了,我草泥马,sb";
        //定义一个敏感词库
        String[] arr = {"tmd","cnm","sb","mlgb","我草泥马"};
        //String result = talk.replace("我草泥马","***");
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
    
}
