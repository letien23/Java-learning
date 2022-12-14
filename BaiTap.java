
import java.util.*;

public class BaiTap {
    public static void main(String[] args) {
        Bai2.Cau1();
        // Tạo mảng
        String[] arr = {"1", "2" , "3", "4", "5"};
        // In mảng ban đầu
        System.out.println("orgin arr:\n"+Arrays.toString(arr));
      
        // Chuyển mảng thành ArrayList
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        
        // In ArrayList vừa tạo
        System.out.println("ArrayList before:\n"+ testList); 

        // Thêm phần tử vào cuối ArrayList
        testList.add("88");
        testList.add("99");
        
        // In ArrayList sau khi thêm phần tử
        System.out.println("ArrayList after:\n"+ testList); 
        
        // Chuyển ArrayList trở về Array và lưu vào mảng kết quả
        arr = testList.toArray(new String[0]);
        
        // In mảng kết quả
        System.out.println("new arr :\n"+Arrays.toString(arr));
    }
}
