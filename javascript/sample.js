function clickBtn1(){
    statusDis  = setInterval(btnDisable , 1); //ボタンを押した直後に①を呼び出し
    statusAble = setInterval(btnAble , 3000); //ボタンを押して三秒後に②を呼び出し
}
function btnDisable(){ //①
    // disabled属性を設定
    document.getElementById("b1").setAttribute("disabled", true);
    document.getElementById("b1").style.color = "White";
    clearInterval(statusDis);
}
  function btnAble(){  //②
    document.getElementById("b1").removeAttribute("disabled");
    document.getElementById("b1").style.color = "black";
    clearInterval(statusAble);
}