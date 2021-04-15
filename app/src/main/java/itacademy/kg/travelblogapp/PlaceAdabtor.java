package itacademy.kg.travelblogapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlaceAdabtor extends RecyclerView.Adapter<PlaceAdabtor.PlaceHolder> {


    public static class PlaceHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name, discription;

        public PlaceHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            discription = itemView.findViewById(R.id.dictionery);

        }
    }

    ArrayList<Dictionery> dictioneries;

    PlaceAdabtor(ArrayList<Dictionery> dictioneries) {
        this.dictioneries = dictioneries;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itam, parent, false);
        return new PlaceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {
        Dictionery dictionery = dictioneries.get(position);
        holder.imageView.setImageResource(dictionery.getImage());
        holder.name.setText(dictionery.getName());
        holder.discription.setText(dictionery.getDictionery());
    }

    @Override
    public int getItemCount() {
        return dictioneries.size();
    }


}
