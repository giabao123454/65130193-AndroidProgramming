package till.edu.baith8_tuychinhlv;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> dsMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonAn = findViewById(R.id.lvMonAn);

        dsMonAn = new ArrayList<>();

        dsMonAn.add(new MonAn("Cơm Tấm", 35000, "Cơm tấm sườn bì chả thơm ngon", R.drawable.comtam));
        dsMonAn.add(new MonAn("Phở Bò", 40000, "Phở bò tái nạm, nước dùng đậm đà", R.drawable.phobo));
        dsMonAn.add(new MonAn("Bún Cá Nha Trang", 30000, "Bún cá chả sứa đặc sản quê hương", R.drawable.buncanhatrang));

        adapter = new MonAnAdapter(this, dsMonAn);
        lvMonAn.setAdapter(adapter);
    }
}