package com.validator.quiz.model;

import javax.validation.constraints.Pattern;

public class Verb2 {


    @Pattern(regexp="\\bskled\\b",message="<feil |")
    private String skled;
    @Pattern(regexp="\\bsklidd\\b",message="<feil ")
    private String sklidd;

    @Pattern(regexp="\\bskred\\b",message="<feil |")
    private String skred;
    @Pattern(regexp="\\bskredet\\b",message="<feil ")
    private String skredet;

    @Pattern(regexp="\\bskrek\\b",message="<feil |")
    private String skrek;
    @Pattern(regexp="\\bskreket\\b",message="<feil ")
    private String skreket;

    @Pattern(regexp="\\bskrøt\\b",message="<feil |")
    private String skrøt;
    @Pattern(regexp="\\bskrytt\\b",message="<feil ")
    private String skrytt;

    @Pattern(regexp="\\bskvatt\\b",message="<feil |")
    private String skvatt;
    @Pattern(regexp="\\bskvettet\\b",message="<feil ")
    private String skvettet;

    @Pattern(regexp="\\bskjøt\\b",message="<feil |")
    private String skjøt;
    @Pattern(regexp="\\bskutt\\b",message="<feil ")
    private String skutt;

    @Pattern(regexp="\\bskjøv\\b",message="<feil |")
    private String skjøv;
    @Pattern(regexp="\\bskjøvet\\b",message="<feil ")
    private String skjøvet;

    @Pattern(regexp="\\bslangt\\b",message="<feil |")
    private String slangt;
    @Pattern(regexp="\\bslengt\\b",message="<feil ")
    private String slengt;

    @Pattern(regexp="\\bslapp\\b",message="<feil |")
    private String slapp;
    @Pattern(regexp="\\bsluppet\\b",message="<feil ")
    private String sluppet;

    @Pattern(regexp="\\bslet\\b",message="<feil |")
    private String slet;
    @Pattern(regexp="\\bslitt\\b",message="<feil ")
    private String slitt;

    @Pattern(regexp="\\bslo\\b",message="<feil |")
    private String slo;
    @Pattern(regexp="\\bslått\\b",message="<feil ")
    private String slått;

    @Pattern(regexp="\\bsmalt\\b",message="<feil |")
    private String smalt;
    @Pattern(regexp="\\bsmelt\\b",message="<feil ")
    private String smelt;

    @Pattern(regexp="\\bsmøg\\b",message="<feil |")
    private String smøg;
    @Pattern(regexp="\\bsmøget\\b",message="<feil ")
    private String smøget;

    @Pattern(regexp="\\bsnek\\b",message="<feil |")
    private String snek;
    @Pattern(regexp="\\bsneket\\b",message="<feil ")
    private String sneket;

    @Pattern(regexp="\\bsnøt\\b",message="<feil |")
    private String snøt;
    @Pattern(regexp="\\bsnytt\\b",message="<feil ")
    private String snytt;

    @Pattern(regexp="\\bsov\\b",message="<feil |")
    private String sov;
    @Pattern(regexp="\\bsovet\\b",message="<feil ")
    private String sovet;

    @Pattern(regexp="\\bsprakk\\b",message="<feil |")
    private String sprakk;
    @Pattern(regexp="\\bsprukket\\b",message="<feil ")
    private String sprukket;

    @Pattern(regexp="\\bsprang\\b",message="<feil |")
    private String sprang;
    @Pattern(regexp="\\bsprunget\\b",message="<feil ")
    private String sprunget;

    @Pattern(regexp="\\bsteg\\b",message="<feil |")
    private String steg;
    @Pattern(regexp="\\bsteget\\b",message="<feil ")
    private String steget;

    @Pattern(regexp="\\bstakk\\b",message="<feil |")
    private String stakk;
    @Pattern(regexp="\\bstukket\\b",message="<feil ")
    private String stukket;

    @Pattern(regexp="\\bstjal\\b",message="<feil |")
    private String stjal;
    @Pattern(regexp="\\bstjålet\\b",message="<feil ")
    private String stjålet;

    @Pattern(regexp="\\bstrakk\\b",message="<feil |")
    private String strakk;
    @Pattern(regexp="\\bstrukket\\b",message="<feil ")
    private String strukket;

    @Pattern(regexp="\\bsvant\\b",message="<feil |")
    private String svant;
    @Pattern(regexp="\\bsvunnet\\b",message="<feil ")
    private String svunnet;

    @Pattern(regexp="\\bsto\\b",message="<feil |")
    private String sto;
    @Pattern(regexp="\\bstått\\b",message="<feil ")
    private String stått;

    @Pattern(regexp="\\bsang\\b",message="<feil |")
    private String sang;
    @Pattern(regexp="\\bsunget\\b",message="<feil ")
    private String sunget;

