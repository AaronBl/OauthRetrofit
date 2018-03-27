package com.example.abautista.retrofitoauth.Model;

/**
 * Created by abautista on 2/26/2018.
 */

public class ModelPrueba {
    private String NamePet;
    private String NameOwer;
    private String SexoPet;
    private String tipoMascota;

    public ModelPrueba(String namePet, String nameOwer, String sexoPet, String tipoMascota) {
       this.NamePet = namePet;
        this.NameOwer = nameOwer;
        this.SexoPet = sexoPet;
        this.tipoMascota = tipoMascota;
    }

    public String getNamePet() {
        return NamePet;
    }

    public void setNamePet(String namePet) {
        NamePet = namePet;
    }

    public String getNameOwer() {
        return NameOwer;
    }

    public void setNameOwer(String nameOwer) {
        NameOwer = nameOwer;
    }

    public String getSexoPet() {
        return SexoPet;
    }

    public void setSexoPet(String sexoPet) {
        SexoPet = sexoPet;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
}
