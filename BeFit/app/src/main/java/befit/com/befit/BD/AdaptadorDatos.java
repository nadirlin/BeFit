package befit.com.befit.BD;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import befit.com.befit.R;

/**
 * Created by Usuariopc on 31/10/2017.
 */

public class AdaptadorDatos extends RecyclerView.Adapter<AdaptadorDatos.ViewHolderDatos> implements View.OnClickListener {
    ArrayList<Dato> listaDatos;
    private View.OnClickListener listener;

    public AdaptadorDatos(ArrayList<Dato> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(v);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.dato.setText(listaDatos.get(position).getNombre());
        //holder.asignarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
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

    /*public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.idDato);
        }

        public void asignarDatos(String s) {
            dato.setText(s);
        }
    }*/

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.idDato);
        }
    }
}
