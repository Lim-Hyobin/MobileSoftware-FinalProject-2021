package com.course.finalproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BottomActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_recycler);

        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);


        ArrayList<Item> itemsInfo = new ArrayList<>();

        itemsInfo.add(new Item("이지 플리스 조거 팬츠", R.drawable.swoosh, R.drawable.swoosh2, 75000, "반전 스우시와 최상의 편안함", "https://www.nike.com/kr/ko_kr/t/women/ap/nike-sportswear/DD5583-206/cgzn49/as-w-nsw-swsh-flc-gx-mr-jggr"));
        itemsInfo.add(new Item("하이웨스트 레깅스", R.drawable.leggings, R.drawable.leggings2, 49000, "절대적으로 필요한 아이템", "https://www.nike.com/kr/ko_kr/t/women/ap/nike-sportswear/CZ8529-690/himj82/as-w-nsw-essntl-gx-hr-lggng-ft"));
        itemsInfo.add(new Item("검정 팬츠", R.drawable.pants, R.drawable.pants2, 65000, "클래식한 편안함", "https://www.nike.com/kr/ko_kr/t/men/ap/nike-sportswear/BV2708-010/ymks82/as-m-nsw-club-pant-oh-bb"));
        itemsInfo.add(new Item("플라이트 수트", R.drawable.suit, R.drawable.suit2, 165000, "헤리티지로 떠나다.", "https://www.nike.com/kr/ko_kr/t/women/ap/basketball/DJ2627-636/ivwx21/as-w-j-essen-flightsuit"));
        itemsInfo.add(new Item("미드라이즈 프린트 레깅스", R.drawable.leopard, R.drawable.leopard2, 69000, "어디에서든 활용 가능한 하나의 아이템", "https://www.nike.com/kr/ko_kr/t/women/ap/women-training/DD5474-256/todm89/as-w-nk-one-df-gltr-lprd-mr-t"));

        MyAdapter myAdapter = new MyAdapter(itemsInfo);
        myRecyclerView.setAdapter(myAdapter);
    }

}
