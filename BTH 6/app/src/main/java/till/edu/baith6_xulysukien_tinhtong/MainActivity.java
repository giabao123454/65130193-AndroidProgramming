package till.edu.baith6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSoA, edtSoB;
    Button btnTinhTong;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        btnTinhTong = findViewById(R.id.btnTinhTong);
        tvKetQua = findViewById(R.id.tvKetQua);

        btnTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strA = edtSoA.getText().toString();
                String strB = edtSoB.getText().toString();

                float soA = Float.parseFloat(strA);
                float soB = Float.parseFloat(strB);
                float tong = soA + soB;

                tvKetQua.setText("Kết Quả: " + tong);
            }
        });
    }
}