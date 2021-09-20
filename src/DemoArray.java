public class DemoArray {
    public static void main(String[] args) {
        int a = countByCharacter("NAMKHANH", 'Z');
        System.out.println(a);
//        int a[] = {2, 3, 4, 5, 6, 7};
//        addNewElement(a, -9, 2);
//        deleteByIndex(a, 2);

    }

    //tên phương thức: addNewElement
    //danh sách tham số: 1. Mảng, 2. Giá trị mới, 3. Index
    //kiểu dữ liệu trả về: 1 Mảng
    //phần thân
    public static int[] addNewElement(int[] a, int newValue, int index){
        if (index<0 || index > a.length) return a;
        //        1.Tạo ra 1 mảng mới (n+1) phần tử
        int n = a.length +1;
        int a1[] = new int[n];
//        2. Duyệt mang (0-index) gán a1[i] = a[i]
        for (int i = 0; i < index; i++) {
            a1[i] = a[i];
        }
//        3. Duyệt mảng (index) - length a
//        a1[i+1] = a[i]
        for (int i = index; i < a.length; i++) {
            a1[i+1] = a[i];
        }
//        4. a1[index] = giá trị mới
        a1[index] = newValue;
        return a1;
    }

    //tên của phương thức: deleteByIndex
    //tham số: 1. Mảng, 2. index
    //dữ liệu trả về: 1 mảng
    public static int[] deleteByIndex(int a[], int index){
//        tạo ra 1 mảng mới tên a1 (n-1) phần tử
        int n = a.length-1;
        int a1[] = new int[n];
//        duyệt mảng từ (0-index)
//        a1[i] = a[i]
        for (int i = 0; i < index; i++) {
            a1[i] = a[i];
        }
//        duyệt mảng từ (index+1 -> length)
//        a1[i-1] = a[i]
        for (int i = index+1; i < a.length; i++) {
            a1[i-1]=a[i];
        }
        return a1;


    }

    //tên phương thức: countByCharacter
    //tham số: chuỗi, 1 ký tự muốn tìm
    // dữ liệu trả về: số lương (int)
    public static int countByCharacter(String text, char character){
        int count=0;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a ==character) count++;
        }
        return count;
    }

}
