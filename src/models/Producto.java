package src.models;

import java.util.Date;

import src.models.comun.DbObject;

public class Producto extends DbObject{

	private Integer id;
	private Date created;
	private String nombre;
	private Integer precio; // 100 = 1,00
	private Integer stock;
	
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	@Override
	public String getTable() {
		return "producto";
	}
	@Override
	public String getCampos() {
		String campos = "";
		if (this.nombre != null || !this.nombre.trim().isEmpty()) {
			campos = campos + "nombre";
		}
		if (this.precio != null || this.precio<0) {
			campos = campos + "precio";
		}
		if (this.stock != null || this.stock<0) {
			campos = campos + "stock";
		}
		
		return "nombre, precio, stock";
	}
	@Override
	public String getValues() {
		return "'"+this.nombre+"','"+this.precio+"','"+this.stock+"'";		
	}
	
}
