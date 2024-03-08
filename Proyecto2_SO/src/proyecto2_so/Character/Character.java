/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.Character;

import proyecto2_so.Enum.CompanyEnum;
import proyecto2_so.Enum.TierEnum;

/**
 *
 * @author andre
 */
public class Character {
    
    private String name;
    private int id;
    private CompanyEnum company;
    private TierEnum tier;

    public Character(String name, int id, CompanyEnum company, TierEnum tier) {
        this.name = name;
        this.id = id;
        this.company = company;
        this.tier = tier;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the company
     */
    public CompanyEnum getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(CompanyEnum company) {
        this.company = company;
    }

    /**
     * @return the tier
     */
    public TierEnum getTier() {
        return tier;
    }

    /**
     * @param tier the tier to set
     */
    public void setTier(TierEnum tier) {
        this.tier = tier;
    }

    
    
}
