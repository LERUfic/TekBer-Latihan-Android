package me.lerufic.cobarv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterRV adapter;
    private ArrayList<Pemenang> pemenangArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pemenangArray = new ArrayList<>();
        pemenangArray.add(new Pemenang("1","China","132","92","65","289","https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png"));
        pemenangArray.add(new Pemenang("2","Japan","75","56","74","205","https://flaglane.com/download/japanese-flag/japanese-flag-graphic.png"));
        pemenangArray.add(new Pemenang("3","Republic of Korea","49","58","70","177","http://flags.fmcdn.net/data/flags/w580/kr.png"));
        pemenangArray.add(new Pemenang("4","Indonesia","31","24","43","98","https://cdn.countryflags.com/thumbs/indonesia/flag-400.png"));
        pemenangArray.add(new Pemenang("5","Uzbekistan","21","24","25","70","http://flags.fmcdn.net/data/flags/w580/uz.png"));
        pemenangArray.add(new Pemenang("6","Iran","20","20","22","62","https://cdn.countryflags.com/thumbs/iran/flag-400.png"));
        pemenangArray.add(new Pemenang("7","Chinese Taipei","17","19","31","67","https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Flag_of_the_Republic_of_China.svg/1024px-Flag_of_the_Republic_of_China.svg.png"));
        pemenangArray.add(new Pemenang("8","India","15","24","30","69","https://upload.wikimedia.org/wikipedia/commons/b/bc/Flag_of_India.png"));

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new AdapterRV(MainActivity.this,pemenangArray);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    public void changeMedals(View view){
        EditText edtID = findViewById(R.id.etID);
        EditText edtEmas = findViewById(R.id.etEmas);
        EditText edtPerak = findViewById(R.id.etPerak);
        EditText edtPerunggu = findViewById(R.id.etPerunggu);

        String index= edtID.getText().toString();
        int indexnya=Integer.parseInt(index);

        String emas_baru= edtEmas.getText().toString();
        String perak_baru= edtPerak.getText().toString();
        String perunggu_baru= edtPerunggu.getText().toString();

        int total_baru = Integer.parseInt(emas_baru) + Integer.parseInt(perak_baru) + Integer.parseInt(perunggu_baru);

        Pemenang databaru = new Pemenang(index,pemenangArray.get(indexnya-1).getNegara(),emas_baru,perak_baru,perunggu_baru,Integer.toString(total_baru),pemenangArray.get(indexnya-1).getImage());
        pemenangArray.set(indexnya-1,databaru);
        adapter.notifyItemChanged(indexnya-1);

    }
}
