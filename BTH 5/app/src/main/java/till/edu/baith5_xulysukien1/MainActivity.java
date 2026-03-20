package till.edu.baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    TextView tvKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        tvKetQua = findViewById(R.id.tvKetQua);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi bấm nút cộng, nó sẽ gọi hàm xuLyCong() ở bên dưới
                xuLyCong();
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTru();
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyNhan();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChia();
            }
        });
    }

    void xuLyCong() {
        float num1 = Float.parseFloat(edtSo1.getText().toString());
        float num2 = Float.parseFloat(edtSo2.getText().toString());
        float tong = num1 + num2;
        tvKetQua.setText("Kết quả: " + tong);
    }

    void xuLyTru() {
        float num1 = Float.parseFloat(edtSo1.getText().toString());
        float num2 = Float.parseFloat(edtSo2.getText().toString());
        float hieu = num1 - num2;
        tvKetQua.setText("Kết quả: " + hieu);
    }

    void xuLyNhan() {
        float num1 = Float.parseFloat(edtSo1.getText().toString());
        float num2 = Float.parseFloat(edtSo2.getText().toString());
        float tich = num1 * num2;
        tvKetQua.setText("Kết quả: " + tich);
    }

    void xuLyChia() {
        float num1 = Float.parseFloat(edtSo1.getText().toString());
        float num2 = Float.parseFloat(edtSo2.getText().toString());
        // Bắt lỗi chia cho 0
        if (num2 != 0) {
            float thuong = num1 / num2;
            tvKetQua.setText("Kết quả: " + thuong);
        } else {
            tvKetQua.setText("Lỗi: Không thể chia cho 0!");
        }
    }
}