import java.util.*;

/**
 * Created by kenneth on 2016/8/2.
 */
public class fun {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        while(scan.hasNextLine()){
            String[] split = scan.nextLine().split(" ");
            for (int i = 0; i < split.length; i++) {
                list.add(split[i]);
            }
            System.out.println(list.size());
            String temp1 = "";
            for(int i = 0;i<list.size()-1;++i){
                temp1 = list.get(i);
                Iterator<String>  it = list.iterator();
                it.next();
               while(it.hasNext()){
                   String  ss = it.next();
                   if(temp1.equals(ss)){
                       it.remove();
                   }
               }
            }
            System.out.println();
            System.out.print(list.size());
        }
*/

        String str = "zhangywjxpz";
        String s = "";
        if (str.contains("zhang")){
            System.out.println(true);
            str = str.replaceAll("zhang", "lisi");
        }
        System.out.println(str);
        Map map = new HashMap();
        Collections.synchronizedMap(map);//将hashmap转化为线程安全的


    }
}
