package till.edu.linearlayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    public void xuLyCong(View view) {
        float soA = Float.parseFloat(edtSo1.getText().toString());
        float soB = Float.parseFloat(edtSo2.getText().toString());
        float tong = soA + soB;
        tvKetQua.setText("Kết quả: " + tong);
    }

    public void xuLyTru(View view) {
        float soA = Float.parseFloat(edtSo1.getText().toString());
        float soB = Float.parseFloat(edtSo2.getText().toString());
        float hieu = soA - soB;
        tvKetQua.setText("Kết quả: " + hieu);
    }

    public void xuLyNhan(View view) {
        float soA = Float.parseFloat(edtSo1.getText().toString());
        float soB = Float.parseFloat(edtSo2.getText().toString());
        float tich = soA * soB;
        tvKetQua.setText("Kết quả: " + tich);
    }

    public void xuLyChia(View view) {
        float soA = Float.parseFloat(edtSo1.getText().toString());
        float soB = Float.parseFloat(edtSo2.getText().toString());
        if (soB != 0) {
            float thuong = soA / soB;
            tvKetQua.setText("Kết quả: " + thuong);
        } else {
            tvKetQua.setText("Lỗi: Không thể chia cho 0!");
        }
    }
}