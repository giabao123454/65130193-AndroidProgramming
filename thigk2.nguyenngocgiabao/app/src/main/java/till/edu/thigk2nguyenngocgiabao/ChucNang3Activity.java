package till.edu.thigk2nguyenngocgiabao;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ChucNang3Activity extends AppCompatActivity {

    class DanhNhan {
        int hinhAnh;
        String ten;
        String queQuan;

        public DanhNhan(int hinhAnh, String ten, String queQuan) {
            this.hinhAnh = hinhAnh;
            this.ten = ten;
            this.queQuan = queQuan;
        }
    }

    class DanhNhanAdapter extends ArrayAdapter<DanhNhan> {
        public DanhNhanAdapter(Context context, List<DanhNhan> objects) {
            super(context, 0, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_danhnhan, parent, false);
            }

            DanhNhan dn = getItem(position);
            ImageView img = convertView.findViewById(R.id.imgAnh);
            TextView txtTen = convertView.findViewById(R.id.tvTen);
            TextView txtQue = convertView.findViewById(R.id.tvQue);

            img.setImageResource(dn.hinhAnh);
            txtTen.setText(dn.ten);
            txtQue.setText(dn.queQuan);

            return convertView;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        ListView lvDanhNhan = findViewById(R.id.lvDanhNhan);
        List<DanhNhan> danhSach = new ArrayList<>();

        danhSach.add(new DanhNhan(R.drawable.hcm, "Hồ Chí Minh", "Nghệ An"));
        danhSach.add(new DanhNhan(R.drawable.giap, "Võ Nguyên Giáp", "Quảng Bình"));
        danhSach.add(new DanhNhan(R.drawable.hungdao, "Trần Hưng Đạo", "Nam Định"));
        danhSach.add(new DanhNhan(R.drawable.nguuyenhue, "Nguyễn Huệ", "Bình Định"));
        danhSach.add(new DanhNhan(R.drawable.haibatrung, "Hai Bà Trưng", "Hà Nội"));

        DanhNhanAdapter adapter = new DanhNhanAdapter(this, danhSach);
        lvDanhNhan.setAdapter(adapter);
    }
}