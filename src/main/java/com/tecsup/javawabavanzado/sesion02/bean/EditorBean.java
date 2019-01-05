package com.tecsup.javawabavanzado.sesion02.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *  Ejemplo de ManagedBean
 *
 */
@ManagedBean(name = "miBean")
@RequestScoped
public class EditorBean {

	private String comentarios;

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String grabar() {
		System.out.println("grabando: " + comentarios);
		return "test";
	}
}
 
