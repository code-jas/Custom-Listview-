package com.angelo_silvestre.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "MainActivity";

    private RecyclerView demonslayersRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the RecyclerView instance layout
        demonslayersRecyclerView = findViewById(R.id.demonslayer_recycler_view);

        // List for the demonslayers data
        ArrayList<DemonSlayerCharacters> demonslayers = new ArrayList<>();

        demonslayers.add(new DemonSlayerCharacters(
                "Tanjiro",
                "Demon Slayer",
                "cover_tanjiro",
                "poster_tanjiro",
                "Tanjiro Kamado is the protagonist of Demon Slayer: Kimetsu no Yaiba. He is a Demon Slayer in the Demon Slayer Corps, who joined to find a remedy to turn his sister, Nezuko Kamado, back into a human and to hunt down and kill demons, and later swore to defeat Muzan Kibutsuji, the King of Demons, in order to prevent others from suffering the same fate as him."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Nezuko",
                "Demon",
                "cover_nezuko",
                "poster_nezuko",
                "Nezuko Kamado is the deuteragonist of Demon Slayer: Kimetsu no Yaiba. She is a demon and the younger sister of Tanjiro Kamado and one of the two remaining members of the Kamado family. Formerly a human, she was attacked and transformed into a demon by Muzan Kibutsuji."

        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Zenitsu",
                "Demon Slayer",
                "cover_zenitsu",
                "poster_zenitsu",
                "Zenitsu Agatsuma is one of the main protagonists of Demon Slayer: Kimetsu no Yaiba and along with Inosuke Hashibira, a travelling companion of Tanjiro Kamado and Nezuko Kamado. He is also a Demon Slayer in the Demon Slayer Corps."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Inosuke",
                "Demon Slayer",
                "cover_inosuke",
                "poster_inosuke",
                "Inosuke Hashibira  is one of the main protagonists of Demon Slayer: Kimetsu no Yaiba and along with Zenitsu Agatsuma, a traveling companion of Tanjiro Kamado and Nezuko Kamado. He is also a Demon Slayer in the Demon Slayer Corps."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Giyu",
                "Hashira/Demon Slayer",
                "cover_giyu",
                "poster_giyu",
                "Giyu Tomioka is a major supporting character of Demon Slayer: Kimetsu no Yaiba. He is a Demon Slayer of the Demon Slayer Corps and the current Water Hashira (水みず柱ばしら Mizu Bashira?)."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Kyojuro",
                "Hashira/Demon Slayer",
                "cover_kyojuro",
                "poster_kyojuro",
                "Kyojuro Rengoku  was a major supporting character of Demon Slayer: Kimetsu no Yaiba and a major character in the Mugen Train Arc. He was a Demon Slayer of the Demon Slayer Corps and the late Flame Hashira (炎えん柱ばしら En Bashira?)."

        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Uzui",
                "Hashira/Demon Slayer",
                "cover_uzui",
                "poster_uzui",
                "Tengen Uzui (宇う髄ずい 天てん元げん Uzui Tengen?) is a major supporting character of Demon Slayer: Kimetsu no Yaiba and a major character in the Entertainment District Arc. He was a former member of the Demon Slayer Corps, standing as the previous Sound Hashira (音おと柱ばしら Oto Bashira?).[4]"
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Shinobu",
                "Hashira/Demon Slayer",
                "cover_shinobu",
                "poster_shinobu",
                "Shinobu Kocho (胡こ蝶ちょう しのぶ Kochō Shinobu?) is a major supporting character of Demon Slayer: Kimetsu no Yaiba. She is a Demon Slayer of the Demon Slayer Corps and the current Insect Hashira (蟲むし柱ばしら Mushi Bashira?)."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Muzan",
                "Demon (Preginator)",
                "cover_muzan",
                "poster_muzan",
                "Muzan Kibutsuj is the main antagonist of Demon Slayer: Kimetsu no Yaiba. He is the Demon King, the first of his kind, as well as the progenitor of all other demons in existence. Muzan is also the leader of the Twelve Kizuki, an organization of the twelve strongest demons in existence that serve directly under him."
        ));
        demonslayers.add(new DemonSlayerCharacters(
                "Zoro",
                "Pirate",
                "cover_zoro",
                "poster_zoro",
                "Lost"
        ));

        DemonSlayerRecViewAdapter adapter = new DemonSlayerRecViewAdapter(this);
        adapter.setCharacters(demonslayers);

        demonslayersRecyclerView.setAdapter(adapter);
        demonslayersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Log.d(Tag, "Display List: " + Arrays.toString(demonslayers.toArray()));

    }
}