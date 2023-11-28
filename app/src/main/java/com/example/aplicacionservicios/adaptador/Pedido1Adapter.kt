package com.example.aplicacionservicios.adaptador

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionservicios.Pedido1EditarActivity
import com.example.aplicacionservicios.R
import com.example.aplicacionservicios.entidad.ServicioTecnico
import com.example.aplicacionservicios.utils.appConfig

class Pedido1Adapter(var data:ArrayList<ServicioTecnico>): RecyclerView.Adapter<ViewPedido1>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPedido1 {
        //inflar
        var vista= LayoutInflater.from(parent.context).inflate(R.layout.pedido1_item,parent,false)
        return ViewPedido1(vista)
    }
    override fun getItemCount(): Int {
        return data.size
    }
    //2
    override fun onBindViewHolder(holder: ViewPedido1, position: Int) {
        holder.tvPed1Codigo.text=data.get(position).codigoServicioTec.toString()
        holder.tvPed1Cliente.text=data.get(position).nombreCliente
        //holder.tvPed1TecnicoTipo.text=data.get(position).codigoTipo.toString()
        holder.tvPed1Direccion.text=data.get(position).direccionCliente
        //contexto de ViewDocente
        var contexto: Context =holder.itemView.context
        /*
        holder.itemView.setOnClickListener{
            var intent = Intent(appConfig.CONTEXT, Pedido1EditarActivity::class.java)
            intent.putExtra("servicioTecnico",data.get(position))
            ContextCompat.startActivity(appConfig.CONTEXT, intent, null)
        }*/
    }
}
