/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.Character;

import proyecto2_so.Enum.CompanyEnum;
import proyecto2_so.Enum.TierEnum;
import proyecto2_so.Enum.TypeEnum;

/**
 *
 * @author andre
 */
public class Character {
    
    private String name;
    private int id;
    private CompanyEnum company;
    private TierEnum tier;
    private TypeEnum type;

    public Character(String name, int id, CompanyEnum company) {
        this.name = name;
        this.id = id;
        this.company = company;
        //define su tipo 
        boolean[] type = new boolean[4];
        double[] base = {0.7,0.6,0.5,0.4};
        double prob;
        for (int i = 0; i < 4; i++) {
            prob = Math.random();
            type[i] = (prob<=base[i])? true : false;
        }
        if(type[2]&&type[3]){
            this.type = TypeEnum.MASTER;
        }else if(type[2]||type[3]){
            this.type = TypeEnum.SKILLED;
        }else if(type[1]||type[0]){
            this.type = TypeEnum.DEFICIENT;
        }else if(!type[1]&&!type[0]){
            this.type = TypeEnum.WEAK;
        }else{
            this.type = TypeEnum.AVERAGE;
        }
        
        
       
        switch(this.type){
            case WEAK:
                this.tier = TierEnum.THIRD;
                break;
            case DEFICIENT:
                this.tier = TierEnum.THIRD;
                break;
            case AVERAGE:
                this.tier = TierEnum.SECOND;
                break;
            case SKILLED:
                this.tier = TierEnum.SECOND;
                break;
            case MASTER:
                this.tier = TierEnum.FIRST;
                break;
        }
    }
    
    public Character(Character clone){
        this.company = clone.getCompany();
        this.name = clone.getName();
        this.tier = clone.getTier();
        this.type = clone.getType();
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

    /**
     * @return the type
     */
    public TypeEnum getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeEnum type) {
        this.type = type;
    }

    
    
}
