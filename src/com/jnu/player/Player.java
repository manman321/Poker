package com.jnu.player;

import com.jnu.poker.Poker;

import java.util.ArrayList;

/**
 * Created by wwt on 2016/9/14.
 */
public class Player {

    /**
     * 玩家id
     */
    private int id;

    /**
     * 玩家手中扑克牌的数量
     */
    private int pokersNum;

    /**
     * 玩家手中的扑克牌
     */
    private ArrayList<Poker> pokers;

    public Player(){

    }

    /**
     * 玩家获取扑克牌
     */
    public void obtainPoker(Poker poker){
        if(poker == null){
            return ;
        }
        if(pokers == null){
            pokers=new ArrayList<Poker>();
        }
        pokers.add(poker);
    }

    public Player(ArrayList<Poker> pokers){
        this.pokers=pokers;
    }

    public ArrayList<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<Poker> pokers) {
        this.pokers = pokers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPokersNum() {
        return pokersNum;
    }

    public void setPokersNum(int pokersNum) {
        this.pokersNum = pokersNum;
    }
}
