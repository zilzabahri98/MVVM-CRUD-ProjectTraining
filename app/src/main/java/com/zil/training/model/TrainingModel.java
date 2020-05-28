package com.zil.training.model;

import com.google.gson.annotations.SerializedName;

public class TrainingModel {

    @SerializedName("id_training")
    private String idTraining;

    @SerializedName("kode_training")
    private String kodeTraining;

    @SerializedName("nama_training")
    private String namaTraining;

    @SerializedName("type_training")
    private String typeTraining;

    @SerializedName("jumlah_training")
    private String jumlahTraining;

    @SerializedName("harga_training")
    private String hargaTraining;

    @SerializedName("tanggal_training")
    private String tanggalTraining;

    @SerializedName("gambar_training")
    private String gambarTraining;

    @SerializedName("status_training")
    private String statusTraining;

    public String getStatusTraining() { return statusTraining; }
    public void setStatusTraining(String statusTraining) { this.statusTraining = statusTraining; }

    public String getIdTraining() { return idTraining; }
    public void setIdTraining(String idTraining) { this.idTraining = idTraining; }

    public String getKodeTraining() { return kodeTraining; }
    public void setKodeTraining(String kodeTraining) { this.kodeTraining = kodeTraining; }

    public String getNamaTraining() { return namaTraining; }
    public void setNamaTraining(String namaTraining) { this.namaTraining = namaTraining; }

    public String getTypeTraining() { return typeTraining; }
    public void setTypeTraining(String typeTraining) { this.typeTraining = typeTraining;}

    public String getJumlahTraining() { return jumlahTraining; }
    public void setJumlahTraining(String jumlahTraining) { this.jumlahTraining = jumlahTraining;}

    public String getHargaTraining() { return  hargaTraining; }
    public void setHargaTraining(String hargaTraining) { this.hargaTraining = hargaTraining;}

    public String getTanggalTraining() { return tanggalTraining; }
    public void setTanggalTraining(String tanggalTraining) { this.tanggalTraining = tanggalTraining;}

    public String getGambarTraining() { return gambarTraining; }
    public void setGambarTraining(String gambarTraining) { this.gambarTraining = gambarTraining;}
}
