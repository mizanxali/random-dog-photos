package com.example.randomdogpics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView breedsListView;
    ArrayList<String> breeds;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breedsListView = (ListView)findViewById(R.id.breedsListView);
        breeds = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, breeds);

        breeds.add("affenpinscher");
        breeds.add("african");
        breeds.add("airedale");
        breeds.add("akita");
        breeds.add("appenzeller");
        breeds.add("australian");
        breeds.add("basenji");
        breeds.add("beagle");
        breeds.add("bluetick");
        breeds.add("borzoi");
        breeds.add("bouvier");
        breeds.add("boxer");
        breeds.add("brabancon");
        breeds.add("briard");
        breeds.add("buhund");
        breeds.add("bulldog");
        breeds.add("bullterrier");
        breeds.add("cairn");
        breeds.add("cattledog");
        breeds.add("chihuahua");
        breeds.add("chow");
        breeds.add("clumber");
        breeds.add("cockapoo");
        breeds.add("collie-border");
        breeds.add("coonhound");
        breeds.add("corgi");
        breeds.add("cotondetulear");
        breeds.add("dachshund");
        breeds.add("dalmatian");
        breeds.add("dane-great");
        breeds.add("deerhound");
        breeds.add("dhole");
        breeds.add("dingo");
        breeds.add("doberman");
        breeds.add("elkhound");
        breeds.add("entlebucher");
        breeds.add("eskimo");
        breeds.add("finnish");
        breeds.add("frise");
        breeds.add("germanshepherd");
        breeds.add("greyhound");
        breeds.add("groenendael");
        breeds.add("havanese");
        breeds.add("hound");
        breeds.add("husky");
        breeds.add("keeshond");
        breeds.add("kelpie");
        breeds.add("komondor");
        breeds.add("kuvasz");
        breeds.add("labrador");
        breeds.add("leonberg");
        breeds.add("lhasa");
        breeds.add("malamute");
        breeds.add("malinois");
        breeds.add("maltese");
        breeds.add("mastiff");
        breeds.add("mexicanhairless");
        breeds.add("mix");
        breeds.add("mountain");
        breeds.add("newfoundland");
        breeds.add("otterhound");
        breeds.add("ovcharka");
        breeds.add("papillon");
        breeds.add("pekinese");
        breeds.add("pembroke");
        breeds.add("pinscher");
        breeds.add("pitbull");
        breeds.add("pointer");
        breeds.add("pomeranian");
        breeds.add("poodle");
        breeds.add("poodle-toy");
        breeds.add("pug");
        breeds.add("puggle");
        breeds.add("pyrenees");
        breeds.add("redbone");
        breeds.add("retriever");
        breeds.add("ridgeback");
        breeds.add("rottweiler");
        breeds.add("saluki");
        breeds.add("samoyed");
        breeds.add("schipperke");
        breeds.add("schnauzer");
        breeds.add("setter");
        breeds.add("sheepdog");
        breeds.add("shiba");
        breeds.add("shihtzu");
        breeds.add("spaniel");
        breeds.add("springer");
        breeds.add("stbernard");
        breeds.add("terrier");
        breeds.add("vizsla");
        breeds.add("waterdog");
        breeds.add("weimaraner");
        breeds.add("whippet");
        breeds.add("wolfhound");

        breedsListView.setAdapter(adapter);

        breedsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DogActivity.class);
                intent.putExtra("breed", breeds.get(position));
                startActivity(intent);
            }
        });
    }
}
