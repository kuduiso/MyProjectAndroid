package id.kuduiso.dclistlaptop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLaptops;
    private ArrayList<Laptop> daftar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLaptops = findViewById(R.id.rv_laptop);
        rvLaptops.setHasFixedSize(true);

        daftar.addAll(ListLaptop.getListData());
        tampilRecyclerList();
    }

    private void tampilRecyclerList() {
        rvLaptops.setLayoutManager(new LinearLayoutManager(this));
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 