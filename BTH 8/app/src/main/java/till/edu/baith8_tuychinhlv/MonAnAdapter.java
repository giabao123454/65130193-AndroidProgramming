package till.edu.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.dsMonAn = dsMonAn;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_mon_an, null);
        }

        ImageView imgDaiDien = convertView.findViewById(R.id.imgDaiDien);
        TextView tvTenMon = convertView.findViewById(R.id.tvTenMon);
        TextView tvDonGia = convertView.findViewById(R.id.tvDonGia);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);

        MonAn monHienTai = dsMonAn.get(position);

        imgDaiDien.setImageResource(monHienTai.getIdAnhMinhHoa());
        tvTenMon.setText(monHienTai.getTenMon());
        tvDonGia.setText("Giá: " + monHienTai.getDonGia() + " VNĐ");
        tvMoTa.setText(monHienTai.getMoTa());

        return convertView;
    }
}