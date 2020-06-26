package com.shobu.model;

public class MatchVO {
	private String date;
	private String time;
	private String home;
	private String homeImg;
	private double homeRatio;
	private String away;
	private String awayImg;
	private double awayRatio;
	private String homePitcher;
	private String awayPitcher;
	private String place;
	//선발투수경기수 승패 이닝 ERA추가
	
	public MatchVO() {}
	
	public MatchVO(String date, String time, String home, String away,
			String homePitcher, String awayPitcher, String place) {
		super();
		this.date = date;
		this.time = time;
		this.home = home;
		this.away = away;
		this.homePitcher = homePitcher;
		this.awayPitcher = awayPitcher;
		this.place = place;
	}
	
	public MatchVO(String date, String time, String home, String homeImg, double homeRatio, String away, String awayImg,
			double awayRatio, String homePitcher, String awayPitcher, String place) {
		super();
		this.date = date;
		this.time = time;
		this.home = home;
		this.homeImg = homeImg;
		this.homeRatio = homeRatio;
		this.away = away;
		this.awayImg = awayImg;
		this.awayRatio = awayRatio;
		this.homePitcher = homePitcher;
		this.awayPitcher = awayPitcher;
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	public String getHomePitcher() {
		return homePitcher;
	}

	public void setHomePitcher(String homePitcher) {
		this.homePitcher = homePitcher;
	}

	public String getAwayPitcher() {
		return awayPitcher;
	}

	public void setAwayPitcher(String awayPitcher) {
		this.awayPitcher = awayPitcher;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHomeImg() {
		return homeImg;
	}

	public void setHomeImg(String homeImg) {
		this.homeImg = homeImg;
	}

	public String getAwayImg() {
		return awayImg;
	}

	public void setAwayImg(String awayImg) {
		this.awayImg = awayImg;
	}

	public double getHomeRatio() {
		return homeRatio;
	}

	public void setHomeRatio(double homeRatio) {
		this.homeRatio = homeRatio;
	}

	public double getAwayRatio() {
		return awayRatio;
	}

	public void setAwayRatio(double awayRatio) {
		this.awayRatio = awayRatio;
	}

	@Override
	public String toString() {
		return "MatchVO [date=" + date + ", time=" + time + ", home=" + home + ", homeImg=" + homeImg + ", homeRatio="
				+ homeRatio + ", away=" + away + ", awayImg=" + awayImg + ", awayRatio=" + awayRatio + ", homePitcher="
				+ homePitcher + ", awayPitcher=" + awayPitcher + ", place=" + place + "]";
	}

	
	
}
