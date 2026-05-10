package till.edu.vieccanlam;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.firestore.FirebaseFirestore;

public class HomeActivity extends AppCompatActivity {

    private TextView tvTaskInfo;

    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvTaskInfo = findViewById(R.id.tvTaskInfo);

        db = FirebaseFirestore.getInstance();

        loadTaskFromFirestore();
    }

    private void loadTaskFromFirestore() {
        db.collection("tasks").document("t1")
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        String name = documentSnapshot.getString("name");
                        String message = documentSnapshot.getString("message");
                        String date = documentSnapshot.getString("date");
                        String priority = documentSnapshot.getString("priority");

                        String result = "📌 Tên việc: " + name + "\n\n" +
                                "📝 Nội dung: " + message + "\n\n" +
                                "⏰ Thời gian: " + date + "\n\n" +
                                "🔥 Mức độ: " + priority;

                        tvTaskInfo.setText(result);
                    } else {
                        tvTaskInfo.setText("Không tìm thấy tài liệu t1!");
                    }
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(HomeActivity.this, "Lỗi tải dữ liệu!", Toast.LENGTH_SHORT).show();
                    tvTaskInfo.setText("Lỗi: " + e.getMessage());
                });
    }
}