/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author user
 */
public class D_RBean {

    String fechaR;
    String fechaD;
    float depositos;
    float retiros;

    public D_RBean() {

        depositos = 0.0f;
        retiros = 0.0f;

    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getFechaD() {
        return fechaD;
    }

    public void setFechaD(String fechaD) {
        this.fechaD = fechaD;
    }

    public float getDepositos() {
        return depositos;
    }

    public void setDepositos(float depositos) {
        this.depositos = depositos;
    }

    public float getRetiros() {
        return retiros;
    }

    public void setRetiros(float retiros) {
        this.retiros = retiros;
    }

}
