package duyydang.ldd.listviewup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayList;
    TraiCayAdapter traiCayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        traiCayAdapter = new TraiCayAdapter(this,R.layout.item_traicay,arrayList);
        lvTraiCay.setAdapter(traiCayAdapter);

    }
    private void AnhXa(){
        lvTraiCay = (ListView) findViewById(R.id.listViewTraiCay);
        arrayList = new ArrayList<>();

        arrayList.add(new TraiCay("Chuối","Chuối Quảng Bình",R.drawable.chuoi));
        arrayList.add(new TraiCay("Cà chua","Cà chua Đà Nẵng",R.drawable.cachua));
        arrayList.add(new TraiCay("Táo","Táo ngon",R.drawable.tao));
        arrayList.add(new TraiCay("Xoày","Xoài cực ngọt",R.drawable.xoai));
    }
}