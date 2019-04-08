package com.validator.quiz.model;

import javax.validation.constraints.Pattern;

//bean class
public class Verb1 {

    @Pattern(regexp="\\bba\\b|\\bbad\\b",message="<feil |")
    private String bad;
    @Pattern(regexp="\\bbedt\\b",message="<feil ")
    private String bedt;

    @Pattern(regexp="\\bbandt\\b",message="<feil |")
    private String bandt;
    @Pattern(regexp="\\bbundet\\b",message="<feil ")
    private String bundet;

    @Pattern(regexp="\\bble\\b",message="<feil |")
    private String ble;
    @Pattern(regexp="\\bblitt\\b",message="<feil ")
    private String blitt;

    @Pattern(regexp="\\bbrakk\\b",message="<feil |")
    private String brakk;
    @Pattern(regexp="\\bbrukket\\b",message="<feil ")
    private String brukket;

    @Pattern(regexp="\\bbrant\\b",message="<feil |")
    private String brant;
    @Pattern(regexp="\\bbrent\\b",message="<feil ")
    private String brent;

    @Pattern(regexp="\\bbrast\\b",message="<feil |")
    private String brast;
    @Pattern(regexp="\\bbristet\\b|\\bbrustet\\b",message="<feil ")
    private String bristet;

    @Pattern(regexp="\\bbrøt\\b|\\bbrøyt\\b",message="<feil |")
    private String brøt;
    @Pattern(regexp="\\bbrutt\\b",message="<feil ")
    private String brutt;

    @Pattern(regexp="\\bbar\\b",message="<feil |")
    private String bar;
    @Pattern(regexp="\\bbåret\\b",message="<feil ")
    private String båret;

    @Pattern(regexp="\\bbetødt\\b",message="<feil |")
    private String betødt;
    @Pattern(regexp="\\bbetydd\\b",message="<feil ")
    private String betydd;

    @Pattern(regexp="\\bdatt\\b",message="<feil |")
    private String datt;
    @Pattern(regexp="\\bdotte\\b|\\bdettet\\b",message="<feil ")
    private String dotte;

    @Pattern(regexp="\\bdro\\b|\\bdrog\\b",message="<feil |")
    private String dro;
    @Pattern(regexp="\\bdratt\\b",message="<feil ")
    private String dratt;

    @Pattern(regexp="\\bdrakk\\b",message="<feil |")
    private String drakk;
    @Pattern(regexp="\\bdrukket\\b",message="<feil ")
    private String drukket;

    @Pattern(regexp="\\bdrev\\b",message="<feil |")
    private String drev;
    @Pattern(regexp="\\bdrevet\\b",message="<feil ")
    private String drevet;

    @Pattern(regexp="\\båt\\b",message="<feil |")
    private String åt;
    @Pattern(regexp="\\bett\\b",message="<feil ")
    private String ett;

    @Pattern(regexp="\\bfant\\b",message="<feil |")
    private String fant;
    @Pattern(regexp="\\bfunnet\\b",message="<feil ")
    private String funnet;

    @Pattern(regexp="\\bfløy\\b",message="<feil |")
    private String fløy;
    @Pattern(regexp="\\bflydd\\b",message="<feil ")
    private String flydd;

    @Pattern(regexp="\\bfløt\\b",message="<feil |")
    private String fløt;
    @Pattern(regexp="\\bflytt\\b",message="<feil ")
    private String flytt;

    @Pattern(regexp="\\bfrøs\\b",message="<feil |")
    private String frøs;
    @Pattern(regexp="\\bfrosset\\b",message="<feil ")
    private String frosset;

    @Pattern(regexp="\\bgadd\\b",message="<feil |")
    private String gadd;
    @Pattern(regexp="\\bgiddet\\b",message="<feil ")
    private String giddet;

    @Pattern(regexp="\\bgråt\\b",message="<feil |")
    private String gråt;
    @Pattern(regexp="\\bgrått\\b",message="<feil ")
    private String grått;

