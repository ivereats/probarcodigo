package ni.uca.edu.procesamientojsoniverson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ni.uca.edu.procesamientojsoniverson.databinding.CardviewCoordBinding

class CoordinadorAdapter(private val coordinadores: List<Coordinador>) :
    RecyclerView.Adapter<CoordinadorAdapter.CoordinadorViewHolder>() {

    inner class CoordinadorViewHolder(private val binding: CardviewCoordBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(coordinador: Coordinador) {
            binding.tvNombres.text = coordinador.nombres
            binding.tvApellidos.text = coordinador.apellidos
            binding.tvFechaNac.text = coordinador.fechaNac
            binding.tvTitulo.text = coordinador.titulo
            binding.tvEmail.text = coordinador.email
            binding.tvFacultad.text = coordinador.facultad
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
        val binding = CardviewCoordBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoordinadorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
        holder.bind(coordinadores[position])
    }

    override fun getItemCount(): Int {
        return coordinadores.size
    }
}