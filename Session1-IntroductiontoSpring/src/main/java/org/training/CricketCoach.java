package org.training;

public class CricketCoach implements ScoreBoard{

    SportsKit kit;

    public CricketCoach(SportsKit kit) { // constructor based DI
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing Cricket";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