    @Pattern(regexp="\\bhet\\b|\\bhette\\b",message="<feil |")
    private String het;
    @Pattern(regexp="\\bhett\\b",message="<feil ")
    private String hett;

    @Pattern(regexp="\\bholdt\\b",message="<feil |")
    private String holdt;

    @Pattern(regexp="\\bkom\\b",message="<feil |")
    private String kom;
    @Pattern(regexp="\\bkommet\\b",message="<feil ")
    private String kommet;

    @Pattern(regexp="\\bknakk\\b|\\bknekte\\b",message="<feil |")
    private String knakk;
    @Pattern(regexp="\\bknekket\\b|\\bknekt\\b",message="<feil ")
    private String knekket;

    @Pattern(regexp="\\bknep\\b",message="<feil |")
    private String knep;
    @Pattern(regexp="\\bknepet\\b",message="<feil ")
    private String knepet;

    @Pattern(regexp="\\blot\\b",message="<feil |")
    private String lot;
    @Pattern(regexp="\\blatt\\b",message="<feil ")
    private String latt;

    @Pattern(regexp="\\blo\\b",message="<feil |")
    private String lo;
    @Pattern(regexp="\\bledd\\b",message="<feil ")
    private String ledd;

    @Pattern(regexp="\\bla\\b",message="<feil |")
    private String la;
    @Pattern(regexp="\\blagt\\b",message="<feil ")
    private String lagt;

    @Pattern(regexp="\\blå\\b",message="<feil |")
    private String lå;
    @Pattern(regexp="\\bligget\\b",message="<feil ")
    private String ligget;

    @Pattern(regexp="\\bløy\\b",message="<feil |")
    private String løy;
    @Pattern(regexp="\\bløyet\\b",message="<feil ")
    private String løyet;

    @Pattern(regexp="\\bnøs\\b",message="<feil |")
    private String nøs;
    @Pattern(regexp="\\bnyst\\b",message="<feil ")
    private String nyst;

    @Pattern(regexp="\\brakk\\b",message="<feil |")
    private String rakk;
    @Pattern(regexp="\\brukket\\b",message="<feil ")
    private String rukket;

    @Pattern(regexp="\\brant\\b",message="<feil |")
    private String rant;
    @Pattern(regexp="\\brent\\b",message="<feil ")
    private String rent;

    @Pattern(regexp="\\bred\\b",message="<feil |")
    private String red;
    @Pattern(regexp="\\bridd\\b",message="<feil ")
    private String ridd;

    @Pattern(regexp="\\brev\\b",message="<feil |")
    private String rev;
    @Pattern(regexp="\\brevet\\b",message="<feil ")
    private String revet;

    @Pattern(regexp="\\bsatt\\b",message="<feil |")
    private String satt;

    @Pattern(regexp="\\bsittet\\b",message="<feil |")
    private String sittet;

    @Pattern(regexp="\\bsa\\b",message="<feil |")
    private String sa;
    @Pattern(regexp="\\bsagt\\b",message="<feil ")
    private String sagt;

    @Pattern(regexp="\\bskalv\\b",message="<feil |")
    private String skalv;
    @Pattern(regexp="\\bskjelvet\\b",message="<feil ")
    private String skjelvet;

    @Pattern(regexp="\\bskar\\b",message="<feil |")
    private String skar;
    @Pattern(regexp="\\bskåret\\b",message="<feil ")
    private String skåret;

    public String getBrant() {
        return brant;
    }

    public void setBrant(String brant) {
        this.brant = brant;
    }

    public String getBrent() {
        return brent;
    }

