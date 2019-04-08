<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
body {background: url(http://image.freepik.com/premium-vector/abstract-background-triangles-warm-texture_43969-593.jpg);
        background-size: 100%;
	 color: #282727;
	 padding: 10px;
	 padding-left: 50px;}
	 a {text-decoration: none; }
.error {color:red}
.tabs {position:absolute;left:430px; }
.tab1 {position:absolute;left:120px; }
.tab2 {position:absolute;left:270px; }
.tab3 {position:absolute;left:610px; }
.tab4 {position:absolute;left:760px; }

.left_side
      { width: 470px;
     float: left;}
.right_side
     {width:450px;
     float:left;}

</style>
</head>
<body>
<a  href="/"><font color="294428">| Tilbake | </font></a><br><br>
Bruk disse bokstavene om nødvendig: æ , ø , å <br><br>
<form:form action="svar" modelAttribute="verb">

<div class="left_side">

be(de) <span class="tab1"><form:input path="bad" size="12"/> <form:errors path="bad" cssClass="error"/></span>
       <span class="tab2"><form:input path="bedt" size="12"/> <form:errors path="bedt" cssClass="error"/></span><br>
binde  <span class="tab1"><form:input path="bandt" size="12"/> <form:errors path="bandt" cssClass="error"/></span>
       <span class="tab2"><form:input path="bundet" size="12"/> <form:errors path="bundet" cssClass="error"/></span><br>
bli    <span class="tab1"><form:input path="ble" size="12"/> <form:errors path="ble" cssClass="error"/></span>
       <span class="tab2"><form:input path="blitt" size="12"/> <form:errors path="blitt" cssClass="error"/></span><br>
brekke <span class="tab1"><form:input path="brakk" size="12"/> <form:errors path="brakk" cssClass="error"/></span>
       <span class="tab2"><form:input path="brukket" size="12"/> <form:errors path="brukket" cssClass="error"/></span><br>
brenne <span class="tab1"><form:input path="brant" size="12"/> <form:errors path="brant" cssClass="error"/></span>
       <span class="tab2"><form:input path="brent" size="12"/> <form:errors path="brent" cssClass="error"/></span><br>
briste <span class="tab1"><form:input path="brast" size="12"/> <form:errors path="brast" cssClass="error"/></span>
       <span class="tab2"><form:input path="bristet" size="12"/> <form:errors path="bristet" cssClass="error"/></span><br>
bryte  <span class="tab1"><form:input path="brøt" size="12"/> <form:errors path="brøt" cssClass="error"/></span>
       <span class="tab2"><form:input path="brutt" size="12"/> <form:errors path="brutt" cssClass="error"/></span><br>
bære   <span class="tab1"><form:input path="bar" size="12"/> <form:errors path="bar" cssClass="error"/></span>
       <span class="tab2"><form:input path="båret" size="12"/> <form:errors path="båret" cssClass="error"/></span><br>
bety   <span class="tab1"><form:input path="betødt" size="12"/> <form:errors path="betødt" cssClass="error"/></span>
       <span class="tab2"><form:input path="betydd" size="12"/> <form:errors path="betydd" cssClass="error"/></span><br>
dette  <span class="tab1"><form:input path="datt" size="12"/> <form:errors path="datt" cssClass="error"/></span>
       <span class="tab2"><form:input path="dotte" size="12"/> <form:errors path="dotte" cssClass="error"/></span><br>
dra(ge)<span class="tab1"><form:input path="dro" size="12"/> <form:errors path="dro" cssClass="error"/></span>
       <span class="tab2"><form:input path="dratt" size="12"/> <form:errors path="dratt" cssClass="error"/></span><br>
drikke <span class="tab1"><form:input path="drakk" size="12"/> <form:errors path="drakk" cssClass="error"/></span>
       <span class="tab2"><form:input path="drukket" size="12"/> <form:errors path="drukket" cssClass="error"/></span><br>
drive  <span class="tab1"><form:input path="drev" size="12"/> <form:errors path="drev" cssClass="error"/></span>
       <span class="tab2"><form:input path="drevet" size="12"/> <form:errors path="drevet" cssClass="error"/></span><br>
ete    <span class="tab1"><form:input path="åt" size="12"/> <form:errors path="åt" cssClass="error"/></span>
       <span class="tab2"><form:input path="ett" size="12"/> <form:errors path="ett" cssClass="error"/></span><br>
finne  <span class="tab1"><form:input path="fant" size="12"/> <form:errors path="fant" cssClass="error"/></span>
       <span class="tab2"><form:input path="funnet" size="12"/> <form:errors path="funnet" cssClass="error"/></span><br>
fly(ge) <span class="tab1"><form:input path="fløy" size="12"/> <form:errors path="fløy" cssClass="error"/></span>
       <span class="tab2"><form:input path="flydd" size="12"/> <form:errors path="flydd" cssClass="error"/></span><br>
flyte  <span class="tab1"><form:input path="fløt" size="12"/> <form:errors path="fløt" cssClass="error"/></span>
       <span class="tab2"><form:input path="flytt" size="12"/> <form:errors path="flytt" cssClass="error"/></span><br>
fryse  <span class="tab1"><form:input path="frøs" size="12"/> <form:errors path="frøs" cssClass="error"/></span>
       <span class="tab2"><form:input path="frosset" size="12"/> <form:errors path="frosset" cssClass="error"/></span><br>
gidde  <span class="tab1"><form:input path="gadd" size="12"/> <form:errors path="gadd" cssClass="error"/></span>
       <span class="tab2"><form:input path="giddet" size="12"/> <form:errors path="giddet" cssClass="error"/></span><br>
gråte  <span class="tab1"><form:input path="gråt" size="12"/> <form:errors path="gråt" cssClass="error"/></span>
              <span class="tab2"><form:input path="grått" size="12"/> <form:errors path="grått" cssClass="error"/></span><br><br>

<span class="tabs"><input type="submit" value="submit"></span>
</div>

<div class="right_side">

hete   <span class="tab3"><form:input path="het" size="12"/> <form:errors path="het" cssClass="error"/></span>
       <span class="tab4"><form:input path="hett" size="12"/> <form:errors path="hett" cssClass="error"/></span><br>
holde  <span class="tab3"><form:input path="holdt" size="12"/> <form:errors path="holdt" cssClass="error"/></span>
       <span class="tab4"><form:input path="holdt" size="12"/> <form:errors path="holdt" cssClass="error"/></span><br>
komme  <span class="tab3"><form:input path="kom" size="12"/> <form:errors path="kom" cssClass="error"/></span>
       <span class="tab4"><form:input path="kommet" size="12"/> <form:errors path="kommet" cssClass="error"/></span><br>
knekke <span class="tab3"><form:input path="knakk" size="12"/> <form:errors path="knakk" cssClass="error"/></span>
       <span class="tab4"><form:input path="knekket" size="12"/> <form:errors path="knekket" cssClass="error"/></span><br>
knipe  <span class="tab3"><form:input path="knep" size="12"/> <form:errors path="knep" cssClass="error"/></span>
       <span class="tab4"><form:input path="knepet" size="12"/> <form:errors path="knepet" cssClass="error"/></span><br>
la(te) <span class="tab3"><form:input path="lot" size="12"/> <form:errors path="lot" cssClass="error"/></span>
       <span class="tab4"><form:input path="latt" size="12"/> <form:errors path="latt" cssClass="error"/></span><br>
le     <span class="tab3"><form:input path="lo" size="12"/> <form:errors path="lo" cssClass="error"/></span>
       <span class="tab4"><form:input path="ledd" size="12"/> <form:errors path="ledd" cssClass="error"/></span><br>
legge  <span class="tab3"><form:input path="la" size="12"/> <form:errors path="la" cssClass="error"/></span>
       <span class="tab4"><form:input path="lagt" size="12"/> <form:errors path="lagt" cssClass="error"/></span><br>
ligge  <span class="tab3"><form:input path="lå" size="12"/> <form:errors path="lå" cssClass="error"/></span>
       <span class="tab4"><form:input path="ligget" size="12"/> <form:errors path="ligget" cssClass="error"/></span><br>
lyve   <span class="tab3"><form:input path="løy" size="12"/> <form:errors path="løy" cssClass="error"/></span>
       <span class="tab4"><form:input path="løyet" size="12"/> <form:errors path="løyet" cssClass="error"/></span><br>
nyse   <span class="tab3"><form:input path="nøs" size="12"/> <form:errors path="nøs" cssClass="error"/></span>
       <span class="tab4"><form:input path="nyst" size="12"/> <form:errors path="nyst" cssClass="error"/></span><br>
rekke  <span class="tab3"><form:input path="rakk" size="12"/> <form:errors path="rakk" cssClass="error"/></span>
       <span class="tab4"><form:input path="rukket" size="12"/> <form:errors path="rukket" cssClass="error"/></span><br>
renne  <span class="tab3"><form:input path="rant" size="12"/> <form:errors path="rant" cssClass="error"/></span>
       <span class="tab4"><form:input path="rent" size="12"/> <form:errors path="rent" cssClass="error"/></span><br>
ri(de) <span class="tab3"><form:input path="red" size="12"/> <form:errors path="red" cssClass="error"/></span>
       <span class="tab4"><form:input path="ridd" size="12"/> <form:errors path="ridd" cssClass="error"/></span><br>
rive   <span class="tab3"><form:input path="rev" size="12"/> <form:errors path="rev" cssClass="error"/></span>
       <span class="tab4"><form:input path="revet" size="12"/> <form:errors path="revet" cssClass="error"/></span><br>
sette  <span class="tab3"><form:input path="satt" size="12"/> <form:errors path="satt" cssClass="error"/></span>
       <span class="tab4"><form:input path="satt" size="12"/> <form:errors path="satt" cssClass="error"/></span><br>
sitte  <span class="tab3"><form:input path="satt" size="12"/> <form:errors path="satt" cssClass="error"/></span>
       <span class="tab4"><form:input path="sittet" size="12"/> <form:errors path="sittet" cssClass="error"/></span><br>
si     <span class="tab3"><form:input path="sa" size="12"/> <form:errors path="sa" cssClass="error"/></span>
       <span class="tab4"><form:input path="sagt" size="12"/> <form:errors path="sagt" cssClass="error"/></span><br>
skjelve <span class="tab3"><form:input path="skalv" size="12"/> <form:errors path="skalv" cssClass="error"/></span>
       <span class="tab4"><form:input path="skjelvet" size="12"/> <form:errors path="skjelvet" cssClass="error"/></span><br>
skjære <span class="tab3"><form:input path="skar" size="12"/> <form:errors path="skar" cssClass="error"/></span>
       <span class="tab4"><form:input path="skåret" size="12"/> <form:errors path="skåret" cssClass="error"/></span><br>

</div>
</form:form>
</body>
</html>
