package till.edu.baith9_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandscapeHolder> {

    private Context context;
    private ArrayList<Landscape> lstData;
    private LayoutInflater inflater;

    public LandscapeAdapter(Context context, ArrayList<Landscape> lstData) {
        this.context = context;
        this.lstData = lstData;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemLandscapeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = inflater.inflate(R.layout.item_landscape, parent, false);
        return new ItemLandscapeHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandscapeHolder holder, int position) {

        Landscape landscape = lstData.get(position);

        holder.tvCaption.setText(landscape.getLandscapeCaption());

        String packageName = holder.itemView.getContext().getPackageName();
        String imageName = landscape.getImageFileName();
        int imageId = holder.itemView.getResources().getIdentifier(imageName, "mipmap", packageName);

        holder.ivLandscape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandscapeHolder extends RecyclerView.ViewHolder {
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandscapeHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLandscape);
        }
    }
}