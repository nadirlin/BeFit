package befit.com.befit.BD;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import befit.com.befit.R;

/**
 * Created by Usuariopc on 6/11/2017.
 */

public class AdaptadorPerfilDatos extends RecyclerView.Adapter<AdaptadorPerfilDatos.VistaHolderPerfilDatos>
{
    ArrayList<PerfilRealm> listaPerfil;

    public AdaptadorPerfilDatos(ArrayList<PerfilRealm> listaPerfil) {
        this.listaPerfil = listaPerfil;
    }

    @Override
    public AdaptadorPerfilDatos.VistaHolderPerfilDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_perfil, null, false);
        //view.setOnClickListener(this);
        return new VistaHolderPerfilDatos(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorPerfilDatos.VistaHolderPerfilDatos holder, int position) {
        holder.nombre.setText("Fecha: "+ listaPerfil.get(position).getNombre());
        holder.peso.setText("Peso: "+String.valueOf(listaPerfil.get(position).getPeso()));
        holder.estatura.setText("Cintura: "+ String.valueOf(listaPerfil.get(position).getEstatura()));
        holder.edad.setText("Biceps: "+ String.valueOf(listaPerfil.get(position).getEdad()));

        /*holder.fecha.setText(listaPerfil.get(position).getFecha());
        holder.peso.setText(listaPerfil.get(position).getPeso());
        holder.pecho.setText(listaPerfil.get(position).getPecho());
        holder.cintura.setText(listaPerfil.get(position).getCintura());
        holder.cadera.setText(listaPerfil.get(position).getCadera());
        holder.muslo.setText(listaPerfil.get(position).getMuslo());
        holder.pantorrilla.setText(listaPerfil.get(position).getPantorrilla());
        holder.biceps.setText(listaPerfil.get(position).getBiceps());*/
    }

    @Override
    public int getItemCount() {
        return listaPerfil.size();
    }

    public class VistaHolderPerfilDatos extends RecyclerView.ViewHolder {
        //TextView nombre, fecha, peso, pecho, cintura, cadera, muslo, pantorrilla, biceps;
        TextView nombre, peso, estatura, edad;
        public VistaHolderPerfilDatos(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.txt_nombre);
            peso = (TextView) itemView.findViewById(R.id.txt_peso);
            estatura = (TextView) itemView.findViewById(R.id.txt_estatura);
            edad = (TextView) itemView.findViewById(R.id.txt_edad);
            /*fecha = (TextView) itemView.findViewById(R.id.txt_fecha);
            peso = (TextView) itemView.findViewById(R.id.txt_peso);
            pecho = (TextView) itemView.findViewById(R.id.txt_pecho);
            cintura = (TextView) itemView.findViewById(R.id.txt_cintura);
            cadera = (TextView) itemView.findViewById(R.id.txt_cadera);
            muslo = (TextView) itemView.findViewById(R.id.txt_muslos);
            pantorrilla = (TextView) itemView.findViewById(R.id.txt_pantorrillas);
            biceps = (TextView) itemView.findViewById(R.id.txt_biceps);*/
        }
    }
}
