package com.example.abautista.retrofitoauth.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abautista.retrofitoauth.Model.Model;
import com.example.abautista.retrofitoauth.Model.ModelPrueba;
import com.example.abautista.retrofitoauth.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 26/03/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.itemHolder>{

    private Context context;
    private List<ModelPrueba> mList = new ArrayList<>();

    public RecyclerAdapter(Context context, List<ModelPrueba> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public itemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new itemHolder(view);
    }

    @Override
    public void onBindViewHolder(itemHolder holder, int position) {
        final ModelPrueba model = mList.get(position);
        holder.tvNombre.setText(model.getNameOwer());
        holder.tvCorreo.setText(model.getNamePet());
       // holder.Sex.setText(model.getSexoPet());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder{

        TextView tvNombre;
        TextView tvCorreo;

        public itemHolder(View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvCorreo = itemView.findViewById(R.id.tvCorreo);
        }
    }
}
