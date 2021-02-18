package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    public Paladin() {
        health = 100;
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
        magicAtt = 0;
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.health= hero.health-((this.physAtt-this.physAtt*hero.physDef/100));
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }

    @Override
    public void healHimself() {
        this.health+=25;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health+=10;
    }

    @Override
    public String toString() {
        return "Paladin health=" + health;
    }
    }

