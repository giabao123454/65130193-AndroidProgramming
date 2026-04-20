package till.edu.thigk2nguyenngocgiabao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        ListView lvCaKhuc = findViewById(R.id.lvCaKhuc);

        String[] danhSachCaKhuc = {
                "Tiến quân ca",
                "Chào em cô gái Lam Hồng",
                "Trường Sơn Đông Trường Sơn Tây",
                "Cô gái mở đường",
                "Bác đang cùng chúng cháu hành quân",
                "Chiếc gậy Trường Sơn",
                "Lên đàng",
                "Mùa xuân trên Thành phố Hồ Chí Minh",
                "Giai điệu Tổ quốc",
                "NGUYỄN NGỌC GIA BẢO"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhSachCaKhuc);
        lvCaKhuc.setAdapter(adapter);
    }
}