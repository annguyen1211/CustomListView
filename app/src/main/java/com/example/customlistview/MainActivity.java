package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    Button add_btn, fix_btn, del_btn;
    EditText mh_edt;
    int vitri = -1;

    ArrayList<Monhoc> monhoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonHoc = findViewById(R.id.lvMonHoc);
        add_btn = findViewById(R.id.add_btn);
        fix_btn = findViewById(R.id.fix_btn);
        del_btn = findViewById(R.id.del_btn);
        mh_edt = findViewById(R.id.mh_edt);


        monhoc = new ArrayList<>();
        Monhoc mh1 = new Monhoc(R.drawable.ic_android_black_24dp, "LAP TRINH ANDROID", 3);
        monhoc.add(mh1);
        Monhoc mh2 = new Monhoc(R.drawable.ic_android_black_24dp, "LAP TRINH WINDOW", 3);
        monhoc.add(mh2);
        Monhoc mh3 = new Monhoc(R.drawable.ic_android_black_24dp, "LAP TRINH IOS", 3);
        monhoc.add(mh3);
        Monhoc mh4 = new Monhoc(R.drawable.ic_baseline_videogame_asset_24, "LAP TRINH GAME", 3);
        monhoc.add(mh4);

        MyAdapter adapter = new MyAdapter(MainActivity.this, monhoc);
        lvMonHoc.setAdapter(adapter);


        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mh_edt.getText().toString();
                monhoc.add(mh1);
                adapter.notifyDataSetChanged();
            }
        });


//        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, monhoc.get(i), Toast.LENGTH_SHORT).show();
//                mh_edt.setText(monhoc.get(i));
//                vitri =i;
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra("MONHOC",monhoc.get(i));
//                startActivity(intent);
//
//            }
//        });
//        del_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                monhoc.remove(vitri);
//                adapter.notifyDataSetChanged();
//
//            }
//        });
//
//
//        fix_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                monhoc.set(vitri, mh_edt.getText().toString());
//                adapter.notifyDataSetChanged();
//                Toast.makeText(MainActivity.this, "Sửa Thành Công", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//
//        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//                monhoc.remove(i);
//                adapter.notifyDataSetChanged();
//                return false;
//            }
//        });
//
//    }
        //   }
    }
}