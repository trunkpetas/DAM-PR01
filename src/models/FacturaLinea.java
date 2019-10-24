package src.models;

import java.util.Date;

import src.models.comun.DbObject;

public class FacturaLinea extends DbObject{

	private Integer id;
	private Date created;
	private Integer id_factura;
	private String nombre;
	private Integer precio; // 100 = 1,00
	
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
	public Integer getId_factura() {
		return id_factura;
	}
	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	@Override
	public String getTable() {
		return "facturasLinea";
	}
	@Override
	public String getCampos() {
		String campos = "";
		if (this.nombre != null || !this.nombre.trim().isEmpty()) {
			campos = campos + "nombre";
		}
		if (this.id_factura != null || this.id_factura<0) {
			campos = campos + "id_factura";
		}
		if (this.precio != null || this.precio<0) {
			campos = campos + "precio";
		}
		return "nombre, id_factura, precio";
	}
	@Override
	public String getValues() {
		return "'"+this.nombre+"','"+this.id_factura+"','"+this.precio+"'";		
	}
	
	
}
