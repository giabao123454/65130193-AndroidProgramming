package till.edu.baith7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTinhThanh;
    ArrayList<String> dsTinhThanh;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTinhThanh = findViewById(R.id.lvTinhThanh);

        dsTinhThanh = new ArrayList<>();
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("Thành phố Hồ Chí Minh");
        dsTinhThanh.add("Đồng Nai");
        dsTinhThanh.add("Bình Thuận");
        dsTinhThanh.add("Ninh Thuận");
        dsTinhThanh.add("Nha Trang");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsTinhThanh);
        lvTinhThanh.setAdapter(adapter);

        lvTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String tenTinh = dsTinhThanh.get(position);

                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + tenTinh, Toast.LENGTH_SHORT).show();
            }
        });
    }
}