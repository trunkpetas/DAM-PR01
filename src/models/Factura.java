package src.models;

import java.util.Date;

import src.models.comun.DbObject;

public class Factura extends DbObject{

	private Integer id;
	private Date created;
	private Date fecha;
	private Integer serie;
	private Integer id_cliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getSerie() {
		return serie;
	}
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	@Override
	public String getTable() {
		
		return "facturas";
	}
	@Override
	public String getCampos() {
		String campos = "";
		if (this.fecha != null || !this.fecha.toString().trim().isEmpty()) {
			campos = campos + "fecha";
		}
		if (this.id_cliente != null || this.id_cliente<0) {
			campos = campos + "id_cliente";
		}
		if (this.serie != null || this.serie<0) {
			campos = campos + "serie";
		}
		return "fecha,id_cliente,serie";
	}
	@Override
	public String getValues() {
		return "'"+this.fecha+"'"+ this.id_cliente +"'"+ this.serie +"'";				
	}
	
	
}