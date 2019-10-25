package src.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import src.models.comun.DbObject;

public class Categoria extends DbObject {

	private Integer id;
	private Date created;
	private String nombre;
	
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
	
	
	@Override
	public String getTable() {
		
		return "categorias";
	}
	@Override
	public String getCampos() {
		String campos = "";
		if (this.nombre != null || !this.nombre.trim().isEmpty()) {
			campos = campos + "nombre";
		}
		return "nombre";
	}
	@Override
	public String getValues() {
		return "'"+this.nombre+"'";				
	}
	
	
	
}
