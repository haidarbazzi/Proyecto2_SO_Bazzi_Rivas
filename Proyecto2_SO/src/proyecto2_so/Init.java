/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so;

import proyecto2_so.Disk.Buffer;
import proyecto2_so.Enum.CompanyEnum;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;
import proyecto2_so.System.Administrator;
import proyecto2_so.System.Processor;
/**
 *
 * @author andre
 */
public class Init {
    MainWindow main;
    
    public Init(MainWindow main){
        this.main = main;
    }
    
    public void init(){
        
        Buffer buffer = new Buffer();
        createCharacters(buffer);
        Administrator admin = new Administrator(buffer, main, 39);
        Processor proc = new Processor(buffer, main);
        
        for (int i = 0; i < 19; i++) {
            proc.movetoQueue(buffer.getNickCharacters()[i]);
            proc.movetoQueue(buffer.getCartoonCharacters()[i]);
        }
        System.out.println(admin.getBuffer());
        System.out.println(proc.getBuffer());
        
        admin.updateWindow();
        proc.start();
       
        admin.start();
        
       
      
        
        
        
    
    }
    
    
    public void createCharacters(Buffer buffer){
    
       buffer.getNickCharacters()[0] = new Character("Appa",0, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Appa.png");
       buffer.getNickCharacters()[1] = new Character("Azula",1, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Azula.png");
       buffer.getNickCharacters()[2] = new Character("Hakoda",2, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Hakoda.png");
       buffer.getNickCharacters()[3] = new Character("Iroh",3, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Iroh.png");
       buffer.getNickCharacters()[4] = new Character("Katara",4, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Katara.png");
       buffer.getNickCharacters()[5] = new Character("Momo",5, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Momo.png");
       buffer.getNickCharacters()[6] = new Character("Ozai",6, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Ozai.png");
       buffer.getNickCharacters()[7] = new Character("Pakku",7, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Pakku.png");
       buffer.getNickCharacters()[8] = new Character("Piandao",8, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Piandao.png");
       buffer.getNickCharacters()[9] = new Character("Pipsqueak",9, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Pipsqueak.png");
       buffer.getNickCharacters()[10] = new Character("Princess Azula",10, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\PrincessAzula.png");
       buffer.getNickCharacters()[11] = new Character("Roku",11, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Roku.png");
       buffer.getNickCharacters()[12] = new Character("Toph",12, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Toph.png");
       buffer.getNickCharacters()[13] = new Character("Ty Lee",13, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\TyLee.png");
       buffer.getNickCharacters()[14] = new Character("Wan Shi Tong",14, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\WanShiTong.png");
       buffer.getNickCharacters()[15] = new Character("Yue",15, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Yue.png");
       buffer.getNickCharacters()[16] = new Character("Zuko",16, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Zuko.png");
       buffer.getNickCharacters()[17] = new Character("Sokka",17, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Sokka.png");
       buffer.getNickCharacters()[18] = new Character("Aang",18, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Aang.png");
       buffer.getNickCharacters()[19] = new Character("Suki",19, CompanyEnum.NICKELODEON, "src\\proyecto2_so\\NickImages\\Suki.png");
       
       
       buffer.getCartoonCharacters()[0] = new Character("Benson",20, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Benson.png");
       buffer.getCartoonCharacters()[1] = new Character("Bobby",21, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Bobby.png");
       buffer.getCartoonCharacters()[2] = new Character("Cloudy2",22, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Cloudy2.png");
       buffer.getCartoonCharacters()[3] = new Character("DeathRS",23, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\DeathRS.png");
       buffer.getCartoonCharacters()[4] = new Character("Eileen",24, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Eileen.png");
       buffer.getCartoonCharacters()[5] = new Character("Grand Master",25, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Grand_Master.png");
       buffer.getCartoonCharacters()[6] = new Character("Herb",26, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Herb.png");
       buffer.getCartoonCharacters()[7] = new Character("HiFive",27, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\HiFive.png");
       buffer.getCartoonCharacters()[8] = new Character("Margaret",28, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Margaret.png");
       buffer.getCartoonCharacters()[9] = new Character("Mordecai",29, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Mordecai.png");
       buffer.getCartoonCharacters()[10] = new Character("Mr. Maellard",30, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\MrMaellard.png");
       buffer.getCartoonCharacters()[11] = new Character("Muscle Bro 2",31, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\MuscleBro2.png");
       buffer.getCartoonCharacters()[12] = new Character("Muscle Man",32, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\MuscleMan.png");
       buffer.getCartoonCharacters()[13] = new Character("Pops",33, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Pops.png");
       buffer.getCartoonCharacters()[14] = new Character("Sensai",34, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Sensai.png");
       buffer.getCartoonCharacters()[15] = new Character("Skips",35, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Skips.png");
       buffer.getCartoonCharacters()[16] = new Character("Staria",36, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Staria.png");
       buffer.getCartoonCharacters()[17] = new Character("Thomas 2",37, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Thomas2.png");
       buffer.getCartoonCharacters()[18] = new Character("Rigby",38, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Rigby.png");
       buffer.getCartoonCharacters()[19] = new Character("Roxy",39, CompanyEnum.CARTOONNETWORK, "src\\proyecto2_so\\CartoonImages\\Roxy.png");
    
    
    }
    
}
