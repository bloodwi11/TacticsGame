package com.mygdx.game.engine.combat;

/* Created by Bloodwi11 on 1/15/2017. */
public abstract class Buff {

    // ==  Debuffs ==
    boolean stun; // Unable to do anything (Skipped Turn)
    boolean sleep; // Stun, but can be removed by taking damage
    boolean fear; // Moves away from target that caused fear
    boolean slow; // Half move distance
    boolean root; // Unable to move but can attack and use abilitys
    boolean silence; // Can move and attack but not use spells
    boolean disarm; // Cannot attack
    boolean blind; // Increased miss chance
    boolean pacify; // Can only make friendly actions (Heal, Buff, Use Items, Ally & Self targeting only)
    boolean daze; // Half casting speed

    //== Buffs ==
    boolean fly; // Allows the passage of all impassible terrain

    /*
    Poisoned
    Cursed


    */



    private Buff() {}
}
