package me.lerufic.cobarv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterRV extends RecyclerView.Adapter<AdapterRV.RViewHolder>{

    private ArrayList<Pemenang> dataList;
    private Context context;

    public AdapterRV(Context context, ArrayList<Pemenang> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_pemenang, parent, false);
        return new RViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RViewHolder holder, int position) {
        holder.txtPeringkat.setText(dataList.get(position).getPeringkat());
        holder.txtNegara.setText(dataList.get(position).getNegara());
        holder.txtEmas.setText(dataList.get(position).getEmas());
        holder.txtPerak.setText(dataList.get(position).getPerak());
        holder.txtPerunggu.setText(dataList.get(position).getPerunggu());
        holder.txtTotal.setText(dataList.get(position).getTotal());
        String urlGambar = dataList.get(position).getImage();
        Glide.with(context).load(urlGambar).into(holder.imageUrl);
//        Glide.with(context).load("http://lorempixel.com/400/200/sports/1/").into(holder.imageUrl);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class RViewHolder extends RecyclerView.ViewHolder{

        private TextView txtPeringkat, txtNegara, txtEmas, txtPerak, txtPerunggu, txtTotal;
        private ImageView imageUrl;

        public RViewHolder(View itemView) {
            super(itemView);
            txtPeringkat = (TextView) itemView.findViewById(R.id.textPeringkat);
            txtNegara = (TextView) itemView.findViewById(R.id.textNegara);
            txtEmas = (TextView) itemView.findViewById(R.id.textEmas);
            txtPerak = (TextView) itemView.findViewById(R.id.textPerak);
            txtPerunggu = (TextView) itemView.findViewById(R.id.textPerunggu);
            txtTotal = (TextView) itemView.findViewById(R.id.textTotal);
            imageUrl = (ImageView) itemView.findViewById(R.id.imageFlag);
        }
    }
}
