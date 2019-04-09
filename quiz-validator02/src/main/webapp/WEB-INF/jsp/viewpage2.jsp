<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
body {background: url(http://image.freepik.com/free-vector/yellow-white-coarse-paper_53876-86279.jpg);
     background-size: 100%;
	 color: #0c0000;
	 padding: 10px;
	 padding-left: 50px;}
	 a {text-decoration: none; }
.error {color:red}
.tab1p {position:absolute;left:130px; }
.tab2p {position:absolute;left:260px; }
.tab3p {position:absolute;left:620px; }
.tab4p {position:absolute;left:770px; }
.sbtn {position:absolute;left:950px; }
.btn {outline: none;
      color: #ffffff;
      background-color: #252630;
      border: solid 1px transparent;
      border-radius: 4px;
      margin: 2px 0;
      padding: 0.5em 1em;
      display: inline-block;
      text-align: center;
      text-decoration: none;}
 .btn:hover, .btn:focus{
   color: #352612;
   border-color: currentColor;
   background-color: #a58254;
 }
 .btn::-moz-focus-inner {
   border: none;
 }
.tab1 {position:absolute;left:125px; }
.tab2 {position:absolute;left:285px; }
.tab3 {position:absolute;left:610px; }
.tab4 {position:absolute;left:770px; }

.left_side
      { width: 470px;
      font-size:20px;
     float: left;}
.right_side
     {width:450px;
     font-size:20px;
     float:left;}

</style>
</head>
<body>
<a  href="/"><font color="294428" >| Tilbake | </font></a><br>
<p style="font-size:20px; color:#3d3535; font-weight:bold; font-style:italic;">Bruk disse bokstavene om nødvendige: <span style="color: #263e77" font weight="bold">æ , ø , å </span><br>
<form:form action="svar2" modelAttribute="verb2" autocomplete="off">
<div class="left_side">

<span class="tab1p">preteritum</span>
<span class="tab2p">perfektum partisipp</span><br>
<br>
skli    <span class="tab1"><form:input path="skled" size="12"/> <form:errors path="skled" cssClass="error"/></span>
        <span class="tab2"><form:input path="sklidd" size="12"/> <form:errors path="sklidd" cssClass="error"/></span><br>
skride  <span class="tab1"><form:input path="skred" size="12"/> <form:errors path="skred" cssClass="error"/></span>
        <span class="tab2"><form:input path="skredet" size="12"/> <form:errors path="skredet" cssClass="error"/></span><br>
skrike  <span class="tab1"><form:input path="skrek" size="12"/> <form:errors path="skrek" cssClass="error"/></span>
        <span class="tab2"><form:input path="skreket" size="12"/> <form:errors path="skreket" cssClass="error"/></span><br>
skryte  <span class="tab1"><form:input path="skrøt" size="12"/> <form:errors path="skrøt" cssClass="error"/></span>
        <span class="tab2"><form:input path="skrytt" size="12"/> <form:errors path="skrytt" cssClass="error"/></span><br>
skvette <span class="tab1"><form:input path="skvatt" size="12"/> <form:errors path="skvatt" cssClass="error"/></span>
        <span class="tab2"><form:input path="skvettet" size="12"/> <form:errors path="skvettet" cssClass="error"/></span><br>
skyte   <span class="tab1"><form:input path="skjøt" size="12"/> <form:errors path="skjøt" cssClass="error"/></span>
        <span class="tab2"><form:input path="skutt" size="12"/> <form:errors path="skutt" cssClass="error"/></span><br>
skyve   <span class="tab1"><form:input path="skjøv" size="12"/> <form:errors path="skjøv" cssClass="error"/></span>
        <span class="tab2"><form:input path="skjøvet" size="12"/> <form:errors path="skjøvet" cssClass="error"/></span><br>
slenge  <span class="tab1"><form:input path="slangt" size="12"/> <form:errors path="slangt" cssClass="error"/></span>
        <span class="tab2"><form:input path="slengt" size="12"/> <form:errors path="slengt" cssClass="error"/></span><br>
slippe  <span class="tab1"><form:input path="slapp" size="12"/> <form:errors path="slapp" cssClass="error"/></span>
        <span class="tab2"><form:input path="sluppet" size="12"/> <form:errors path="sluppet" cssClass="error"/></span><br>
slite   <span class="tab1"><form:input path="slet" size="12"/> <form:errors path="slet" cssClass="error"/></span>
        <span class="tab2"><form:input path="slitt" size="12"/> <form:errors path="slitt" cssClass="error"/></span><br>
slå     <span class="tab1"><form:input path="slo" size="12"/> <form:errors path="slo" cssClass="error"/></span>
        <span class="tab2"><form:input path="slått" size="12"/> <form:errors path="slått" cssClass="error"/></span><br>
smelle  <span class="tab1"><form:input path="smalt" size="12"/> <form:errors path="smalt" cssClass="error"/></span>
        <span class="tab2"><form:input path="smelt" size="12"/> <form:errors path="smelt" cssClass="error"/></span><br>
smyge   <span class="tab1"><form:input path="smøg" size="12"/> <form:errors path="smøg" cssClass="error"/></span>
        <span class="tab2"><form:input path="smøget" size="12"/> <form:errors path="smøget" cssClass="error"/></span><br>
snyke   <span class="tab1"><form:input path="snek" size="12"/> <form:errors path="snek" cssClass="error"/></span>
        <span class="tab2"><form:input path="sneket" size="12"/> <form:errors path="sneket" cssClass="error"/></span><br>
snyte   <span class="tab1"><form:input path="snøt" size="12"/> <form:errors path="snøt" cssClass="error"/></span>
        <span class="tab2"><form:input path="snytt" size="12"/> <form:errors path="snytt" cssClass="error"/></span><br>
sove    <span class="tab1"><form:input path="sov" size="12"/> <form:errors path="sov" cssClass="error"/></span>
        <span class="tab2"><form:input path="sovet" size="12"/> <form:errors path="sovet" cssClass="error"/></span><br>
sprekke <span class="tab1"><form:input path="sprakk" size="12"/> <form:errors path="sprakk" cssClass="error"/></span>
        <span class="tab2"><form:input path="sprukket" size="12"/> <form:errors path="sprukket" cssClass="error"/></span><br>

<br>
</div>
<div class="right_side">
<span class="tab3p">preteritum</span>
<span class="tab4p">perfektum</span><br>
<br>
springe <span class="tab3"><form:input path="sprang" size="12"/> <form:errors path="sprang" cssClass="error"/></span>
        <span class="tab4"><form:input path="sprunget" size="12"/> <form:errors path="sprunget" cssClass="error"/></span><br>
stige   <span class="tab3"><form:input path="steg" size="12"/> <form:errors path="steg" cssClass="error"/></span>
        <span class="tab4"><form:input path="steget" size="12"/> <form:errors path="steget" cssClass="error"/></span><br>
stikke  <span class="tab3"><form:input path="stakk" size="12"/> <form:errors path="stakk" cssClass="error"/></span>
        <span class="tab4"><form:input path="stukket" size="12"/> <form:errors path="stukket" cssClass="error"/></span><br>
stjele  <span class="tab3"><form:input path="stjal" size="12"/> <form:errors path="stjal" cssClass="error"/></span>
        <span class="tab4"><form:input path="stjålet" size="12"/> <form:errors path="stjålet" cssClass="error"/></span><br>
strekke <span class="tab3"><form:input path="strakk" size="12"/> <form:errors path="strakk" cssClass="error"/></span>
        <span class="tab4"><form:input path="strukket" size="12"/> <form:errors path="strukket" cssClass="error"/></span><br>
svinne  <span class="tab3"><form:input path="svant" size="12"/> <form:errors path="svant" cssClass="error"/></span>
        <span class="tab4"><form:input path="svunnet" size="12"/> <form:errors path="svunnet" cssClass="error"/></span><br>
stå     <span class="tab3"><form:input path="sto" size="12"/> <form:errors path="sto" cssClass="error"/></span>
        <span class="tab4"><form:input path="stått" size="12"/> <form:errors path="stått" cssClass="error"/></span><br>
synge   <span class="tab3"><form:input path="sang" size="12"/> <form:errors path="sang" cssClass="error"/></span>
        <span class="tab4"><form:input path="sunget" size="12"/> <form:errors path="sunget" cssClass="error"/></span><br>
ta      <span class="tab3"><form:input path="tok" size="12"/> <form:errors path="tok" cssClass="error"/></span>
        <span class="tab4"><form:input path="tatt" size="12"/> <form:errors path="tatt" cssClass="error"/></span><br>
telle   <span class="tab3"><form:input path="talte" size="12"/> <form:errors path="talte" cssClass="error"/></span>
        <span class="tab4"><form:input path="talt" size="12"/> <form:errors path="talt" cssClass="error"/></span>

        <span class="sbtn"><button type="btn" class="btn" value="submit" >Sjekk</button></span><br>

treffe  <span class="tab3"><form:input path="traff" size="12"/> <form:errors path="traff" cssClass="error"/></span>
        <span class="tab4"><form:input path="truffet" size="12"/> <form:errors path="truffet" cssClass="error"/></span><br>
tvinge  <span class="tab3"><form:input path="tvang" size="12"/> <form:errors path="tvang" cssClass="error"/></span>
        <span class="tab4"><form:input path="tvunget" size="12"/> <form:errors path="tvunget" cssClass="error"/></span><br>
velge   <span class="tab3"><form:input path="valgte" size="12"/> <form:errors path="valgte" cssClass="error"/></span>
        <span class="tab4"><form:input path="valgt" size="12"/> <form:errors path="valgt" cssClass="error"/></span><br>
ville   <span class="tab3"><form:input path="ville" size="12"/> <form:errors path="ville" cssClass="error"/></span>
        <span class="tab4"><form:input path="villet" size="12"/> <form:errors path="villet" cssClass="error"/></span><br>
vinne   <span class="tab3"><form:input path="vant" size="12"/> <form:errors path="vant" cssClass="error"/></span>
        <span class="tab4"><form:input path="vunnet" size="12"/> <form:errors path="vunnet" cssClass="error"/></span><br>
vite    <span class="tab3"><form:input path="visste" size="12"/> <form:errors path="visste" cssClass="error"/></span>
        <span class="tab4"><form:input path="visst" size="12"/> <form:errors path="visst" cssClass="error"/></span><br>
være    <span class="tab3"><form:input path="var" size="12"/> <form:errors path="var" cssClass="error"/></span>
        <span class="tab4"><form:input path="vært" size="12"/> <form:errors path="vært" cssClass="error"/></span><br>

</div>
</form:form>
</body>
</html>