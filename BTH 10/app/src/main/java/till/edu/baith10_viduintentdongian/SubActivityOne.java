package till.edu.baith10_viduintentdongian;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    public void QuayVe(android.view.View v) {
        android.content.Intent iManHinhCHINH = new android.content.Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }
}