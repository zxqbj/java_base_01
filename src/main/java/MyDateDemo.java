import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        // 格式化时间格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        String formatStr = getFormat(date, sdf);
        System.out.println(formatStr);
    }

    private static String getFormat(Date date, SimpleDateFormat sdf) {
        return sdf.format(date);
    }
}
