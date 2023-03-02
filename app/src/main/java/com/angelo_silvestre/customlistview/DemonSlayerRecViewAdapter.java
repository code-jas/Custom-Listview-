package com.angelo_silvestre.customlistview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class DemonSlayerRecViewAdapter  extends RecyclerView.Adapter<DemonSlayerRecViewAdapter.ViewHolder> {
    // Attributes
    private ArrayList<DemonSlayerCharacters> characters = new ArrayList<>();
    private Context context;
    public DemonSlayerRecViewAdapter(Context context) { this.context = context; }


    // Getter and Setter
    public ArrayList<DemonSlayerCharacters> getCharacters() {
        return characters;
    }
    public void setCharacters(ArrayList<DemonSlayerCharacters> characters) {
        this.characters = characters;
        notifyDataSetChanged();
    }

    private static String passName = "";
    private static String passCharacter = "";
    private static int passimageUrlCover;
    private static String passimageUrlPoster = "";
    private static String passDescription = "";


    // Call ViewHolder methods
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.characterName.setText(characters.get(position).getName());
        holder.character_role.setText(characters.get(position).getCharacter());
        holder.parentCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, characters.get(position).getName() + "", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        setPassName(String.valueOf(characters.get(position).getName()));
                        setPassCharacter(String.valueOf(characters.get(position).getCharacter()));
                        setPassimageUrlCover(characters.get(position).getImageFromDrawable(context));
                        setPassimageUrlPoster(String.valueOf(characters.get(position).getImageUrlPoster()));
                        setPassDescription(String.valueOf(characters.get(position).getShortDesc()));


                        Intent intent = new Intent(context, AnimeCharacterDetails.class);
                        context.startActivity(intent);

                        ((Activity) context).finish();

                    }
                }, 1);
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(characters.get(position).getImageFromDrawable(context))
                .into(holder.posterImage);

    }


    @Override
    public int getItemCount() {
        return characters.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView characterName, character_role;
        private CardView parentCardView;
        private ImageView posterImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            characterName = itemView.findViewById(R.id.character_name);
            character_role = itemView.findViewById(R.id.character_role);
            parentCardView = itemView.findViewById(R.id.cardview_parent);
            posterImage = itemView.findViewById(R.id.cover_image);
        }
    }






    public static String getPassName() {
        return passName;
    }

    public static void setPassName(String passName) {
        DemonSlayerRecViewAdapter.passName = passName;
    }

    public static String getPassCharacter() {
        return passCharacter;
    }

    public static void setPassCharacter(String passCharacter) {
        DemonSlayerRecViewAdapter.passCharacter = passCharacter;
    }

    public static int getPassimageUrlCover() {
        return passimageUrlCover;
    }

    public static void setPassimageUrlCover(int passimageUrlCover) {
        DemonSlayerRecViewAdapter.passimageUrlCover = passimageUrlCover;
    }

    public static String getPassimageUrlPoster() {
        return passimageUrlPoster;
    }

    public static void setPassimageUrlPoster(String passimageUrlPoster) {
        DemonSlayerRecViewAdapter.passimageUrlPoster = passimageUrlPoster;
    }

    public static String getPassDescription() {
        return passDescription;
    }

    public static void setPassDescription(String passDescription) {
        DemonSlayerRecViewAdapter.passDescription = passDescription;
    }


}