    @Pattern(regexp="\\btok\\b",message="<feil |")
    private String tok;
    @Pattern(regexp="\\btatt\\b",message="<feil ")
    private String tatt;

    @Pattern(regexp="\\btalte\\b",message="<feil |")
    private String talte;
    @Pattern(regexp="\\btalt\\b",message="<feil ")
    private String talt;

    @Pattern(regexp="\\btraff\\b",message="<feil |")
    private String traff;
    @Pattern(regexp="\\btruffet\\b",message="<feil ")
    private String truffet;

    @Pattern(regexp="\\btvang\\b",message="<feil |")
    private String tvang;
    @Pattern(regexp="\\btvunget\\b",message="<feil ")
    private String tvunget;

    @Pattern(regexp="\\bvalgte\\b",message="<feil |")
    private String valgte;
    @Pattern(regexp="\\bvalgt\\b",message="<feil ")
    private String valgt;

    @Pattern(regexp="\\bville\\b",message="<feil |")
    private String ville;
    @Pattern(regexp="\\bvillet\\b",message="<feil ")
    private String villet;

    @Pattern(regexp="\\bvant\\b",message="<feil |")
    private String vant;
    @Pattern(regexp="\\bvunnet\\b",message="<feil ")
    private String vunnet;

    @Pattern(regexp="\\bvisste\\b",message="<feil |")
    private String visste;
    @Pattern(regexp="\\bvisst\\b",message="<feil ")
    private String visst;

    @Pattern(regexp="\\bvar\\b",message="<feil |")
    private String var;
    @Pattern(regexp="\\bvært\\b",message="<feil ")
    private String vært;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVillet() {
        return villet;
    }

    public void setVillet(String villet) {
        this.villet = villet;
    }

    public String getVant() {
        return vant;
    }

    public void setVant(String vant) {
        this.vant = vant;
    }

    public String getVunnet() {
        return vunnet;
    }

    public void setVunnet(String vunnet) {
        this.vunnet = vunnet;
    }

    public String getVisste() {
        return visste;
    }

    public void setVisste(String visste) {
        this.visste = visste;
    }

    public String getVisst() {
        return visst;
    }

