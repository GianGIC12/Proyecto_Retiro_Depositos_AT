/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class JugadorBean {

    String apellido, email;
    int idwallet;
    int idUser;
    List<D_RBean> listita;

    public JugadorBean() {

        listita = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<D_RBean> getListita() {
        return listita;
    }

    public void setListita(List<D_RBean> listita) {
        this.listita = listita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdwallet() {
        return idwallet;
    }

    public void setIdwallet(int idwallet) {
        this.idwallet = idwallet;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

}
