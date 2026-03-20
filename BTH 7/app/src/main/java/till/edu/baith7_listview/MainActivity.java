package till.edu.baith7_listview;

// NHỚ GIỮ NGUYÊN DÒNG PACKAGE CỦA BẠN Ở ĐÂY NHÉ!

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvNgonNgu;
    ArrayList<String> dsNgonNgu;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNgonNgu = findViewById(R.id.lvNgonNgu);

        dsNgonNgu = new ArrayList<>();
        dsNgonNgu.add("Java (Android)");
        dsNgonNgu.add("Python");
        dsNgonNgu.add("C++");
        dsNgonNgu.add("C#");
        dsNgonNgu.add("JavaScript");
        dsNgonNgu.add("Kotlin");
        dsNgonNgu.add("Swift (iOS)");
        dsNgonNgu.add("PHP");
        dsNgonNgu.add("Ruby");
        dsNgonNgu.add("Dart (Flutter)");
        dsNgonNgu.add("Go");
        dsNgonNgu.add("Rust");

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsNgonNgu
        );

        lvNgonNgu.setAdapter(adapter);
    }
}