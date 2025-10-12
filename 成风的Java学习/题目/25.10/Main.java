import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
         
        // 计算S的翻转字符串S'
        StringBuilder reversedSB = new StringBuilder(S);
        String reversedS = reversedSB.reverse().toString();
        
        // 找出S和S'中较大的那个
        String maxStr = S.compareTo(reversedS) > 0 ? S : reversedS;
        
        // 找到比maxStr字典序大的最小字符串
        String T = findNextString(maxStr);
        
        System.out.println(T);
        scan.close();
    }
    
    // 寻找比给定字符串字典序大的最小字符串
    private static String findNextString(String s) {
        // 对于输入"zaz"，我们需要返回"zaza"
        // 首先检查添加'a'后的字符串是否满足字典序更大
        String candidate1 = s + 'a';
        
        // 然后使用常规算法计算下一个字符串
        char[] chars = s.toCharArray();
        int n = chars.length;
        int i = n - 1;
        
        // 从右向左找第一个可以增加的字符
        while (i >= 0 && chars[i] == 'z') {
            i--;
        }
        
        String candidate2;
        if (i < 0) {
            // 如果所有字符都是'z'，添加一个'a'
            candidate2 = s + 'a';
        } else {
            // 增加该字符
            chars[i]++;
            // 将右侧所有字符设置为'a'
            for (int j = i + 1; j < n; j++) {
                chars[j] = 'a';
            }
            candidate2 = new String(chars);
        }
        
        // 比较两种候选方案，返回字典序较小的那个
        if (candidate1.compareTo(candidate2) < 0) {
            return candidate1;
        } else {
            return candidate2;
        }
    }
}