    public void setVisst(String visst) {
        this.visst = visst;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getVært() {
        return vært;
    }

    public void setVært(String vært) {
        this.vært = vært;
    }

    public String getSang() {
        return sang;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }

    public String getSunget() {
        return sunget;
    }

    public void setSunget(String sunget) {
        this.sunget = sunget;
    }

    public String getTok() {
        return tok;
    }

    public void setTok(String tok) {
        this.tok = tok;
    }

    public String getTatt() {
        return tatt;
    }

    public void setTatt(String tatt) {
        this.tatt = tatt;
    }

    public String getTalte() {
        return talte;
    }

    public void setTalte(String talte) {
        this.talte = talte;
    }

    public String getTalt() {
        return talt;
    }

    public void setTalt(String talt) {
        this.talt = talt;
    }

    public String getTraff() {
        return traff;
    }

    public void setTraff(String traff) {
        this.traff = traff;
    }

    public String getTruffet() {
        return truffet;
    }

    public void setTruffet(String truffet) {
        this.truffet = truffet;
    }

    public String getTvang() {
        return tvang;
    }

    public void setTvang(String tvang) {
        this.tvang = tvang;
    }

    public String getTvunget() {
        return tvunget;
    }

    public void setTvunget(String tvunget) {
        this.tvunget = tvunget;
    }

    public String getValgte() {
        return valgte;
    }

    public void setValgte(String valgte) {
        this.valgte = valgte;
    }

    public String getValgt() {
        return valgt;
    }

    public void setValgt(String valgt) {
        this.valgt = valgt;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public String getStått() {
        return stått;
    }

    public void setStått(String stått) {
        this.stått = stått;
    }

    public String getStakk() {
        return stakk;
    }

    public void setStakk(String stakk) {
        this.stakk = stakk;
    }

    public String getStukket() {
        return stukket;
    }

    public void setStukket(String stukket) {
        this.stukket = stukket;
    }

    public String getStjal() {
        return stjal;
    }

    public void setStjal(String stjal) {
        this.stjal = stjal;
    }

    public String getStjålet() {
        return stjålet;
    }

    public void setStjålet(String stjålet) {
        this.stjålet = stjålet;
    }

    public String getStrakk() {
        return strakk;
    }

    public void setStrakk(String strakk) {
        this.strakk = strakk;
    }

    public String getStrukket() {
        return strukket;
    }

    public void setStrukket(String strukket) {
        this.strukket = strukket;
    }

    public String getSvant() {
        return svant;
    }

    public void setSvant(String svant) {
        this.svant = svant;
    }

    public String getSvunnet() {
        return svunnet;
    }

    public void setSvunnet(String svunnet) {
        this.svunnet = svunnet;
    }

    public String getSprakk() {
        return sprakk;
    }

    public void setSprakk(String sprakk) {
        this.sprakk = sprakk;
    }

    public String getSprukket() {
        return sprukket;
    }

    public void setSprukket(String sprukket) {
        this.sprukket = sprukket;
    }

    public String getSprang() {
        return sprang;
    }

    public void setSprang(String sprang) {
        this.sprang = sprang;
    }

    public String getSprunget() {
        return sprunget;
    }

    public void setSprunget(String sprunget) {
        this.sprunget = sprunget;
    }

    public String getSteg() {
        return steg;
    }

    public void setSteg(String steg) {
        this.steg = steg;
    }

    public String getSteget() {
        return steget;
    }

    public void setSteget(String steget) {
        this.steget = steget;
    }

    public String getSnøt() {
        return snøt;
    }

    public void setSnøt(String snøt) {
        this.snøt = snøt;
    }

    public String getSnytt() {
        return snytt;
    }

    public void setSnytt(String snytt) {
        this.snytt = snytt;
    }

    public String getSov() {
        return sov;
    }

    public void setSov(String sov) {
        this.sov = sov;
    }

    public String getSovet() {
        return sovet;
    }

    public void setSovet(String sovet) {
        this.sovet = sovet;
    }

    public String getSnek() {
        return snek;
    }

    public void setSnek(String snek) {
        this.snek = snek;
    }

    public String getSneket() {
        return sneket;
    }

    public void setSneket(String sneket) {
        this.sneket = sneket;
    }

    public String getSmøg() {
        return smøg;
    }

    public void setSmøg(String smøg) {
        this.smøg = smøg;
    }

    public String getSmøget() {
        return smøget;
    }

    public void setSmøget(String smøget) {
        this.smøget = smøget;
    }

    public String getSmalt() {
        return smalt;
    }

    public void setSmalt(String smalt) {
        this.smalt = smalt;
    }

    public String getSmelt() {
        return smelt;
    }

    public void setSmelt(String smelt) {
        this.smelt = smelt;
    }

    public String getSlo() {
        return slo;
    }

    public void setSlo(String slo) {
        this.slo = slo;
    }

    public String getSlått() {
        return slått;
    }

    public void setSlått(String slått) {
        this.slått = slått;
    }

    public String getSlet() {
        return slet;
    }

    public void setSlet(String slet) {
        this.slet = slet;
    }

    public String getSlitt() {
        return slitt;
    }

    public void setSlitt(String slitt) {
        this.slitt = slitt;
    }

    public String getSlapp() {
        return slapp;
    }

    public void setSlapp(String slapp) {
        this.slapp = slapp;
    }

    public String getSluppet() {
        return sluppet;
    }

    public void setSluppet(String sluppet) {
        this.sluppet = sluppet;
    }

    public String getSlangt() {
        return slangt;
    }

    public void setSlangt(String slangt) {
        this.slangt = slangt;
    }

    public String getSlengt() {
        return slengt;
    }

    public void setSlengt(String slengt) {
        this.slengt = slengt;
    }

    public String getSkjøv() {
        return skjøv;
    }

    public void setSkjøv(String skjøv) {
        this.skjøv = skjøv;
    }

    public String getSkjøvet() {
        return skjøvet;
    }

    public void setSkjøvet(String skjøvet) {
        this.skjøvet = skjøvet;
    }

    public String getSkjøt() {
        return skjøt;
    }

    public void setSkjøt(String skjøt) {
        this.skjøt = skjøt;
    }

    public String getSkutt() {
        return skutt;
    }

    public void setSkutt(String skutt) {
        this.skutt = skutt;
    }

    public String getSkvatt() {
        return skvatt;
    }

    public void setSkvatt(String skvatt) {
        this.skvatt = skvatt;
    }

    public String getSkvettet() {
        return skvettet;
    }

    public void setSkvettet(String skvettet) {
        this.skvettet = skvettet;
    }

    public String getSkrøt() {
        return skrøt;
    }

    public void setSkrøt(String skrøt) {
        this.skrøt = skrøt;
    }

    public String getSkrytt() {
        return skrytt;
    }

    public void setSkrytt(String skrytt) {
        this.skrytt = skrytt;
    }

    public String getSkrek() {
        return skrek;
    }

    public void setSkrek(String skrek) {
        this.skrek = skrek;
    }

    public String getSkreket() {
        return skreket;
    }

    public void setSkreket(String skreket) {
        this.skreket = skreket;
    }

    public String getSkred() {
        return skred;
    }

    public void setSkred(String skred) {
        this.skred = skred;
    }

    public String getSkredet() {
        return skredet;
    }

    public void setSkredet(String skredet) {
        this.skredet = skredet;
    }

    public String getSkled() {
        return skled;
    }

    public void setSkled(String skled) {
        this.skled = skled;
    }

    public String getSklidd() {
        return sklidd;
    }

    public void setSklidd(String sklidd) {
        this.sklidd = sklidd;
    }



}
