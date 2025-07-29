package org.training;

public class TennisCoach implements ScoreBoard{

    SportsKit kit;

    public void setKit(SportsKit kit) { //setter based Di
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing tennis";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
