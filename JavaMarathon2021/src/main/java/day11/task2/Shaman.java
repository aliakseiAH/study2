package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman() {
        health = 100;
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }
    public void physicalAttack(Hero hero) {
        hero.health= hero.health-(this.physAtt-this.physAtt*hero.physDef/100);
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (this.magicAtt-this.magicAtt*hero.magicDef/100);
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }

    @Override
    public void healHimself() {
        this.health+=25;

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health+=30;
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Shaman health= " + health;
    }
}
