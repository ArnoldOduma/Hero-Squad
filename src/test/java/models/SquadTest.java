package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = Squad.setUpNewSquad();
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("Avengers",newSquad.getSquadName());
    }
    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals(5,newSquad.getSize());
    }
    @Test
    public void newSquad_getPower_String() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("Infinity Stone",newSquad.getCause());
    }
    @Test
    public void newSquad_getInstances_true() {
        Squad newSquad = Squad.setUpNewSquad();
        Squad another = Squad.setUpNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }
    @Test
    public void newSquad_getSquadMembers_Array() {
        Squad newSquad = Squad.setUpNewSquad();
        Hero newHero = Hero.setUpNewHero();
        Hero newHero1 = Hero.setUpNewHero1();
        newSquad.getSquadMembers();
        assertEquals(1,newSquad.getSquadMembers().get(0).getName());
    }
    @Test
    public void addMember_addsMemberToSquad_Hero(){
        Hero newHero = Hero.setUpNewHero();
        Hero newMember = Hero.findById(1);
         Squad.getTestSquadMembers().add(newMember);
         assertEquals(1,newMember.getId());
    }


//    @Test
//    public void newSquad_findById_id() {
//        Squad newSquad = Squad.setUpNewSquad();
//        Squad another = Squad.setUpNewSquad();
//        assertEquals(2,Squad.findById(another.getId()).getId());
//    }
}