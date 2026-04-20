package till.edu.thigk2nguyenngocgiabao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang1);

        EditText edtTienVND = findViewById(R.id.edtTienVND);
        EditText edtTyGia = findViewById(R.id.edtTyGia);
        Button btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btnChuyenDoi.setOnClickListener(v -> {
            try {
                double vnd = Double.parseDouble(edtTienVND.getText().toString());
                double tyGia = Double.parseDouble(edtTyGia.getText().toString());
                double usd = vnd / tyGia;
                tvKetQua.setText("Kết quả: " + String.format("%.2f", usd) + " USD");
            } catch (Exception e) {
                tvKetQua.setText("Dữ liệu nhập không hợp lệ!");
            }
        });
    }
}