package com.example.steven.connect3plus.Model;

public class Society {
    private String SocietyId;
    private String SocietyName;
    private String SocietyCategory;
    private String SocietyDesc;

    public Society(String societyId, String societyName, String societyCategory, String societyDesc) {
        SocietyId = societyId;
        SocietyName = societyName;
        SocietyCategory = societyCategory;
        SocietyDesc = societyDesc;
    }

    public String getSocietyId() {
        return SocietyId;
    }

    public void setSocietyId(String societyId) {
        SocietyId = societyId;
    }

    public String getSocietyName() {
        return SocietyName;
    }

    public void setSocietyName(String societyName) {
        SocietyName = societyName;
    }

    public String getSocietyCategory() {
        return SocietyCategory;
    }

    public void setSocietyCategory(String societyCategory) {
        SocietyCategory = societyCategory;
    }

    public String getSocietyDesc() {
        return SocietyDesc;
    }

    public void setSocietyDesc(String societyDesc) {
        SocietyDesc = societyDesc;
    }
}
