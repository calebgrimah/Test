package com.biosec.verification.model;


import javax.persistence.*;

@Entity()
public class Finger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FINGER_ID")
    private Long id;

    private int fingerIndex;
    @Lob
    private String b64fingerImage;

    public Finger() {
    }

    public Finger(int index, String b64fingerImage) {
        this.fingerIndex = index;
        this.b64fingerImage = b64fingerImage;
    }

    public int getIndex() {
        return fingerIndex;
    }

    public void setIndex(int index) {
        this.fingerIndex = index;
    }

    public String getB64fingerImage() {
        return b64fingerImage;
    }

    public void setB64fingerImage(String b64fingerImage) {
        this.b64fingerImage = b64fingerImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
