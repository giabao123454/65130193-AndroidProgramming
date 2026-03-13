package till.edu.tinhtong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyTinhTong(View view) {

        EditText oNhapA = findViewById(R.id.edtA);
        EditText oNhapB = findViewById(R.id.edtB);

        EditText oKetQua = findViewById(R.id.editTextText2);

        String chuoiA = oNhapA.getText().toString();
        String chuoiB = oNhapB.getText().toString();

        int soA = Integer.parseInt(chuoiA);
        int soB = Integer.parseInt(chuoiB);

        int tong = soA + soB;

        oKetQua.setText(String.valueOf(tong));
    }
}// Da hoan thien chuc nang tinh tong 2 so