package oman.ita.com.collapsingtoolbarexample;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {
     String[] name={"image1","image2","image3","image4"};
     int [] image={R.drawable.image1,R.drawable.image2,R.drawable.image3,
     R.drawable.image3,R.drawable.image4};
    ListView list;
    ArrayList<HashMap<String,String>> arrayList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arrayList=new ArrayList<>();
        list=(ListView)findViewById(R.id.simpleListView);
        for(int i=0;i<name.length;i++){
            HashMap<String,String> map=new HashMap();
            map.put("name",name[i]);
            map.put("image",image[i]+"");
            map.put("name1",name[i]);
            map.put("image1",image[i]+"");
            arrayList.add(map);
        }
        String[] nameKey={"name","image","name1","image1"};
        int[] listItem={R.id.text1,R.id.image2,};

        SimpleAdapter adapter=new SimpleAdapter(this,
                arrayList,R.layout.list_view_item,nameKey,listItem);
        list.setAdapter(adapter);
    }
}
