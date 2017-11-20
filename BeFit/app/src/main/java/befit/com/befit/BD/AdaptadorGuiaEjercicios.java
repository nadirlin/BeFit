package befit.com.befit.BD;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import befit.com.befit.R;

/**
 * Created by Usuariopc on 29/10/2017.
 */

public class AdaptadorGuiaEjercicios extends RecyclerView.Adapter<AdaptadorGuiaEjercicios.VistaHolderGuiaEjercicios>
        implements View.OnClickListener {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    private View.OnClickListener listener;

    public AdaptadorGuiaEjercicios(ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios) {
        this.listaGuiaEjercicios = listaGuiaEjercicios;
    }

    @Override
    public VistaHolderGuiaEjercicios onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_ejercicios, null, false);
        view.setOnClickListener(this);
        return new VistaHolderGuiaEjercicios(view);
    }

    @Override
    public void onBindViewHolder(VistaHolderGuiaEjercicios holder, int position) {
        holder.nombre.setText(listaGuiaEjercicios.get(position).getNombre());
        holder.info.setText(listaGuiaEjercicios.get(position).getInfo());
        holder.imagen.setImageResource(listaGuiaEjercicios.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaGuiaEjercicios.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }
    }

    public class VistaHolderGuiaEjercicios extends RecyclerView.ViewHolder {
        TextView nombre, info;
        ImageView imagen;

        public VistaHolderGuiaEjercicios(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.idNombre);
            info = (TextView) itemView.findViewById(R.id.idInfo);
            imagen = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
