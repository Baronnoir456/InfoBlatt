package com.lars.infoblatt;

import org.springframework.lang.NonNull;

import javax.persistence.*;


@Entity
public class InfoBlatt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String nachname;
    @Column(nullable = false)
    private String geburstag;
    @Column(nullable = false)
    private String wohnort;

    public InfoBlatt(String name, String nachname, String geburstag, String wohnort) {
        this.name = name;
        this.nachname = nachname;
        this.geburstag = geburstag;
        this.wohnort = wohnort;
    }

    public InfoBlatt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburstag() {
        return geburstag;
    }

    public void setGeburstag(String geburstag) {
        this.geburstag = geburstag;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public Long getId() {
        return id;
    }
}
