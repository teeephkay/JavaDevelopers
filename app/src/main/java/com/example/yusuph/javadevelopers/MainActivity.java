package com.example.yusuph.javadevelopers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
    private ArrayList<Profile> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create a profile elements
        arrayList.add(new Profile(
                "ahmedOpeyemi", "ahmedopeyemi","http://www.github.com/ahmedOpeyemi"
        ));
        arrayList.add(new Profile(
                "aliumujib", "aliumujib","http://www.github.com/aliumujib"
        ));
        arrayList.add(new Profile(
                "Auwalms", "auwalms","http://www.github.com/Auwalms"
        ));
        arrayList.add(new Profile(
                "IEnoobong", "ienoobong","http://www.github.com/IEnoobong"
        ));
        arrayList.add(new Profile(
                "jirevwe", "jirevwe","http://www.github.com/IEnoobong"
        ));
        arrayList.add(new Profile(
                "kingsMentor", "kingsmentor","http://www.github.com/kingsMentor"

        ));

        arrayList.add(new Profile(
                "kodejuice", "kodejuice","http://www.github.com/kodejuice"

        ));

        arrayList.add(new Profile(
                "larikraun", "larikraun","http://www.github.com/larikraun"

        ));
        arrayList.add(new Profile(
                "moyheen", "moyheen","http://www.github.com/larikraun"

        ));
        arrayList.add(new Profile(
                "Mozartted", "mozartted","http://www.github.com/Mozartted"

        ));
        arrayList.add(new Profile(
                "olumytee", "olumytee","http://www.github.com/olumytee"

        ));
        arrayList.add(new Profile(
                "oluwasayo", "oluwasayo","http://www.github.com/oluwasayo"

        ));
        arrayList.add(new Profile(
                "oreHGA", "orehga","http://www.github.com/oreHGA"

        ));
        arrayList.add(new Profile(
                "otaruMendez", "otarumendez","http://www.github.com/otaruMendez"

        ));
        arrayList.add(new Profile(
                "othreecodes", "othreecodes","http://www.github.com/othreecodes"

        ));
        arrayList.add(new Profile(
                "segunfamisa", "segunfamisa","http://www.github.com/segunfamisa"

        ));
        arrayList.add(new Profile(
                "shalvah", "shalvah","http://www.github.com/shalvah"

        ));
        arrayList.add(new Profile(
                "takwas", "takwas","http://www.github.com/takwas"

        ));
        arrayList.add(new Profile(
                "tdscientist", "tdscientist","http://www.github.com/tdscientist"

        ));
        arrayList.add(new Profile(
                "twisstosin", "twisstosin","http://www.github.com/twisstosin"

        ));
        arrayList.add(new Profile(
                "VictorAlagwu", "victoralagwu","http://www.github.com/VictorAlagwu"

        ));

        arrayList.add(new Profile(
                "aestrex", "aestrex","http://www.github.com/aestrex"
        ));
        arrayList.add(new Profile(
                "ahmedmolawale", "ahmedmolawale","http://www.github.com/ahmedmolawale"
        ));
        arrayList.add(new Profile(
                "bluman1", "bluman1","http://www.github.com/bluman1"
        ));
        arrayList.add(new Profile(
                "calistus", "calistus","http://www.github.com/calistus"
        ));
        arrayList.add(new Profile(
                "dannijax", "dannijax","http://www.github.com/dannijax"
        ));
        arrayList.add(new Profile(
                "dewunmi", "dewunmi","http://www.github.com/dewunmi"

        ));

        arrayList.add(new Profile(
                "didagu", "didagu","http://www.github.com/didagu"

        ));

        arrayList.add(new Profile(
                "efanious", "efanious","http://www.github.com/efanious"

        ));
        arrayList.add(new Profile(
                "faksam", "faksam","http://www.github.com/faksam"

        ));
        arrayList.add(new Profile(
                "ireolaniyan", "ireolaniyan","http://www.github.com/ireolaniyan"

        ));
        arrayList.add(new Profile(
                "lon-io", "lonio","http://www.github.com/lon-io"

        ));
        arrayList.add(new Profile(
                "samseen", "samseen","http://www.github.com/samseen"

        ));
        arrayList.add(new Profile(
                "segun", "segun","http://www.github.com/segun"

        ));
        arrayList.add(new Profile(
                "tomily1", "tomily1","http://www.github.com/tomily1"

        ));
        arrayList.add(new Profile(
                "zeddysoft", "zeddysoft","http://www.github.com/zeddysoft"

        ));

        arrayList.add(new Profile(
                "tonespy", "tonespy","http://www.github.com/tonespy"

        ));

        arrayList.add(new Profile(
                "cjae", "cjae","http://www.github.com/cjae"

        ));


        arrayList.add(new Profile(
                "Po10cio", "po10cio","http://www.github.com/Po10cio"

        ));
        arrayList.add(new Profile(
                "Arinzeokeke", "arinzeokeke","http://www.github.com/Arinzeokeke"

        ));

        ArrayAdapter adapter = new andelaAdapter(this,0, arrayList);
        listView = (ListView) findViewById(R.id.lisv);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long l){
            Profile profile = (Profile) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("img",profile.getImage());
                intent.putExtra("username",profile.getUsername());
                intent.putExtra("url",profile.getUrl());
                startActivity(intent);

            }
        }



        );


    }
}

///create custom adapter
class andelaAdapter extends ArrayAdapter<Profile>{

    private Context context;
    private List <Profile> arrayList;
    public andelaAdapter(Context context, int resource,ArrayList<Profile>objects){
        super(context, resource,objects);
        this.context = context;
        this.arrayList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Profile profile = arrayList.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listview, null);

        TextView username = (TextView) view.findViewById(R.id.username);
        TextView url = (TextView) view.findViewById(R.id.url);
        ImageView img = (ImageView) view.findViewById(R.id.imageV);

        username.setText(String.valueOf(profile.getUsername()));
        Integer imageId = context.getResources().getIdentifier(profile.getImage(), "drawable",context.getPackageName() );
        img.setImageResource(imageId);
        return view;

    }
}