package till.edu.baith9_recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewLandscape;
    ArrayList<Landscape> lstData;
    LandscapeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewLandscape = findViewById(R.id.recyclerLandscape);

        lstData = getRecyclerViewData();

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);

        adapter = new LandscapeAdapter(this, lstData);
        recyclerViewLandscape.setAdapter(adapter);
    }

    ArrayList<Landscape> getRecyclerViewData() {
        ArrayList<Landscape> list = new ArrayList<>();
        list.add(new Landscape("hon_chong", "Danh thắng Hòn Chồng"));
        list.add(new Landscape("thap_ba_ponagar", "Tháp Bà Ponagar"));
        list.add(new Landscape("vinpearl", "Khu du lịch Vinpearl"));

        return list;
    }
}