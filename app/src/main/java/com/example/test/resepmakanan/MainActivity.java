package com.example.test.resepmakanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
        inputData("Ayam Bakar Bumbu Bali","Rartikel_1.html");
        inputData("Sate Ayam Srepeh","Rartikel_2.html");
        inputData("Pizza Sosis Mozarella Nikmat","Rartikel_3.html");
        inputData("Rendang","Rartikel_4.html");
        inputData("Soto Mie Bogor","Rartikel_5.html");
        inputData("Sate Padang","Rartikel_6.html");
        inputData("Sop Iga Sapi Enak Sedep Banget","Rartikel_7.html");
        inputData("Opor Ayam Kampung","Rartikel_8.html");
        inputData("Bebek Goreng Sambel Ijo","Rartikel_9.html");
        inputData("Ayam Geprek Sajiku","Rartikel_10.html");
        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}