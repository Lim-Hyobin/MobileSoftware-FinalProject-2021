package com.course.finalproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopActivity extends AppCompatActivity {

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
        itemsInfo.add(new Item("여성 오버사이즈 플리스 크루", R.drawable.sweatshirt, R.drawable.sweatshirt2, 69000, "스우시 자수가 있는 오버사이즈 핏", "https://www.nike.com/kr/ko_kr/t/women/ap/nike-sportswear/DJ7666-010/jqhm15/aswnsw-essntl-clctn-flc-os-crw"));
        itemsInfo.add(new Item("여성 플리스 트레이닝 후디", R.drawable.hoodie, R.drawable.hoodie2, 79000, "움직임이 여유로운 따뚯한 레이어", "https://www.nike.com/kr/ko_kr/t/women/ap/women-training/DD6465-010/sktz10/as-w-nk-tf-hbr-grx-al-tm-fc-po"));
        itemsInfo.add(new Item("여성 우븐 재킷", R.drawable.outer, R.drawable.outer2, 139000, "격렬한 날씨에 대한 강력한 방어", "https://www.nike.com/kr/ko_kr/t/women/ap/nike-sportswear/DD5585-010/vqgh71/as-w-nsw-rpl-swsh-wvn-gx-jkt"));
        itemsInfo.add(new Item("남성 합성 충전재 축구 재킷", R.drawable.jacket, R.drawable.jacket2, 179000, "비바람을 이기다.", "https://www.nike.com/kr/ko_kr/t/men/ap/football-soccer/CW6156-010/guch64/m-nk-syn-fl-rpl-park20-sdf-jkt"));
        itemsInfo.add(new Item("여성 패딩 자켓", R.drawable.padding, R.drawable.padding2,279000, "추운 날씨를 위한 포근한 솔루션", "https://www.nike.com/kr/ko_kr/t/women/ap/nike-sportswear/DH4080-010/jafr95/as-w-nsw-tf-city-jkt"));

        MyAdapter myAdapter = new MyAdapter(itemsInfo);
        myRecyclerView.setAdapter(myAdapter);

    }
}
