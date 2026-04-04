package till.edu.baith10_viduintentdongian;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinh(android.view.View v) {
        android.content.Intent iManHinhKhac = new android.content.Intent(this, SubActivityOne.class);
        startActivity(iManHinhKhac);
    }
}