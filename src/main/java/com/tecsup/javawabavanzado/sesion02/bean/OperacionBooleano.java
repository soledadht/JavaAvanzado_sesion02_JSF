package com.tecsup.javawabavanzado.sesion02.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "operacionBooleano")
@SessionScoped
public class OperacionBooleano {

	public double opeA;
	public double opeB;
	public String operacion;
	public double total;

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String calcular() {
		if("or".equals(operacion)) {
			total = opeA + opeB;
		} else if("res".equals(operacion)) {
			total = opeA - opeB;
		} else if("mul".equals(operacion)) {
			total = opeA * opeB;
		} else {
			total = opeA / opeB;
		}
		return "calculadora";
	}

	public double getOpeA() {
		return opeA;
	}

	public void setOpeA(double opeA) {
		this.opeA = opeA;
	}

	public double getOpeB() {
		return opeB;
	}

	public void setOpeB(double opeB) {
		this.opeB = opeB;
	}


}