    public void setBrent(String brent) {
        this.brent = brent;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getBedt() {
        return bedt;
    }

    public void setBedt(String bedt) {
        this.bedt = bedt;
    }

    public String getBandt() {
        return bandt;
    }

    public void setBandt(String bandt) {
        this.bandt = bandt;
    }

    public String getBundet() {
        return bundet;
    }

    public void setBundet(String bundet) {
        this.bundet = bundet;
    }

    public String getBrakk() {
        return brakk;
    }

    public void setBrakk(String brakk) {
        this.brakk = brakk;
    }

    public String getBrukket() {
        return brukket;
    }

    public void setBrukket(String brukket) {
        this.brukket = brukket;
    }

    public String getBle() {
        return ble;
    }

    public void setBle(String ble) {
        this.ble = ble;
    }

    public String getBlitt() {
        return blitt;
    }

    public void setBlitt(String blitt) {
        this.blitt = blitt;
    }

    public String getBristet() {
        return bristet;
    }

    public void setBristet(String bristet) {
        this.bristet = bristet;
    }

    public String getBrast() {
        return brast;
    }

    public void setBrast(String brast) {
        this.brast = brast;
    }

    public String getBrøt() {
        return brøt;
    }

    public void setBrøt(String brøt) {
        this.brøt = brøt;
    }

    public String getBrutt() {
        return brutt;
    }

    public void setBrutt(String brutt) {
        this.brutt = brutt;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getBåret() {
        return båret;
    }

    public void setBåret(String båret) {
        this.båret = båret;
    }

    public String getBetødt() {
        return betødt;
    }

    public void setBetødt(String betødt) {
        this.betødt = betødt;
    }

    public String getBetydd() {
        return betydd;
    }

    public void setBetydd(String betydd) {
        this.betydd = betydd;
    }

    public String getDotte() {
        return dotte;
    }

    public void setDotte(String dotte) {
        this.dotte = dotte;
    }

    public String getDatt() {
        return datt;
    }

    public void setDatt(String datt) {
        this.datt = datt;
    }

    public String getDro() {
        return dro;
    }

    public void setDro(String dro) {
        this.dro = dro;
    }

    public String getDratt() {
        return dratt;
    }

    public void setDratt(String dratt) {
        this.dratt = dratt;
    }

    public String getDrakk() {
        return drakk;
    }

    public void setDrakk(String drakk) {
        this.drakk = drakk;
    }

    public String getDrukket() {
        return drukket;
    }

    public void setDrukket(String drukket) {
        this.drukket = drukket;
    }

    public String getDrev() {
        return drev;
    }

    public void setDrev(String drev) {
        this.drev = drev;
    }

    public String getDrevet() {
        return drevet;
    }

    public void setDrevet(String drevet) {
        this.drevet = drevet;
    }

    public String getÅt() {
        return åt;
    }

    public void setÅt(String åt) {
        this.åt = åt;
    }

    public String getEtt() {
        return ett;
    }

    public void setEtt(String ett) {
        this.ett = ett;
    }


    public String getFunnet() {
        return funnet;
    }

    public void setFunnet(String funnet) {
        this.funnet = funnet;
    }

    public String getFant() {
        return fant;
    }

    public void setFant(String fant) {
        this.fant = fant;
    }

    public String getFløy() {
        return fløy;
    }

    public void setFløy(String fløy) {
        this.fløy = fløy;
    }

    public String getFlydd() {
        return flydd;
    }

    public void setFlydd(String flydd) {
        this.flydd = flydd;
    }

    public String getFlytt() {
        return flytt;
    }

    public void setFlytt(String flytt) {
        this.flytt = flytt;
    }

    public String getFløt() {
        return fløt;
    }

    public void setFløt(String fløt) {
        this.fløt = fløt;
    }

    public String getFrosset() {
        return frosset;
    }

    public void setFrosset(String frosset) {
        this.frosset = frosset;
    }

    public String getFrøs() {
        return frøs;
    }

    public void setFrøs(String frøs) {
        this.frøs = frøs;
    }

    public String getGiddet() {
        return giddet;
    }

    public void setGiddet(String giddet) {
        this.giddet = giddet;
    }

    public String getGadd() {
        return gadd;
    }

    public void setGadd(String gadd) {
        this.gadd = gadd;
    }

    public String getGrått() {
        return grått;
    }

    public void setGrått(String grått) {
        this.grått = grått;
    }

    public String getGråt() {
        return gråt;
    }

    public void setGråt(String gråt) {
        this.gråt = gråt;
    }

    public String getHet() {
        return het;
    }

    public void setHet(String het) {
        this.het = het;
    }

    public String getHett() {
        return hett;
    }

    public void setHett(String hett) {
        this.hett = hett;
    }

    public String getHoldt() {
        return holdt;
    }

    public void setHoldt(String holdt) {
        this.holdt = holdt;
    }

    public String getKom() {
        return kom;
    }

    public void setKom(String kom) {
        this.kom = kom;
    }

    public String getKommet() {
        return kommet;
    }

    public void setKommet(String kommet) {
        this.kommet = kommet;
    }

    public String getKnakk() {
        return knakk;
    }

    public void setKnakk(String knakk) {
        this.knakk = knakk;
    }

    public String getKnekket() {
        return knekket;
    }

    public void setKnekket(String knekket) {
        this.knekket = knekket;
    }

    public String getKnep() {
        return knep;
    }

    public void setKnep(String knep) {
        this.knep = knep;
    }

    public String getKnepet() {
        return knepet;
    }

    public void setKnepet(String knepet) {
        this.knepet = knepet;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getLatt() {
        return latt;
    }

    public void setLatt(String latt) {
        this.latt = latt;
    }

    public String getLo() {
        return lo;
    }

    public void setLo(String lo) {
        this.lo = lo;
    }

    public String getLedd() {
        return ledd;
    }

    public void setLedd(String ledd) {
        this.ledd = ledd;
    }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }

    public String getLagt() {
        return lagt;
    }

    public void setLagt(String lagt) {
        this.lagt = lagt;
    }

    public String getLå() {
        return lå;
    }

    public void setLå(String lå) {
        this.lå = lå;
    }

    public String getLigget() {
        return ligget;
    }

    public void setLigget(String ligget) {
        this.ligget = ligget;
    }

    public String getLøy() {
        return løy;
    }

    public void setLøy(String løy) {
        this.løy = løy;
    }

    public String getLøyet() {
        return løyet;
    }

    public void setLøyet(String løyet) {
        this.løyet = løyet;
    }

    public String getNyst() {
        return nyst;
    }

    public void setNyst(String nyst) {
        this.nyst = nyst;
    }

    public String getNøs() {
        return nøs;
    }

    public void setNøs(String nøs) {
        this.nøs = nøs;
    }

    public String getRakk() {
        return rakk;
    }

    public void setRakk(String rakk) {
        this.rakk = rakk;
    }

    public String getRukket() {
        return rukket;
    }

    public void setRukket(String rukket) {
        this.rukket = rukket;
    }

    public String getRant() {
        return rant;
    }

    public void setRant(String rant) {
        this.rant = rant;
    }
    public String getRent() {
        return rent;
    }
    public void setRent(String rent) {
        this.rent = rent;
    }
    public String getRed() {
        return red;
    }
    public void setRed(String red) {
        this.red = red;
    }
    public String getRidd() {
        return ridd;
    }
    public void setRidd(String ridd) {
        this.ridd = ridd;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getRevet() {
        return revet;
    }

    public void setRevet(String revet) {
        this.revet = revet;
    }
    public String getSatt() {
        return satt;
    }

    public void setSatt(String satt) {
        this.satt = satt;
    }

    public String getSittet() {
        return sittet;
    }

    public void setSittet(String sittet) {
        this.sittet = sittet;
    }
    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }
    public String getSagt() {
        return sagt;
    }
    public void setSagt(String sagt) {
        this.sagt = sagt;
    }
    public String getSkar() {
        return skar;
    }

    public void setSkar(String skar) {
        this.skar = skar;
    }

    public String getSkåret() {
        return skåret;
    }

    public void setSkåret(String skåret) {
        this.skåret = skåret;
    }
    public String getSkalv() {
        return skalv;
    }

    public void setSkalv(String skalv) {
        this.skalv = skalv;
    }

    public String getSkjelvet() {
        return skjelvet;
    }

    public void setSkjelvet(String skjelvet) {
        this.skjelvet = skjelvet;
    }




}
